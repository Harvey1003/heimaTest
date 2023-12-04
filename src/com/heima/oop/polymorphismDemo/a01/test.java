package com.heima.oop.polymorphismDemo.a01;

public class test {
    public static void main(String[] args) {
        Animal dog = new dog();
        dog.eat();
        Animal cat = new cat();

        //多态弊端：不能访问子类特有的功能
        //dog.lookhome
        //cat.catchMouse();
        //解决方法：
        //先判断dog是否为dog类型，如果是，则强转dog,并赋值给a
        if (dog instanceof dog a) {
            a.lookhome();
        } else if (cat instanceof cat b) {
            b.catchMouse();
        } else {
            System.out.println("没有");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("animal eat");
    }

}

class dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃剩饭");
    }

    public void lookhome() {
        System.out.println("狗看家");
    }
}

class cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    public void catchMouse() {
        System.out.println("猫捉老鼠");
    }
}