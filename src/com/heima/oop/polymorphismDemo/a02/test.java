package com.heima.oop.polymorphismDemo.a02;

public class test {
    public static void main(String[] args) {
        Animal dog = new dog("��",2);
        Animal cat= new cat("��",3);
        Person wang=new Person("����",30);
        Person li=new Person("����",25);
        wang.keepPet(dog,"��ͷ");
        li.keepPet(cat,"��");
    }
}
