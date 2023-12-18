package com.APIDemo.DateDemo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class a04 {
    public static void main(String[] args) {
        //static Instant now()获取当前时间的Instant对象 (标准时间)
        Instant now = Instant.now();
        System.out.println(now);
        //static Instant ofXxxx(long epochMilli)根据(秒/毫秒/纳秒) 获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(1L);
        System.out.println(instant1);
        //ZonedDateTime atZone(ZoneId zone)指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);
        //boolean isXxx(Instant otherInstant)判断系列的方法
        Instant instant2 = Instant.ofEpochMilli(1000L);
        //判断调用者的时间是否在参数的前面
        System.out.println(instant1.isBefore(instant2));
        //判断调用者的时间是否在参数的后面
        System.out.println(instant1.isAfter(instant2));

        //Instant minusXxx(long millisToSubtract)减少时间系列的方法
        //减100秒
        instant2.minusMillis(100L);

        //Instant plusXxx(long millisToSubtract)增加时间系列的方法

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2000, 10, 3, 0, 0, 0);
        System.out.println("相差的年份"+ChronoUnit.YEARS.between(birthday, today));
    }
}
