package com.heima.oop.MyInner;

public class test {
    public static void main(String[] args) {
        //��Ա�ڲ���
        Outer.Inner inner = new Outer().new Inner();
        //��̬�ڲ���
        Outer.staticInner staticInner = new Outer.staticInner();
        //���÷Ǿ�̬����
        staticInner.show1();
        //���þ�̬����
        Outer.staticInner.show2();


        //�����ڲ���
        new Swim() {
            @Override
            public void swim() {
                System.out.println("��д����Ӿ�ӿ�");
            }
        }.swim();

    }
}
