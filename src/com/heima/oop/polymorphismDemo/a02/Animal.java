package com.heima.oop.polymorphismDemo.a02;

public class Animal {
    private String color;
    private int age;

    public void eat(String something) {
        System.out.println("³Ô"+something);
    }

    public Animal() {
    }

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
