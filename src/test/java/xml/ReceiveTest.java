package xml;

import com.ftzmis.mq.bean.receivebean.ReceiveCfx;
import com.thoughtworks.xstream.XStream;

/**
 * @Author: WILLIAM
 * @Date: 2019/11/12 15:26
 * @Version 1.0
 */
public class ReceiveTest {
    public static void main(String[] args) {
        String s = "<?xml version=\"1.0\" encoding=\"GBK\" standalone=\"yes\"?>\n" +
                "<CFX>\n" +
                "    <HEAD>\n" +
                "        <VER>2.0</VER>\n" +
                "        <SRC>100000000000</SRC>\n" +
                "        <DES>308110023010</DES>\n" +
                "        <APP>FTZMIS</APP>\n" +
                "        <MsgNo>910101</MsgNo>\n" +
                "        <MsgID>308110023010180905210207000001</MsgID>\n" +
                "        <MsgRef>308110023010180905210207000001</MsgRef>\n" +
                "        <WorkDate>20180905</WorkDate>\n" +
                "        <EditFlag>1</EditFlag>\n" +
                "        <Reserve>String</Reserve>\n" +
                "    </HEAD>\n" +
                "    <MSG>\n" +
                "        <RETURN>\n" +
                "            <AddWord>所属报文编号:210207记录账号 :FTE12290666666,明细序号为:000001中的:交易性质取值非法,请核实数据再上报！</AddWord>\n" +
                "            <MsgNo>210207</MsgNo>\n" +
                "            <Result>92002</Result>\n" +
                "        </RETURN>\n" +
                "    </MSG>\n" +
                "</CFX>\n";
        XStream xStream = new XStream();
        xStream.processAnnotations(ReceiveCfx.class);
        ReceiveCfx cfx = (ReceiveCfx) xStream.fromXML(s);
        System.out.println(cfx.getReceiveHead().getApp());
        System.out.println(cfx.getReceiveHead().getEditFlag());
        System.out.println(cfx.getReceiveMsg().getReturnMsg().getAddWord());
    }
}
