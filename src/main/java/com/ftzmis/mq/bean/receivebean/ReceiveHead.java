package com.ftzmis.mq.bean.receivebean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Getter;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 14:57
 * @Version 1.0
 */
@Getter
@XStreamAlias("HEAD")
public class ReceiveHead {

    @XStreamAlias("VER")
    private String ver;
    @XStreamAlias("SRC")
    private String src;
    @XStreamAlias("DES")
    private String des;
    @XStreamAlias("APP")
    private String app;
    @XStreamAlias("MsgNo")
    private String msgNo;
    @XStreamAlias("MsgID")
    private String msgID;
    @XStreamAlias("MsgRef")
    private String msgRef;
    @XStreamAlias("WorkDate")
    private String workDate;
    @XStreamAlias("EditFlag")
    private String editFlag;
    @XStreamAlias("Reserve")
    private String reserve;

}
