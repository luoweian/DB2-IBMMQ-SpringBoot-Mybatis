package com.ftzmis.mq.bean.receivebean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 15:18
 * @Version 1.0
 */
@Getter
@XStreamAlias("RETURN")
public class ReturnMsg {

    @XStreamAlias("AddWord")
    private String addWord;
    @XStreamAlias("MsgNo")
    private String msgNo;
    @XStreamAlias("Result")
    private String result;

}
