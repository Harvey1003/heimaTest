package com.heima.oop.polymorphismDemo.a02;

public class Person {
    private String name;
    private int age;

    public void keepPet(Animal animal, String something) {
        System.out.print("����Ϊ" + this.age + "���" + this.name + "����һֻ" + animal.getColor() + "��ɫ��" + animal.getAge() + "���");
        if (animal instanceof dog dog1) {
            System.out.println("��");
            dog1.eat(something);
        } else if (animal instanceof cat cat1) {
            System.out.println("è");
            cat1.eat(something);
        }else {
            System.out.println("û�����ֶ���");
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
