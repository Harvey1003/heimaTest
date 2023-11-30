package com.StudentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void startSystem() {
        ArrayList<Student> students = new ArrayList<>();

        //给循环命名 指定跳出
        loop:
        while (true) {
            System.out.println("-----STUDENT SYSTEM-----");
            System.out.println("1,添加学生");
            System.out.println("2,删除学生");
            System.out.println("3,修改学生");
            System.out.println("4,查询学生");
            System.out.println("5,退出");
            System.out.print("请输入选择：");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1 -> addStudent(students);
                case 2 -> deletStudent(students);
                case 3 -> updateStudent(students);
                case 4 -> queryStudent(students);
                case 5 -> {
                    System.out.println("退出");
                    //break loop;
                    System.exit(0);//停止虚拟机运行

                }
                default -> System.out.println("没有这个选项");
            }
        }
    }

    //添加学生
    private static void addStudent(ArrayList<Student> students) {
        System.out.println("添加学生:");
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.print("请输入id：");
            id = sc.next();
            if (idinof(students, id) < 0) {
                break;
            } else {
                System.out.println("请重新输入id");
            }
        }
        System.out.print("请输入名字：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        System.out.print("请输入地址：");
        String add = sc.next();
        Student student = new Student(id, name, age, add);
        students.add(student);
    }

    //删除学生
    public static void deletStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要删除的学生学号：");
        String id = sc.next();
        int index = idinof(students, id);
        if (index >= 0) {
            Student remove = students.remove(index);
            System.out.println(remove.getName() + "的信息已被删除");
        } else {
            System.out.println("该生不存在,请重新选择。");
            return;
        }

        //
    }

    //修改学生
    public static void updateStudent(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入要修改的学生学号：");
        String id = sc.next();
        int index = idinof(students, id);
        if (index == -1) {
            System.out.println("要修改的id" + id + "不存在，请重新输入");
            return;
        }
        //获取需要修改的学生对象
        Student student = students.get(index);
        System.out.println("输入需要修改的学生姓名");
        student.setName(sc.next());
        System.out.println("输入需要修改的学生年龄");
        student.setAge(sc.nextInt());
        System.out.println("输入需要修改的学生家庭住址");
        student.setAdd(sc.next());
        System.out.println("信息修改成功！");
    }

    //查询学生
    public static void queryStudent(ArrayList<Student> students) {
        if (students.size() == 0) {
            System.out.println("当前无学生信息，请添加后再查询。");
            return;
        }
        System.out.println("id\t姓名\t年龄\t地址");
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            System.out.println(student.getId() + "\t" + student.getName() + "\t" + student.getAge() + "\t" + student.getAdd());
        }
    }

    //判断字符串是否与集合中重复,如果重复返回重复id的索引，不重复则返回-1
    public static int idinof(ArrayList<Student> students, String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
