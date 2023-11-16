package com.StudentSystemPlus;

import com.StudentSystem.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserNameDemo {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1��ע�᣻2����¼��3����������");
            int i = sc.nextInt();
            switch (i) {
                case 1 -> addname(users);
                case 2 -> login(users);
                case 3 -> System.out.println("��������");
                case 4 -> {
                    System.out.println("ϵͳ�˳�");
                    System.exit(0);
                }
                default -> System.out.println("��������");
            }
        }
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
        int index = nameinof(users, username);
        if (index >= 0) {
            System.out.println("�û����ظ�������������");
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
        if (number(phonenumber)) {

        } else {
            System.out.println("�ֻ����������������");
            return;
        }
        User user = new User(username, password1, personid, phonenumber);
        users.add(user);
    }

    //��¼
    public static void login(ArrayList<User> users) {
        //¼���˺��ж��Ƿ����
        Scanner sc = new Scanner(System.in);
        System.out.print("�����û�����");
        String username = sc.next();
        int index = nameinof(users, username);
        if (index == -1) {
            System.out.println("�˺Ų����ڣ���ע��");
            return;
        }
        //¼������,�������������
        //
        for (int i = 0; i < 3; i++) {
            System.out.print("�������룺");
            String password = sc.next();
            if (users.get(index).getPassword().equals(password)) {
                System.out.println();
                break;
            } else {
                if (i == 2) {
                    System.out.println("�������������࣬�Ե�����");
                    return;
                }
                System.out.println("��������ȷ�����룬������" + (2 - i) + "�λ��ᡣ");
            }
        }
        //��ȡһ����֤�룬���
        //
        Random random = new Random();
        char[] chars = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        yanzheng:
        while (true) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                int i1 = random.nextInt(chars.length);
                sb.append(chars[i1]);
            }
            String yzm = sb.toString();
            System.out.println("��֤���ǣ�" + yzm);
            //¼����֤��
            System.out.print("��������֤�룺");
            String yzm2 = sc.next();
            if (yzm.equals(yzm2)) {
                break yanzheng;
            } else {
                System.out.println("��֤�����,��������");
            }
        }
        //��¼�ɹ�
        System.out.println("��¼�ɹ���");
    }

    //��������
    public static void setPassword(ArrayList<User> users) {
        //1.¼���û����������������ʾδע��
        //
        Scanner sc = new Scanner(System.in);
        System.out.print("�����û�����");
        String username = sc.next();
        int index = nameinof(users, username);
        if (index == -1) {
            System.out.println("�˺Ų����ڣ���ע��");
            return;
        }
        //2.��֤���֤�ź��ֻ��ţ�
        //
        System.out.print("Please input personid��");
        String personid1 = sc.next();
        System.out.print("Please input PhoneNumber��");
        String PhoneNumber1 = sc.next();
        String personid = users.get(index).getPersonid();
        String PhoneNumber = users.get(index).getPhoneNumber();
        if (personid.equals(personid1) && PhoneNumber.equals(PhoneNumber1)) {
            System.out.println("��֤ͨ��������������");
        } else {
            System.out.println("��֤ʧ�ܣ�������");
            return;
        }

        //3.��������
        users.get(index).setPassword(sc.next());

    }

    //�ֻ��Ÿ�ʽ�ж�
    public static boolean number(String phonenumber) {
        int length = phonenumber.length();
        //����Ϊ��
        if (phonenumber == null) {
            return false;
        }
        //����11λ
        if (length != 11) {
            return false;
        }
        //��λ����Ϊ0
        if (phonenumber.charAt(0) == '0') {
            return false;
        }
        //����ȫ������
        for (int i = 0; i < length; i++) {
            char c = phonenumber.charAt(i);
            if (c >= '0' && c <= '9') {
            } else {
                return false;
            }
        }
        return true;
    }

    //�ж��ַ����ټ������Ƿ���ڣ����ڷ��������������ڷ���-1
    public static int nameinof(ArrayList<User> users, String name) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(name)) {
                return i;
            }
        }
        return -1;
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
