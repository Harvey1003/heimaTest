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
        c.set(Calendar.YEAR,2000);//
        c.set(Calendar.MONTH,9);//10��
        c.set(Calendar.DAY_OF_MONTH,3);

        //public void add(int field,int amount)Ϊĳ���ֶ�����/����ָ����ֵ
        c.add(Calendar.MONTH,-1);//��һ����
        System.out.println(year);
        System.out.println(month);
    }
}
