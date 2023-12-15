package com.APIDemo.RegexDemo;

public class a05 {
    public static void main(String[] args) {
        //���: ��ʾ�ѵ�X��������ٳ�����һ��,
        //������飺\\x�ѵ�x�����������һ��

        //����1: �ж�һ���ַ����Ŀ�ʼ�ַ��ͽ����ַ��Ƿ�һ��? ֻ����һ���ַ�
        //����:&abc& ,a123b,, a123a, b456b,17891
        String regex1="(.).+\\1";
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));

        //����2:�ж�һ���ַ����Ŀ�ʼ���ֺͽ��������Ƿ�һ��?�����ж���ַ�
        //����:abc123abc b456b 123789123
        String regex2="(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));

        //����3:�ж�һ���ַ����Ŀ�ʼ���ֺͽ��������Ƿ�һ��? ��ʼ�����ڲ�ÿ���ַ�Ҳ��Ҫһ��
        //����:&&abc&&,aaa123aaa,bbb456bbb,111789111
        String regex3="((.){3}).+\\1";//((.)\2*).+\1
        System.out.println("aaaa123aaa".matches(regex3));
        System.out.println("bbb456bba".matches(regex3));
        System.out.println("111789111".matches(regex3));
    }
}
