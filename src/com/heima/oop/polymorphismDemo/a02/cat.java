package com.heima.oop.polymorphismDemo.a02;

public class cat extends Animal{
    @Override
    public void eat(String something) {
        System.out.println(super.getAge()+"���"+super.getColor()+"��ɫ��è�����۾�����ͷ��"+something);
    }
    public void catchMouse(){
        System.out.println("è׽����");
    }

    public cat() {
    }

    public cat(String color, int age) {
        super(color, age);
    }
}
