package com.StudentSystemPlus;

import java.util.ArrayList;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        System.out.println("ѧ������ϵͳ------");
        System.out.println("���������֣�1����¼��2��ע�᣻3����������");
        Scanner sc = new Scanner(System.in);

        switch (sc.nextInt()) {
            case 1 -> System.out.println();
            case 2 -> System.out.println();
            case 3 -> System.out.println();
            default -> System.out.println("�������");
        }
    }

    //ע��
    private static void register(ArrayList<User> users) {
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("�����û���");
        String username = sc.next();


    }

    private static boolean checkUsername(String username) {
        //
        int length = username.length();
        if (length<3||length>15){
            System.out.println("������3-15λ�ַ�,��������");
            return false;
        }




        return true;
    }
}
