package com.heima.oop.MyInner;

public class Outer {
    //成员内部类
    class Inner {

    }

    public Inner getIner() {
        return new Inner();
    }

    //静态内部类
    static class staticInner {
        public void show1() {
            System.out.println("非静态方法");
        }

        public static void show2() {
            System.out.println("静态方法");
        }
    }


    public void show() {
        int a = 10;
        //局部内部类
        class jubuinner {
            String name;

            public void method1() {
                System.out.println("局部内部类中的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类中的method2静态方法");
            }
        }
        //局部内部类的对象
        jubuinner inner3 = new jubuinner();
        System.out.println(inner3.name);
        inner3.method1();
        jubuinner.method2();

    }
}
