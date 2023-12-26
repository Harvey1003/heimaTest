package com.vesselDemo.collection.a01_ArrayList.test;

public class bosiCat extends Cat{
    @Override
    public void eat() {
        System.out.println(getName()+"≥‘”„");
    }

    public bosiCat() {
    }

    public bosiCat(String name, int age) {
        super(name, age);
    }
}
