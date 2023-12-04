package com.heima.oop.MyExtends.a02MyExtendsDemo;

public class Manager extends Employee{
    private double jiangjin;

    public Manager() {

    }

    public Manager(String id, String name, double salary, double jiangjin) {
        super(id, name, salary);
        this.jiangjin = jiangjin;
    }

    public double getJiangjin() {
        return jiangjin;
    }

    public void setJiangjin(double jiangjin) {
        this.jiangjin = jiangjin;
    }

    @Override
    public void work() {
        System.out.println("№ЬАн");
    }
}
