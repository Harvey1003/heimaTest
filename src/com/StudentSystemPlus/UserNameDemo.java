package com.StudentSystemPlus;

import com.StudentSystem.Student;
import com.StudentSystem.StudentDemo;

import java.util.ArrayList;
import java.util.Queue;
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
                case 3 -> setPassword(users);
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
        String username = null;
        while (true) {
            System.out.println("�����û�����");
            username = sc.next();
            int length = username.length();
            if (length < 3 || length > 15) {
                System.out.println("������3-15λ�ַ�,����������");
                continue;
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
                    continue;
                }
            }
            if (count == 0) {
                System.out.println("����ʹ�ô�����");
                continue;
            }
            int index = nameinof(users, username);
            if (index >= 0) {
                System.out.println("�û����ظ�������������");
                continue;
            }
            break;
        }
        String password1 = null;
        while (true) {
            System.out.println("�������룺");
            password1 = sc.next();
            System.out.println("ȷ�����룺");
            String password2 = sc.next();
            if (password1.equals(password2)) {
                break;
            } else {
                System.out.println("���������������");
                continue;
            }
        }
        String personid = null;
        while (true) {
            System.out.println("�������֤�ţ�");
            personid = sc.next();
            if (idNum(personid)) {
                break;
            } else {
                System.out.println("���֤���������������");
                continue;
            }
        }
        String phonenumber = null;
        while (true) {
            System.out.println("�����ֻ��ţ�");
            phonenumber = sc.next();
            if (number(phonenumber)) {
                break;
            } else {
                System.out.println("�ֻ����������������");
                continue;
            }
        }
        User user = new User(username, password1, personid, phonenumber);
        users.add(user);
        System.out.println("ע��ɹ���");
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
            //��ȡһ����֤�룬���
            String code = getCode();
            System.out.println("��֤���ǣ�" + code);
            //¼����֤��
            System.out.print("��������֤�룺");
            String yzm2 = sc.next();
            if (code.equalsIgnoreCase(yzm2)) {
                //��֤�ɹ�������ѭ��
            } else {
                System.out.println("��֤�����,��������");
            }
            if (users.get(index).getPassword().equals(password)) {
                break;
            } else {
                if (i == 2) {
                    System.out.println("�������������࣬�Ե�����");
                    return;
                }
                System.out.println("��������ȷ�����룬������" + (2 - i) + "�λ��ᡣ");
            }
        }

        //��¼�ɹ�
        System.out.println("��¼�ɹ���");
        //������������������
        StudentDemo sd = new StudentDemo();
        sd.startSystem();

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
        if (!(personid.equalsIgnoreCase(personid1) && PhoneNumber.equals(PhoneNumber1))) {
            System.out.println("��֤ʧ�ܣ�������");
            return;
        }
        String password;
        while (true) {
            System.out.print("��֤ͨ����������������:");
             password = sc.next();
            System.out.print("���ٴ��������룺");
            String againpassword = sc.next();
            if (password.equals(againpassword)){
                break;
            }else {
                System.out.println("�������벻һ�£����������룻");
                continue;
            }
        }
        //3.��������
        users.get(index).setPassword(password);


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

    //��ȡ��֤��
    public static String getCode() {
        ArrayList<Character> chats = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            chats.add((char) ('a' + i));
            chats.add((char) ('A' + i));
        }
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(chats.size());
            sb.append(chats.get(i1));
        }

        //����λ���������
        int i = random.nextInt(10);
        sb.append(i);
        char[] charArray = sb.toString().toCharArray();
        //�������
        int randomindex = random.nextInt(charArray.length);
        char c = charArray[randomindex];
        //char c1 = charArray[charArray.length];
        charArray[randomindex] = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = c;

        return new String(charArray);
    }
}
