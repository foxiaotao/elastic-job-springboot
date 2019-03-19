package com.foxiaotao.test.elasticjobspringbootstarter.controller;

import com.dangdang.ddframe.job.config.JobCoreConfiguration;
import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
import com.dangdang.ddframe.job.lite.api.JobScheduler;
import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import com.foxiaotao.test.elasticjobspringbootstarter.config.job.dynamic.DynamicSimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created with suntao on 2018/7/12
 */
@RestController
@Slf4j
public class DynamicJobController {


    @Resource(name = "zookeeperRegistryCenter")
    private ZookeeperRegistryCenter zookeeperRegistryCenter;

    @RequestMapping("/dynamic_job")
    public String home(){

        int shardingTotalCount = 2;
        String jobName = UUID.randomUUID().toString() + "-test";
        JobCoreConfiguration jobCoreConfiguration = JobCoreConfiguration.newBuilder(jobName, "* * * * * ?", shardingTotalCount).shardingItemParameters("0=A,1=B").build();

        SimpleJobConfiguration simpleJobConfiguration = new SimpleJobConfiguration(jobCoreConfiguration, DynamicSimpleJob.class.getCanonicalName());

        JobScheduler jobScheduler = new JobScheduler(zookeeperRegistryCenter, LiteJobConfiguration.newBuilder(simpleJobConfiguration).build());
        try {
            jobScheduler.init();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("定时任务创建失败");
        }

        return "success";
    }
}
