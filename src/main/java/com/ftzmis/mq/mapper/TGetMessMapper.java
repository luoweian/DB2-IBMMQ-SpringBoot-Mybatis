package com.ftzmis.mq.mapper;

import com.ftzmis.mq.model.TGetMess;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 15:40
 * @Version 1.0
 */
@Repository
public interface TGetMessMapper {
    int insertReturnMessage(TGetMess tGetMess);

    List<TGetMess> queryAll();

    int delete();
}
