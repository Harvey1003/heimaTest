package com.heima.stringDemo.test;

import java.util.Scanner;

public class stringTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        while (true){
            System.out.print("请输入金额（最多7位数）：");
             money= sc.nextInt();
             if (money>=0&&money<=9999999){
                 break;
             }else {
                 System.out.println("重新输入");
             }
        }
        int ge;
        String Capital=new String();
        while (money>0){
            ge=money%10;
            Capital=getCapital(ge)+Capital;
            money/=10;
        }
        for (int i = 0; i < (8-Capital.length()); i++) {
            Capital="零"+Capital;
        }
        System.out.println(Capital);
        String[] danwei={"佰","拾","万","仟","佰","拾","元"};
        String s = new String();
        for (int i = 0; i < Capital.length(); i++) {
            s=s+Capital.charAt(i)+danwei[i];
        }


        System.out.println(s);

    }

    private static String getString(String inversionCapital) {
        String capital=new String();
        for (int i = inversionCapital.length()-1; i >= 0; i--) {
            capital+= inversionCapital.charAt(i);
        }
        return capital;
    }

    public static String getCapital(int number) {
        String[] bigc = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return bigc[number];
    }
}
