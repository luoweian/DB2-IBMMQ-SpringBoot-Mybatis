package com.ftzmis.mq.bean;

import com.alibaba.fastjson.JSON;
import com.ftzmis.mq.enumerate.ResponseCode;
import lombok.Data;


/**
 * @Author: WILLIAM
 * @Date: 2019/7/24 19:40
 * @Version 1.0
 */
@Data
public class ResponseMessage {

    public ResponseMessage(ResponseCode responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = "";
    }

    public ResponseMessage(ResponseCode responseCode, JSON data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }

    public ResponseMessage(ResponseCode responseCode, Object data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }
    /**
     * 响应码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应具体数据
     */
    private Object data;

    /**
     * 响应额外信息
     */
//    private Object extra;

    /**
     * 页号
     */
//    private Integer pageNum;

    /**
     * 分页大小
     */
//    private Integer pageSize;

    /**
     * 总条数
     */
//    private Integer totalSize;

    /**
     * 设置响应信息
     * @param responseCode 前端RESTful返回信息的响应码
     * @return 返回当前对象
     */
    public ResponseMessage setResponseCode(ResponseCode responseCode) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        return this;
    }

}
