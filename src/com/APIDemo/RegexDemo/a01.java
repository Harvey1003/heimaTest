package com.APIDemo.RegexDemo;

public class a01 {
    public static void main(String[] args) {
        System.out.println("QQ号" +QQ("1428009419"));
        System.out.println("手机号"+PhoneNumber("13123456789"));
        String id="12345620001231123x";
        System.out.println("身份证"+PersonID(id));
        System.out.println("邮箱"+eMail("wanghw_01@qq2.com.cn"));
        //(0[1-9]|10|11|12)(0[1-9]|[1-2]\d|30|31)  [01]\d[0-3]\d
        String gex="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}(?i)[\\dX]";
        System.out.println(id.matches(gex));
    }
    //邮箱验证
    public static boolean eMail(String mail) {

        return mail.matches("\\w{3,}@[\\w&&[^_]]{2,}(\\.[comn]{2,3}){1,2}");
    }

    //手机号验证
    public static boolean PhoneNumber(String phonenum) {

        return phonenum.matches("1[3-9]\\d{9}");
    }




    //身份证号验证
    public static boolean PersonID(String personid) {
        return personid.matches("[^0]\\d{15}\\d[1-9xX]");
    }

    //验证QQ号，开头不为0，6-20位，全是数字
    public static boolean QQ(String qq) {
        return qq.matches("[0-9]\\d{5,19}");
    }
}
