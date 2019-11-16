package com.ftzmis.mq.bean.receivebean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 15:19
 * @Version 1.0
 */
@Getter
@XStreamAlias("CFX")
public class ReceiveCfx {
    @XStreamAlias("HEAD")
    private ReceiveHead receiveHead;
    @XStreamAlias("MSG")
    private ReceiveMsg receiveMsg;
}
