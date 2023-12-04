package com.heima.oop.polymorphismDemo.a02;

public class test {
    public static void main(String[] args) {
        Animal dog = new dog("黑",2);
        Animal cat= new cat("灰",3);
        Person wang=new Person("老王",30);
        Person li=new Person("老李",25);
        wang.keepPet(dog,"骨头");
        li.keepPet(cat,"鱼");
    }
}
