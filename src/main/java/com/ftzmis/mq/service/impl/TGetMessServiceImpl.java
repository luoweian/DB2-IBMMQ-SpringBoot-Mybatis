package com.ftzmis.mq.service.impl;

import com.ftzmis.mq.mapper.TGetMessMapper;
import com.ftzmis.mq.model.TGetMess;
import com.ftzmis.mq.service.TGetMessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 16:00
 * @Version 1.0
 */
@Service
public class TGetMessServiceImpl implements TGetMessService {

    @Autowired
    private TGetMessMapper tGetMessMapper;
    @Override
    public int insertReturnMessage(TGetMess tGetMess) {
        return tGetMessMapper.insertReturnMessage(tGetMess);
    }

    @Override
    public List<TGetMess> queryAll() {
        return tGetMessMapper.queryAll();
    }

    @Override
    public int delete() {
        return tGetMessMapper.delete();
    }
}
