package com.sortDemo;

public class a04 {
    public static void main(String[] args) {
        System.out.println(getSum(100));
        System.out.println(getJC(5));
    }
    //�ݹ��㷨��
    public static int getSum(int number){
        //����
        if (number==1){
            return 1;
        }
        return number+getSum(number-1);
    }
    //�ݹ���׳�
    public static int getJC(int number){
        if (number==1){
            return 1;
        }
        return number*getJC(number-1);

    }
}
