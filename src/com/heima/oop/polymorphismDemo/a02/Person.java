package com.heima.oop.polymorphismDemo.a02;

public class Person {
    private String name;
    private int age;

    public void keepPet(Animal animal, String something) {
        System.out.print("年龄为" + this.age + "岁的" + this.name + "养了一只" + animal.getColor() + "颜色的" + animal.getAge() + "岁的");
        if (animal instanceof dog dog1) {
            System.out.println("狗");
            dog1.eat(something);
        } else if (animal instanceof cat cat1) {
            System.out.println("猫");
            cat1.eat(something);
        }else {
            System.out.println("没有这种动物");
        }
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
