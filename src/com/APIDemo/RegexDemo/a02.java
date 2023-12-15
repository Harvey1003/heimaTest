package com.APIDemo.RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a02 {
    public static void main(String[] args) {
        /*����1: ��ȡ�汾��Ϊ8,11,17��Java�ı�������ֻҪJav����ʾ�汾��
          ����2: ��ȡ�汾��Ϊ8,11,17��Java�ı�����ȷ��ȡ���:Java8 Java1 Java17 Java17
          ����3: ��ȡ���˰汾��Ϊ8,11,17��Java�ı���
        */
        String s = "java�Դ�95�����������������˺ܶ�汾 Ŀǰ��ҵ���õ�������Java8��JAva11��Ϊ�������ǳ���֧�ְ汾��һ������֧�� �汾��JAVa17������δ������JAVA17Ҳ���𽥵�����ʷ��̨";
        //1.����������ʽ
        //?���Ϊǰ�������Java
        //=��ʾ��Java����Ҫ���������
        //�����ڻ�ȡ��ʱ��ֻ��ȡǰ�벿��
        String gex1 = "(?i)java(?=8|11|17)";
        String gex2 = "(?i)java(8|11|17)";//((?i)java)(?:8|11|17)
        String gex3 = "(?i)java(?!8|11|17)";//(?i)java(?:8|11|17)
        Matcher m1 = Pattern.compile(gex1).matcher(s);
        Matcher m2 = Pattern.compile(gex2).matcher(s);
        Matcher m3 = Pattern.compile(gex3).matcher(s);
        while (m1.find()) {
            System.out.println(m1.group());
        }
        System.out.println("======================");
        while (m2.find()) {
            System.out.println(m2.group());
        }
        System.out.println("======================");
        while (m3.find()) {
            System.out.println(m3.group());

        }
        System.out.println("======================");

    }
}
