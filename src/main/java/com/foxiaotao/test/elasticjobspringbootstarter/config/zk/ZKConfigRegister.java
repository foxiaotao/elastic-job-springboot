package com.foxiaotao.test.elasticjobspringbootstarter.config.zk;

import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with suntao on 2018/7/13
 */
@Configuration
public class ZKConfigRegister {


    @Bean(initMethod = "init", name = "zookeeperRegistryCenter")
    public ZookeeperRegistryCenter zookeeperRegistryCenter(@Value("${elaticjob.zookeeper.server-lists}")final String zkServerList, @Value("${elaticjob.zookeeper.namespace}") final String namespace) {
        return new ZookeeperRegistryCenter(new ZookeeperConfiguration(zkServerList, namespace));
    }
}
