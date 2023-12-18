package com.APIDemo.DateDemo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class a04 {
    public static void main(String[] args) {
        //static Instant now()��ȡ��ǰʱ���Instant���� (��׼ʱ��)
        Instant now = Instant.now();
        System.out.println(now);
        //static Instant ofXxxx(long epochMilli)����(��/����/����) ��ȡInstant����
        Instant instant1 = Instant.ofEpochMilli(1L);
        System.out.println(instant1);
        //ZonedDateTime atZone(ZoneId zone)ָ��ʱ��
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);
        //boolean isXxx(Instant otherInstant)�ж�ϵ�еķ���
        Instant instant2 = Instant.ofEpochMilli(1000L);
        //�жϵ����ߵ�ʱ���Ƿ��ڲ�����ǰ��
        System.out.println(instant1.isBefore(instant2));
        //�жϵ����ߵ�ʱ���Ƿ��ڲ����ĺ���
        System.out.println(instant1.isAfter(instant2));

        //Instant minusXxx(long millisToSubtract)����ʱ��ϵ�еķ���
        //��100��
        instant2.minusMillis(100L);

        //Instant plusXxx(long millisToSubtract)����ʱ��ϵ�еķ���

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2000, 10, 3, 0, 0, 0);
        System.out.println("�������"+ChronoUnit.YEARS.between(birthday, today));
    }
}
