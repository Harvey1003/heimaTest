package com.zuoye.day13.a02;

public class Person {
/*
ѧ����Ϣ����Ϊ�����ƣ����䣬���ڰ༶���鿴�α���д���η���fillForm��
��ʦ��Ϣ����Ϊ�����ƣ����䣬�������ƣ��鿴�α���������publishForm��
�����ɫ����Ϊ����������ԣ����ƣ����䣩����Ϊ���鿴�α�
�������ࣺѧ����������ԣ����ڰ༶������Ϊ����д���η�����
�������ࣺ��ʦ��������ԣ��������ƣ�����Ϊ���������⣩
*/

    private String name;
    private int age;

    public void look() {
        System.out.println("�鿴�α�");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
