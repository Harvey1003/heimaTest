package com.heima.oop.interfaceDemo;

public class Sheep extends Animal {
    public Sheep(String name, int age) {
        super(name, age);
    }

    public Sheep() {
    }

    @Override
    public void eat() {
        System.out.println("³Ô²Ý");
    }
}
