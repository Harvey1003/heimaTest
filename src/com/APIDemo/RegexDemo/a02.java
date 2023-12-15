package com.APIDemo.RegexDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a02 {
    public static void main(String[] args) {
        /*需求1: 爬取版本号为8,11,17的Java文本，但是只要Jav不显示版本号
          需求2: 爬取版本号为8,11,17的Java文本。正确爬取结果:Java8 Java1 Java17 Java17
          需求3: 爬取除了版本号为8,11,17的Java文本，
        */
        String s = "java自从95年问世以来，经历了很多版本 目前企业中用的最多的是Java8和JAva11因为这两个是长期支持版本下一个长期支持 版本是JAVa17相信在未来不久JAVA17也会逐渐登上历史舞台";
        //1.定义正则表达式
        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只获取前半部分
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
