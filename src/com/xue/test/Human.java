package com.xue.test;

/**
 * Created by Administrator on 2016/9/24.
 */
public class Human {
    private String name;
    private static String earth;

    public static void main(String[] args) {
        Human user1 = new Human();
        user1.name = "张三";
        Human.earth = "种了一棵树";
        System.out.println(user1.name);
        System.out.println(earth);

        Human user2 = new Human();
        user2.name = "李四";
        System.out.println(user2.name);
        System.out.println(earth);
    }
}
