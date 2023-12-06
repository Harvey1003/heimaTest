package com.heima.oop.abstractDemo.a01;

import com.heima.oop.interfaceDemo.a01.Swim;

public class Dog extends Animal implements Swim {
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("≥‘π«Õ∑");
    }

    @Override
    public void swim() {
        System.out.println("”Œ”æ");
    }
}
