package com.foxiaotao.test.elasticjobspringbootstarter.config;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.simple.SimpleJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created with suntao on 2018/7/12
 */
@Component
@Slf4j

public class MySimpleJob implements SimpleJob {

    @Override
    public void execute(ShardingContext shardingContext) {

    }
}
