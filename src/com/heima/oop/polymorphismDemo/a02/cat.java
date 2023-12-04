package com.heima.oop.polymorphismDemo.a02;

public class cat extends Animal{
    @Override
    public void eat(String something) {
        System.out.println(super.getAge()+"岁的"+super.getColor()+"颜色的猫眯着眼睛侧着头吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }

    public cat() {
    }

    public cat(String color, int age) {
        super(color, age);
    }
}
