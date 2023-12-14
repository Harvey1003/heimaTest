package com.APIDemo.RegexDemo;

public class a01 {
    public static void main(String[] args) {
        System.out.println("QQ��" +QQ("1428009419"));
        System.out.println("�ֻ���"+PhoneNumber("13123456789"));
        String id="12345620001231123x";
        System.out.println("���֤"+PersonID(id));
        System.out.println("����"+eMail("wanghw_01@qq2.com.cn"));
        //(0[1-9]|10|11|12)(0[1-9]|[1-2]\d|30|31)  [01]\d[0-3]\d
        String gex="[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}(?i)[\\dX]";
        System.out.println(id.matches(gex));
    }
    //������֤
    public static boolean eMail(String mail) {

        return mail.matches("\\w{3,}@[\\w&&[^_]]{2,}(\\.[comn]{2,3}){1,2}");
    }

    //�ֻ�����֤
    public static boolean PhoneNumber(String phonenum) {

        return phonenum.matches("1[3-9]\\d{9}");
    }




    //���֤����֤
    public static boolean PersonID(String personid) {
        return personid.matches("[^0]\\d{15}\\d[1-9xX]");
    }

    //��֤QQ�ţ���ͷ��Ϊ0��6-20λ��ȫ������
    public static boolean QQ(String qq) {
        return qq.matches("[0-9]\\d{5,19}");
    }
}
