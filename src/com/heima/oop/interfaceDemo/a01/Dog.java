package com.heima.oop.interfaceDemo.a01;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("³Ô¹ÇÍ·");
    }
}
