package com.zuoye.day15;

import com.zuoye.day15.a02.newPhone;
import com.zuoye.day15.a02.oldPhone;
import com.zuoye.day15.a04.Inter;
import com.zuoye.day15.a04.Outer;
import com.zuoye.day15.a05.A;

public class test {
    public static void main(String[] args) {
        newPhone newPhone = new newPhone();
        newPhone.call();
        newPhone.sendMessage();
        newPhone.PlayGame();
        oldPhone op = new oldPhone();
        op.call();
        op.sendMessage();

        //µÚËÄÌâ
        Outer outer = new Outer();
        outer.show();

        //5
        A biga = new A();
        //biga.methodA();
    }
}
