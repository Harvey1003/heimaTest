package com.APIDemo.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a02 {
    public static void main(String[] args) throws ParseException {
        /*����:��ɱ�: 2023��11��11��00:00:00(����ֵ)
              ��ʼʱ��: 2023��11��11��00:10:00(����ֵ)
               С���µ��������ʱ��Ϊ: 2023��11��11�� 00:01:00
                СƤ�µ��������ʱ��Ϊ: 2@23��11��11�� 00:11:00
                �ô���˵������λͬѧ��û�вμ�����ɱ�?*/
        String start = "2023��11��11��00:00:00";
        String end = "2023��11��11��00:10:00";
        String xiaojia = "2023��11��11��00:01:00";
        String xiaopi = "2023��11��11��00:11:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��HH:mm:ss");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date xiaojiaDate = sdf.parse(xiaojia);
        Date xiaopiDate = sdf.parse(xiaopi);

        long starttime = startDate.getTime();
        long endtime = endDate.getTime();
        long xiaojiatime = xiaojiaDate.getTime();
        long xiaopitime = xiaopiDate.getTime();
        if (xiaojiatime >= starttime && xiaojiatime <= endtime) {
            System.out.println("��ɱ�ɹ�");
        }
    }
}
