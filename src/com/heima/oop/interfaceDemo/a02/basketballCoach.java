package com.heima.oop.interfaceDemo.a02;

public class basketballCoach extends coach {

    @Override
    public void teachar() {
        System.out.println("������");
    }

    public basketballCoach() {
    }

    public basketballCoach(String name, int age) {
        super(name, age);
    }
}
