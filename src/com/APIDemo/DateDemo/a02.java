package com.APIDemo.DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a02 {
    public static void main(String[] args) throws ParseException {
        /*需求:秒杀活动: 2023年11月11日00:00:00(毫秒值)
              开始时间: 2023年11月11日00:10:00(毫秒值)
               小贾下单并付款的时间为: 2023年11月11日 00:01:00
                小皮下单并付款的时间为: 2@23年11月11日 00:11:00
                用代码说明这两位同学有没有参加上秒杀活动?*/
        String start = "2023年11月11日00:00:00";
        String end = "2023年11月11日00:10:00";
        String xiaojia = "2023年11月11日00:01:00";
        String xiaopi = "2023年11月11日00:11:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date startDate = sdf.parse(start);
        Date endDate = sdf.parse(end);
        Date xiaojiaDate = sdf.parse(xiaojia);
        Date xiaopiDate = sdf.parse(xiaopi);

        long starttime = startDate.getTime();
        long endtime = endDate.getTime();
        long xiaojiatime = xiaojiaDate.getTime();
        long xiaopitime = xiaopiDate.getTime();
        if (xiaojiatime >= starttime && xiaojiatime <= endtime) {
            System.out.println("秒杀成功");
        }
    }
}
