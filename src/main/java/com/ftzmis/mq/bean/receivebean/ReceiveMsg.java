package com.ftzmis.mq.bean.receivebean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 15:16
 * @Version 1.0
 */
@Getter
@XStreamAlias("MSG")
public class ReceiveMsg {
    @XStreamAlias("RETURN")
    private ReturnMsg returnMsg;
}
