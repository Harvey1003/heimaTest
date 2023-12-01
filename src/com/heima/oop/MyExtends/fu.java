package com.heima.oop.MyExtends;

public class fu{
    String name="fu";
    String sex;

}
class zi extends fu{
    String name="zi";
    public void ziShow(){
        String name="ziShow";
        System.out.println(name);//打印的"ziShow"
        System.out.println(this.name);//打印的"zi"，this调用局部变量
        System.out.println(super.name);//打印的"fu"，super调用父类中的成员变量
    }
}
