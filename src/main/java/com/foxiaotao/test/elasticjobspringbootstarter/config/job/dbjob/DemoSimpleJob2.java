package com.foxiaotao.test.elasticjobspringbootstarter.config.job.dbjob;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;

/**
 * Created with suntao on 2019/3/19
 */
@Slf4j
public class DemoSimpleJob2 implements SimpleJob {
    @Override
    public void execute(ShardingContext shardingContext) {
        log.info("job222 is working");
    }
}
