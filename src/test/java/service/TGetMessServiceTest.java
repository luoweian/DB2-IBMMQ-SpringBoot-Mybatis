package service;

import com.ftzmis.FtzmisMqApplication;
import com.ftzmis.mq.model.TGetMess;
import com.ftzmis.mq.service.TGetMessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Time;
import java.util.Date;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 16:01
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FtzmisMqApplication.class)
public class TGetMessServiceTest {

    @Autowired
    private TGetMessService tGetMessService;

    @Test
    public void insertReturnMessage(){
        tGetMessService.delete();
        TGetMess tGetMess = new TGetMess();

        tGetMess.setAreaNo("666");
        tGetMess.setRegNumb("666");
        tGetMess.setReportNo("666");
        tGetMess.setResultCode("666");
        tGetMess.setResultMess("666");
        tGetMess.setRevDate(new Date());
        tGetMess.setRevTime(new Time(System.currentTimeMillis()));
        tGetMess.setSubmitDate(new Date());
        tGetMess.setXmlContent("666");
        tGetMessService.insertReturnMessage(tGetMess);
    }

    @Test
    public void queryAll(){
        tGetMessService.queryAll();
    }
}
