package com.heima.oop.polymorphismDemo.a02;

public class dog extends Animal{
    @Override
    public void eat(String something) {
        System.out.println(getAge()+"���"+getColor()+"��ɫ�Ĺ���ֻǰ�������ı�ס"+something+"�ͳ�");
    }
    public void lookhome(){
        System.out.println("������");
    }

    public dog() {
    }

    public dog(String color, int age) {
        super(color, age);
    }
}
