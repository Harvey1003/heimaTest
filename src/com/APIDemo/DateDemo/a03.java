package com.APIDemo.DateDemo;

import java.util.Calendar;
import java.util.Date;

public class a03 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date(0l);
        c.setTime(d);
        System.out.println(c);

        //public int get(int field)ȡ�����е�ĳ���ֶ���Ϣ
        //0-16��������  
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;

        //public void set(int field,int value)�޸�������ĳ���ֶ���Ϣ


        //public void add(int field,int amount)Ϊĳ���ֶ�����/����ָ����ֵ


    }
}
