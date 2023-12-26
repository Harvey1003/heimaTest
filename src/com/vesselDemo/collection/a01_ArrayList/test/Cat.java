package com.vesselDemo.collection.a01_ArrayList.test;

public abstract class Cat extends Animal{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public abstract void eat() ;
}
