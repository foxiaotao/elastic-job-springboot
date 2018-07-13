package com.foxiaotao.test.elasticjobspringbootstarter.config;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import com.dangdang.elasticjob.lite.annotation.ElasticSimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created with suntao on 2018/7/12
 */
@Component
@Slf4j
@ElasticSimpleJob(cron="* * * * * ?",jobName="test123",shardingTotalCount=2,jobParameter="测试参数",shardingItemParameters="0=A,1=B")
public class MySimpleJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        log.info("itemId={}", shardingContext.getShardingItem());
    }
}
