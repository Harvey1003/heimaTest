package com.heima.stringDemo.day10jobs;



import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("input number:");
            str = scanner.next();
            if (checkStr(str)) {
                break;
            } else {
                System.out.println("���������������");
                continue;
            }
        }
        String str2 = getString(str);
        String str1 = getLuoMaStr(str);
        String str3 = changeLuoMa(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

    private static String getLuomaNumber(int number) {
        String[] luoma = {"��", "��", "��", "��", "��", "��", "��", "��", "��"};
        return luoma[number];
    }

    private static String getLuoMaStr(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 49;
            sb.append(getLuomaNumber(number));
        }

        return sb.toString();
    }

    private static String getString(String str) {
        String[] luma = {"��", "��", "��", "��", "��", "��", "��", "��", "��"};
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < str.length(); i++) {
            str = str.replace(number[i], luma[i]);
        }
        return str;
    }

    public static boolean checkStr(String str) {
        if (str.length() >= 9) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    public static String changeLuoMa(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            str=switch (c) {
                //{"��", "��", "��", "��", "��", "��", "��", "��", "��"};
                case '0' -> "";
                case '1' -> "��";
                case '2' -> "��";
                case '3' -> "��";
                case '4' -> "��";
                case '5' -> "��";
                case '6' -> "��";
                case '7' -> "��";
                case '8' -> "��";
                case '9' -> "��";
                default -> str="";
            };
        }
        return str;
    }
}
