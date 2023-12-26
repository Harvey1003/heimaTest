package com.vesselDemo.collection.a01_ArrayList.test;

public class haskyDog extends dog{
    public haskyDog() {
    }

    public haskyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"³Ô¶«Î÷");;
    }
}
