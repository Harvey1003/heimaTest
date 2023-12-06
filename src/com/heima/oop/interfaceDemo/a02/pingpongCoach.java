package com.heima.oop.interfaceDemo.a02;

public class pingpongCoach extends coach implements talkEnglish{
    public pingpongCoach() {
    }

    public pingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teachar() {
        System.out.println("ΩÃ∆π≈“");

    }

    @Override
    public void talkEnglish() {

    }
}
