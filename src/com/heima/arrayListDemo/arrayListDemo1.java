package com.heima.arrayListDemo;

import java.util.ArrayList;

public class arrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //���Ԫ�� ����ֵ�ǲ�����
        list.add("aaa");
        list.add("aa");
        list.add("ab");
        //����ֱ�Ӵ����ݣ����ز���
        list.remove("aa");
        //���Դ�����,���ر�ɾ��������
        list.remove(2);
        //�޸�


    }
}
