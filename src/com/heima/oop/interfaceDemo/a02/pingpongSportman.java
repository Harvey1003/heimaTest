package com.heima.oop.interfaceDemo.a02;

public class pingpongSportman extends sportsman implements talkEnglish{
    public pingpongSportman() {
    }

    public pingpongSportman(String name, int age) {
        super(name, age);
    }

    @Override
    public void Study() {
        System.out.println("ѧƹ��");

    }

    @Override
    public void talkEnglish() {

    }
}
