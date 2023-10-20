package com.heima.stringDemo.test;

public class stringTest03 {
    public static void main(String[] args) {
        String phonenumber = "13938061232";
        String phone = new String();
        phone = phonenumber.substring(0, 3) + "****" + phonenumber.substring(7);
        System.out.println(phone);
        String id = "412723200010033826";
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        String bir="出生日期："+year+"年"+month+"月"+day+"日";
        System.out.println(bir);
        String sex=new String();
        char c = id.charAt(16);//ascii码表
        if (c%2==1){
            sex="性别为：男";
        }else {
            sex="性别为：女";
        }
        System.out.println(sex);

        String talk="what the fuck,cnm";
        String[] arr={"fuck","cnm"};
        for (int i = 0; i < arr.length; i++) {
            talk=talk.replace(arr[i],"***");
        }
        System.out.println(talk);
    }
}
