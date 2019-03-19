package com.foxiaotao.test.elasticjobspringbootstarter.config.job.dynamic;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;

/**
 * Created with suntao on 2018/7/12
 */
@Slf4j
public class DynamicSimpleJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {
        log.info("itemId={}", shardingContext.getShardingItem());
    }
}
