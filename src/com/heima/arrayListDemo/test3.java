package com.heima.arrayListDemo;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("������", "ydd", "123456");
        User user2 = new User("������", "lcr", "12345");
        User user3 = new User("heima", "wkk", "1234");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        int index = contains(users, "heima");
        if (index==-1){
            System.out.println("����ʧ��");
        }else {
            System.out.println("���ҳɹ�"+index);
        }
    }

    public static int contains(ArrayList<User> users, String id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                //�����ͬ����true������ѭ��
                return i;
            }
        }
        //���ѭ������ û���ҵ�����false
        return -1;
    }
}
