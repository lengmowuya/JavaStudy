package com.wkcto;

public class 类型转换 {
    // 类变量
    /*
    类变量从属于这个类，跟随类出生，并跟随着类销毁
     */
    static double salary = 2500;
    String name = "冷漠乌鸦";
    int age;
    public static void main(String[] args) {
        int i = 128;
        // 强制类型转换
        byte b = (byte)i; // 数值大于范围后，内存溢出会变值
        double c = i;
        System.out.println(b);  // -128
        System.out.println(c);  // 128.0

        System.out.println((int)23.7);  // 23
        System.out.println((int)-45.89f);  //-45
        System.out.println('a'+1); // 98
        System.out.println((char)('a'+1)); // b

        int money = 10_0000_0000; // JDK7新特性
        System.out.println(money);
        System.out.println(money * 20); // -1474836480

        long total = money * 20;
        // 还是-1474836480  因为转换之前已经出现问题
        System.out.println(total);

        long total2 = money*((long)20); // 先把一个数转化为long
        System.out.println(total2); // 20000000000

        类型转换 mouse01 = new 类型转换();
        System.out.println(mouse01.name);
        System.out.println(mouse01.age);

    }
    class phone{

    }
}
