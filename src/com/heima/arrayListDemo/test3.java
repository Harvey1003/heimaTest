package com.heima.arrayListDemo;

import java.util.ArrayList;

public class test3 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("大数据", "ydd", "123456");
        User user2 = new User("大数据", "lcr", "12345");
        User user3 = new User("heima", "wkk", "1234");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        int index = contains(users, "heima");
        if (index==-1){
            System.out.println("查找失败");
        }else {
            System.out.println("查找成功"+index);
        }
    }

    public static int contains(ArrayList<User> users, String id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                //如果相同返回true，结束循环
                return i;
            }
        }
        //如果循环结束 没有找到返回false
        return -1;
    }
}
