package com.heima.oop.MyExtends;

public class test {
    String name;
    int age;
    public test() {
    }

    public test(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ziclass extends test {
    public ziclass() {
        //�ɲ�д
        super();
    }

    public ziclass(String name, int age) {
        super(name, age);
    }
}