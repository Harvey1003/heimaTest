package com.heima.oop.MyExtends;

public class fu{
    String name="fu";
    String sex;

}
class zi extends fu{
    String name="zi";
    public void ziShow(){
        String name="ziShow";
        System.out.println(name);//��ӡ��"ziShow"
        System.out.println(this.name);//��ӡ��"zi"��this���þֲ�����
        System.out.println(super.name);//��ӡ��"fu"��super���ø����еĳ�Ա����
    }
}
