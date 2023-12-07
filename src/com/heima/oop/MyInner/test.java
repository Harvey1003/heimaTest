package com.heima.oop.MyInner;

public class test {
    public static void main(String[] args) {
        //成员内部类
        Outer.Inner inner = new Outer().new Inner();
        //静态内部类
        Outer.staticInner staticInner = new Outer.staticInner();
        //调用非静态方法
        staticInner.show1();
        //调用静态方法
        Outer.staticInner.show2();


        //匿名内部类
        new Swim() {
            @Override
            public void swim() {
                System.out.println("重写的游泳接口");
            }
        }.swim();

    }
}
