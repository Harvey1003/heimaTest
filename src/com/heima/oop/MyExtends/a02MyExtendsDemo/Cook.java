package com.heima.oop.MyExtends.a02MyExtendsDemo;

public class Cook extends Employee{
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("³´²Ë");
    }
}
