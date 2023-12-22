package com.algorithmDemo.LambdaDemo;

public class a05 {
    public static void main(String[] args) {
        System.out.println(getcount(20));

       /* public boolean add(E e) 添加
        public void clear()清空
        public boolean remove(E e)删除
        public boolean contains(Object obj)判断是否包含
public boolean isEmpty()判断是否为空
public int size()集合长度



        */

    }
    public static int getcount(int n){
        if (n==1){
            return 1;
        } else if (n==2) {
            return 2;
        } else if (n==3) {
            return 4;
        }
        return getcount(n-1)+getcount(n-2)+getcount(n-3);
    }
}
