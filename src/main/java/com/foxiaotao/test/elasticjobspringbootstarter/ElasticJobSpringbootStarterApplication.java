package com.foxiaotao.test.elasticjobspringbootstarter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.foxiaotao.test.elasticjobspringbootstarter.dao")
public class ElasticJobSpringbootStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticJobSpringbootStarterApplication.class, args);
    }
}
