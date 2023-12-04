package com.heima.oop.polymorphismDemo.a01;

public class test {
    public static void main(String[] args) {
        Animal dog = new dog();
        dog.eat();
        Animal cat = new cat();

        //��̬�׶ˣ����ܷ����������еĹ���
        //dog.lookhome
        //cat.catchMouse();
        //���������
        //���ж�dog�Ƿ�Ϊdog���ͣ�����ǣ���ǿתdog,����ֵ��a
        if (dog instanceof dog a) {
            a.lookhome();
        } else if (cat instanceof cat b) {
            b.catchMouse();
        } else {
            System.out.println("û��");
        }
    }
}

class Animal {
    public void eat() {
        System.out.println("animal eat");
    }

}

class dog extends Animal {
    @Override
    public void eat() {
        System.out.println("����ʣ��");
    }

    public void lookhome() {
        System.out.println("������");
    }
}

class cat extends Animal {
    @Override
    public void eat() {
        System.out.println("è��è��");
    }

    public void catchMouse() {
        System.out.println("è׽����");
    }
}