package com.heima.oop.MyInner;

public class Outer {
    //��Ա�ڲ���
    class Inner {

    }

    public Inner getIner() {
        return new Inner();
    }

    //��̬�ڲ���
    static class staticInner {
        public void show1() {
            System.out.println("�Ǿ�̬����");
        }

        public static void show2() {
            System.out.println("��̬����");
        }
    }


    public void show() {
        int a = 10;
        //�ֲ��ڲ���
        class jubuinner {
            String name;

            public void method1() {
                System.out.println("�ֲ��ڲ����е�method1����");
            }

            public static void method2() {
                System.out.println("�ֲ��ڲ����е�method2��̬����");
            }
        }
        //�ֲ��ڲ���Ķ���
        jubuinner inner3 = new jubuinner();
        System.out.println(inner3.name);
        inner3.method1();
        jubuinner.method2();

    }
}
