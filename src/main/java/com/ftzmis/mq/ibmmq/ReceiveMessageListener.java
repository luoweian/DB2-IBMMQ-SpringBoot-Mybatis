package com.ftzmis.mq.ibmmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/14 10:59
 * @Version 1.0
 */
@Slf4j
@Component
public class ReceiveMessageListener extends MessageListenerAdapter {

    @JmsListener(destination = "${ibmMqR.accQueue}")
    @Override
    public void onMessage(Message message, Session session) {
        String msgStr;
        try {  //JmsListener收到消息后，会自动封装成自己特有的数据格式，可以用TextMessage来解析原始消息
            TextMessage msg = (TextMessage) message;
            msgStr = msg.getText();
            log.info(msgStr);
        } catch (JMSException e) {
            log.error("消息接收异常！", e);
        }
    }



}
