package com.APIDemo.DateDemo;

import java.util.Calendar;
import java.util.Date;

public class a03 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date(0l);
        c.setTime(d);
        System.out.println(c);
        //public int get(int field)取日期中的某个字段信息
        //0-16个索引，  
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;

        //public void set(int field,int value)修改日历的某个字段信息
        c.set(Calendar.YEAR,2000);//
        c.set(Calendar.MONTH,9);//10月
        c.set(Calendar.DAY_OF_MONTH,3);

        //public void add(int field,int amount)为某个字段增加/减少指定的值
        c.add(Calendar.MONTH,-1);//减一个月
        System.out.println(year);
        System.out.println(month);
    }
}
