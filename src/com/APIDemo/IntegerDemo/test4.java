package com.APIDemo.IntegerDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class test4 {
    public static void main(String[] args) throws ParseException {
        //JDK7
        String s="2000.10.03";
        SimpleDateFormat birthsdf = new SimpleDateFormat("yyyy.MM.dd");
        Date date = birthsdf.parse(s);
        long birthtime = date.getTime();

        long todayTime = System.currentTimeMillis();
        long time =   todayTime-birthtime;
        System.out.println(time/1000/60/60/24);

        //JDK8
        LocalDate birLD = LocalDate.of(2000, 10, 3);
        LocalDate now = LocalDate.now();
        System.out.println(ChronoUnit.DAYS.between( birLD,now));
    }}
