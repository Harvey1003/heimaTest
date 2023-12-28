package com.MyMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class a02_map {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("ΤС��", "�彣��");
        m.put("��־ƽ", "С��Ů");
        m.put("����", "����");
        System.out.println("-----------����ֵ��ʽ-----------");
        System.out.println("-----------��ǿfor-----------");
        Set<String> keys = m.keySet();
        for (String s : keys) {
            System.out.println(s + ":" + m.get(s));
        }
        System.out.println("-----------������-----------");
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String keyNext = it.next();
            System.out.println(keyNext + ":" + m.get(keyNext));
        }
        System.out.println("-----------Lambda-----------");
        keys.forEach(s -> System.out.println(s + ":" + m.get(s)));


        System.out.println("-----------��ֵ�Է�ʽ-----------");
        Set<Entry<String, String>> entries = m.entrySet();
        System.out.println("-----------��ǿfor-----------");
        for (Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
        System.out.println("-----------������-----------");
        Iterator<Entry<String, String>> it2 = entries.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        System.out.println("-----------Lambda-----------");
        entries.forEach(stringStringEntry -> System.out.println(stringStringEntry));

        System.out.println("-----------�����ֱ�����ʽ-----------");
        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });


    }
}
