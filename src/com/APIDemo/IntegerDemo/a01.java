package com.APIDemo.IntegerDemo;

import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class a01 {
    public static void main(String[] args) {
/*public static string toBinaryString(int i)得到二进制
public static string tooctalstring(int i)得到八进制
public static string toHexString(int i)得到十六进制
public static int parseInt(string s)将字符串类型的整数转成int类型的整数
 1.在基本类型转换时，参数只能是数字。
 2.8种包种类中，除了Character都有对应的parseXX的方法，进行类型转换。
*/
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = Integer.parseInt(s);
        System.out.println(i);
    }
}
