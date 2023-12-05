package com.zuoye.day15.a05;

public class A implements InteA{
    public void methodA(InteA a){
        this.showA();
    }
    @Override
    public void showA() {
        System.out.println("showA");
    }
}
interface InteA{
    void showA();
}