package com.ftzmis.mq.service;

import com.ftzmis.mq.model.TGetMess;

import java.util.List;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 16:00
 * @Version 1.0
 */
public interface TGetMessService {
    int insertReturnMessage(TGetMess tGetMess);

    List<TGetMess> queryAll();

    int delete();
}
