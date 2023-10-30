package com.StudentSystemPlus;

import java.util.ArrayList;
import java.util.Scanner;

public class UserNameDemo {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        addname(users);
        User user = users.get(0);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getPersonid());
        System.out.println(user.getPhoneNumber());
    }

    //ע��
    public static void addname(ArrayList<User> users) {
        //�û���У��
        Scanner sc = new Scanner(System.in);
        System.out.println("�����û�����");
        String username = sc.next();
        int length = username.length();
        if (length < 3 || length > 15) {
            System.out.println("������3-15λ�ַ�,����������");
            return;
        }
        int count = 0;
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9') {
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    count++;
                }
            } else {
                System.out.println("�������СѧӢ����ĸ��������ɵ��û���");
                return;
            }
        }
        if (count == 0) {
            System.out.println("����ʹ�ô�����");
            return;
        }
        System.out.println("�������룺");
        String password1 = sc.next();
        System.out.println("ȷ�����룺");
        String password2 = sc.next();
        if (password1.equals(password2)) {

        } else {
            System.out.println("���������������");
            return;
        }
        System.out.println("�������֤�ţ�");
        String personid = sc.next();
        if (idNum(personid)) {
        } else {
            System.out.println("���֤���������������");
            return;
        }
        System.out.println("�����ֻ��ţ�");
        String phonenumber = sc.next();
        if(number(phonenumber)){

        }else {
            System.out.println("�ֻ����������������");
            return;
        }
        User user = new User(username, password1, personid, phonenumber);
        users.add(user);
    }
    //��¼









    //�ֻ��Ÿ�ʽ�ж�
    public static boolean number(String phonenumber) {
        int length = phonenumber.length();
        //����Ϊ��
        if(phonenumber==null){
            return false;
        }
        //����11λ
        if (length != 11) {
            return false;
        }
        //��λ����Ϊ0
        if (phonenumber.charAt(0)=='0'){
            return false;
        }
        //����ȫ������
        for (int i = 0; i < length; i++) {
            char c = phonenumber.charAt(i);
            if (c>='0'&&c<='9'){
            }else {
                return false;
            }
        }
        return true;
    }

    //���֤�Ÿ�ʽ�ж�
    public static boolean idNum(String id) {
        if (id == null) {
            return false;
        }
        if (id.length() != 18) {
            return false;
        }
        //�жϵ�һλ�Ƿ�Ϊ��
        if (id.startsWith("0")) {
            return false;
        }

        for (int i = 1; i < id.length(); i++) {
            //string.charAt�˷������ص���char����
            char c = id.charAt(i);
            //�ж����һλ�Ƿ��ǳ���X������
            if (i == id.length() - 1) {
                if (c < '0' || c > '9' && c != 'X') {
                    return false;
                }
            } else {
                //����λ�����ж�
                if (c < '0' || c > '9') {
                    return false;
                }
            }
        }
        return true;
    }
}
