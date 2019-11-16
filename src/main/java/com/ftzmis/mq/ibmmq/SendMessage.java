package com.ftzmis.mq.ibmmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Component;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/14 14:18
 * @Version 1.0
 */
@Component
@Slf4j
public class SendMessage {
    @Autowired
    JmsOperations jmsOperations;
    @Value("${ibmMqR.sendQueue}")
    private String sendQueue;


    public void send(String message){
        log.info("开始往IBM-MQ: "+ sendQueue + " 发送消息。。。");
        jmsOperations.convertAndSend(sendQueue, message);
    }

}
