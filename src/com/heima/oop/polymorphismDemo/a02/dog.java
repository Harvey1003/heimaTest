package com.heima.oop.polymorphismDemo.a02;

public class dog extends Animal{
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"颜色的狗两只前腿死死的保住"+something+"猛吃");
    }
    public void lookhome(){
        System.out.println("狗看家");
    }

    public dog() {
    }

    public dog(String color, int age) {
        super(color, age);
    }
}
