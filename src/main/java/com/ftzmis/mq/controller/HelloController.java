package com.ftzmis.mq.controller;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/15 10:02
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/hello")
@Api(value = "Hello World", tags = "Hello World")
public class HelloController {


    @GetMapping("/get")
    public String  get() {
        log.trace("trace查询了学生信息");
        log.info("info查询了学生信息");
        log.warn("warn查询了学生信息");
        log.error("erro查询了学生信息");
        log.debug("debug查询了学生信息");
        return "get";
    }
}
