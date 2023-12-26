package com.vesselDemo.collection.a01_ArrayList.test;

import javax.naming.Name;

public abstract class Animal {
    private String name;
    private int age;

    public abstract void eat() ;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * ��ȡ
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * ����
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * ��ȡ
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * ����
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + "}";
    }
}
