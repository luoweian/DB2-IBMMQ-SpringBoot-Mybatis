package com.ftzmis.mq.model;

import lombok.Data;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 15:35
 * @Version 1.0
 */
@Data
public class TGetMess implements Serializable {
    private static final long serialVersionUID = -7290686601342798358L;
    private String areaNo    ;
    private Date submitDate;
    private Date revDate   ;
    private Time revTime   ;
    private String reportNo  ;
    private String regNumb   ;
    private String resultCode;
    private String resultMess;
    private String xmlContent;
}
