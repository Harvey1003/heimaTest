package com.MyMap;

import java.util.HashMap;
import java.util.Map;

public class a01_map {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        //V put(K key,V value )���Ԫ��/����
        m.put("ΤС��","�彣��");
        m.put("��־ƽ","С��Ů");
        m.put("����","����");
        //���key���ڣ��򸲸ǵ�value�����ر����ǵ�value
        String put = m.put("ΤС��", "˫��");
        System.out.println(m);
        //V remove(Object key)���ݼ������ֵ��Ԫ��
        m.remove("��־ƽ");
        //void clear()�Ƴ����еļ�ֵ��Ԫ��
        m.clear();
        //boolean containsKey(object key)�жϼ����Ƿ����ָ���ļ�
        m.containsKey("��־ƽ");
        //boolean containsValue(Object value)�жϼ����Ƿ����ָ����ֵ
        m.containsValue("˫��");
        //boolean isEmpty()�жϼ����Ƿ�Ϊ��
        m.isEmpty();
        //int size()���ϵĳ��ȣ�Ҳ���Ǽ����м�ֵ�Եĸ���
        int size = m.size();


    }
}
