package com.foxiaotao.test.elasticjobspringbootstarter.config.job;

import com.dangdang.ddframe.job.api.ElasticJob;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.JobTypeConfiguration;
import com.dangdang.ddframe.job.config.dataflow.DataflowJobConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.event.JobEventConfiguration;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import com.foxiaotao.test.elasticjobspringbootstarter.dao.ElasticJobConfigMapper;
import com.foxiaotao.test.elasticjobspringbootstarter.entity.ElasticJobConfig;
import com.foxiaotao.test.elasticjobspringbootstarter.entity.ElasticJobConfigExample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

/**
 * Created with suntao on 2019/3/19
 */
@Slf4j
@Component
public class ElasticJobLoader implements CommandLineRunner {

    @Autowired
    private ElasticJobConfigMapper elasticJobConfigMapperDao;

    @Resource
    private ZookeeperRegistryCenter zookeeperRegistryCenter;

    @Resource
    private JobEventConfiguration jobEventConfiguration;


    public void selectAllJob(){
        ElasticJobConfig elasticJobConfig = elasticJobConfigMapperDao.selectByPrimaryKey(1);
        log.info("job-entity:{}", elasticJobConfig.getCron());
    }

    @Override
    public void run(String... args) throws Exception {
        selectAllJob();

        ElasticJobConfigExample example = new ElasticJobConfigExample();
        example.createCriteria().andIdIsNotNull();
        List<ElasticJobConfig> elasticJobConfigList = elasticJobConfigMapperDao.selectByExample(example);
        if (elasticJobConfigList == null || elasticJobConfigList.size() == 0) {
            return;
        }
        elasticJobConfigList.forEach(elasticJobConfig -> {
            registryJob(elasticJobConfig);
        });
        log.info("所有定时任务加载完成");
    }
    private void registryJob(ElasticJobConfig elasticJobConfigBean) {
        try {
            Class<? extends ElasticJob> jobClass = (Class<? extends ElasticJob>) Class
                    .forName(elasticJobConfigBean.getJobClass());
            ElasticJob elasticJob = getInstance(jobClass);
            SpringJobScheduler jobScheduler = jobScheduler(elasticJob, jobClass, elasticJobConfigBean);
            jobScheduler.init();
            log.info("初始化定时任务 {} ", elasticJobConfigBean.toString());
        } catch (Exception e) {
            log.error("注册Job出错：{} ", elasticJobConfigBean.toString(), e);
        }

    }


    /**
     * 通过反射对有@Resource和@Autowired的属性赋值
     *
     * @param jobClass
     * @return
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    private ElasticJob getInstance(Class<? extends ElasticJob> jobClass)
            throws InstantiationException, IllegalAccessException {
        Field[] declaredFields = jobClass.getDeclaredFields();
        ElasticJob newInstance = jobClass.newInstance();
//        for (Field field : declaredFields) {
//            Annotation[] annotations = field.getAnnotations();
//            if (annotations == null || annotations.length == 0) {
//                continue;
//            }
//            boolean flag = false;
//            for (Annotation annotation : annotations) {
//                Class<? extends Annotation> annotationType = annotation.annotationType();
//                if (annotationType.equals(Resource.class) || annotationType.equals(Autowired.class)) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (flag) {
//                field.setAccessible(true);
//                field.set(newInstance, BeanTools.getBean(field.getType()));
//            }
//        }
        return newInstance;
    }

    /**
     * 注册SpringJobScheduler
     *
     * @param elasticJob
     * @param jobClass
     * @param elasticJobConfigBean
     * @return
     */
    private SpringJobScheduler jobScheduler(ElasticJob elasticJob, Class<? extends ElasticJob> jobClass,
                                            ElasticJobConfig elasticJobConfigBean) {
        LiteJobConfiguration build = LiteJobConfiguration.newBuilder(jobConfiguration(elasticJob, elasticJobConfigBean))
                .overwrite(true).build();
        SpringJobScheduler springJobScheduler = new SpringJobScheduler(elasticJob, zookeeperRegistryCenter, build,
                jobEventConfiguration);
        return springJobScheduler;
    }

    /**
     * job配置
     *
     * @param elasticJob
     * @param elasticJobConfigBean
     * @return
     */
    private JobTypeConfiguration jobConfiguration(final ElasticJob elasticJob,
                                                  ElasticJobConfig elasticJobConfigBean) {
        JobCoreConfiguration jobCoreConfiguration = JobCoreConfiguration
                .newBuilder(elasticJobConfigBean.getJobName(), elasticJobConfigBean.getCron(),
                        elasticJobConfigBean.getShardingTotalCount())
                .shardingItemParameters(elasticJobConfigBean.getShardingItemParameters())
                .misfire(Boolean.valueOf(elasticJobConfigBean.getMisfire()))
                .description(elasticJobConfigBean.getDescription())
                .failover(Boolean.valueOf(elasticJobConfigBean.getFailover()))
                .jobParameter(elasticJobConfigBean.getJobParameter())
                .build();
        if (elasticJob instanceof SimpleJob) {
            return new SimpleJobConfiguration(jobCoreConfiguration, elasticJob.getClass().getCanonicalName());
        }
        if (elasticJob instanceof DataflowJob) {
            return new DataflowJobConfiguration(jobCoreConfiguration, elasticJob.getClass().getCanonicalName(),
                    Boolean.valueOf(elasticJobConfigBean.getStreamingProcess()));
        }
        throw new RuntimeException("未知类型定时任务：" + elasticJob.getClass().getName());
    }


}
