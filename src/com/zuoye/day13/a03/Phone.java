package com.zuoye.day13.a03;

public class Phone {
    /*
(按照标准格式写)，然后在测试类中测试。
1.手机类Phone
属性:品牌brand,价格price
 无参构造,有参构造
行为:打电话call,发短信sendMessage,玩游戏playGame
2.测试类
创建Phone类对象,调用Phone类中的方法*/
    private String brand;
    private double price;
    private static int SIZE=6;

    public  void call() {
        System.out.println( "打电话");
    }

    public void sendMessage() {
        System.out.println(brand + "发信息");
    }

    public void playGame() {
        System.out.println(brand + "玩游戏");
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
