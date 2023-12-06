package com.heima.oop.interfaceDemo.a02;

public abstract class coach extends Person{
    public abstract void teachar();

    public coach() {
    }

    public coach(String name, int age) {
        super(name, age);
    }
}
