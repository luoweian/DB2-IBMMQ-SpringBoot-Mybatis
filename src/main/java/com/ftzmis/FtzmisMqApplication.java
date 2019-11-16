package com.ftzmis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 11:43
 * @Version 1.0
 */
@MapperScan(basePackages = {"com.ftzmis.mq.mapper"})//接口所在的全限定名
@ImportResource("classpath:applicationContext.xml")
@SpringBootApplication
@EnableSwagger2
public class FtzmisMqApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(FtzmisMqApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FtzmisMqApplication.class);
    }
}
