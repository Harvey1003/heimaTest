package com.algorithmDemo.LambdaDemo;

public class a05 {
    public static void main(String[] args) {
        System.out.println(getcount(20));

       /* public boolean add(E e) ���
        public void clear()���
        public boolean remove(E e)ɾ��
        public boolean contains(Object obj)�ж��Ƿ����
public boolean isEmpty()�ж��Ƿ�Ϊ��
public int size()���ϳ���



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
