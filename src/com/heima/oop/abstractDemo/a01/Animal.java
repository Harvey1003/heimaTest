package com.heima.oop.abstractDemo.a01;

public abstract class Animal {
    private String name;
    private int age;

    public abstract void eat();

    public void dirnk() {
        System.out.println("ºÈË®");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
