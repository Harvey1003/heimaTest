package com.zuoye.day13.a03;

public class Phone {
    /*
(���ձ�׼��ʽд)��Ȼ���ڲ������в��ԡ�
1.�ֻ���Phone
����:Ʒ��brand,�۸�price
 �޲ι���,�вι���
��Ϊ:��绰call,������sendMessage,����ϷplayGame
2.������
����Phone�����,����Phone���еķ���*/
    private String brand;
    private double price;
    private static int SIZE=6;

    public  void call() {
        System.out.println( "��绰");
    }

    public void sendMessage() {
        System.out.println(brand + "����Ϣ");
    }

    public void playGame() {
        System.out.println(brand + "����Ϸ");
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
