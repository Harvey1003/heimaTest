package com.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void startSystem() {
        ArrayList<Student> students = new ArrayList<>();

        //��ѭ������ ָ������
        loop:
        while (true) {
            System.out.println("-----STUDENT SYSTEM-----");
            System.out.println("1,���ѧ��");
            System.out.println("2,ɾ��ѧ��");
            System.out.println("3,�޸�ѧ��");
            System.out.println("4,��ѯѧ��");
            System.out.println("5,�˳�");
            System.out.print("������ѡ��");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> addStudent(students);
                case 2 -> deletStudent(students);
                case 3 -> updateStudent(students);
                case 4 -> queryStudent(students);
                case 5 -> {
                    System.out.println("�˳�");
                    //break loop;
                    System.exit(0);//ֹͣ���������

                }
                default -> System.out.println("û�����ѡ��");
            }
        }
    }

    //���ѧ��
    private static void addStudent(ArrayList<Student> students) {
        System.out.println("���ѧ��:");
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("������id��");
            id = sc.next();
            if (idinof(students, id) < 0) {
                break;
            } else {
                System.out.println("����������id");
            }
        }
        System.out.print("���������֣�");
        String name = sc.next();
        System.out.print("���������䣺");
        int age = sc.nextInt();
        System.out.print("�������ַ��");
        String add = sc.next();
        Student student = new Student(id, name, age, add);
        students.add(student);
    }

    //ɾ��ѧ��
    public static void deletStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������Ҫɾ����ѧ��ѧ�ţ�");
        String id = sc.next();
        int index = idinof(students, id);
        if (index >= 0) {
            Student remove = students.remove(index);
            System.out.println(remove.getName() + "����Ϣ�ѱ�ɾ��");
        } else {
            System.out.println("����������,������ѡ��");
            return;
        }

        //
    }

    //�޸�ѧ��
    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������Ҫ�޸ĵ�ѧ��ѧ�ţ�");
        String id = sc.next();
        int index = idinof(students, id);
        if (index == -1) {
            System.out.println("Ҫ�޸ĵ�id" + id + "�����ڣ�����������");
            return;
        }
        //��ȡ��Ҫ�޸ĵ�ѧ������
        Student student = students.get(index);
        System.out.println("������Ҫ�޸ĵ�ѧ������");
        student.setName(sc.next());
        System.out.println("������Ҫ�޸ĵ�ѧ������");
        student.setAge(sc.nextInt());
        System.out.println("������Ҫ�޸ĵ�ѧ����ͥסַ");
        student.setAdd(sc.next());
        System.out.println("��Ϣ�޸ĳɹ���");
    }

    //��ѯѧ��
    public static void queryStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("��ǰ��ѧ����Ϣ������Ӻ��ٲ�ѯ��");
            return;
        }
        System.out.println("id\t����\t����\t��ַ");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAdd());
        }
    }

    //�ж��ַ����Ƿ��뼯�����ظ�,����ظ������ظ�id�����������ظ��򷵻�-1
    public static int idinof(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
