package com.wkcto;

import java.util.Date;

public class HelloWorld {
    public static void main(String[] args){
        // psvm Tab快速生成入口函数
        // 整数扩展
        System.out.println("Hello World!");
        int i = 10;
        int i2 = 010; // 八进制0
        int i3 = 0x10; // 十六进制0x  0~9 A~F

        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);  // false

        float f = 0.1f;
        double d = 1.0/10;
        System.out.println(f);
        System.out.println(d);
        System.out.println(f==d);  // true

        float d1 = 22221133333f;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);

        // 字符扩展
        System.out.println((int)'a');   // 97
        System.out.println((int)'b');   //98
        System.out.println((int)'中');   // 20013

        System.out.println('\u0061'); //a
        System.out.println("Hello\tWorld");  // 制表符
        System.out.println("Hello\nWorld");  // 换行

        // 字符串扩展
        System.out.println("abc"=="abc"); // true
        String s1 = "abc";
        String s2 = "abc"; // 存储的是值
        String s3 = new String("abc"); // 存储的是引用
        System.out.println(s1 == s2); // true
        System.out.println(s3 == s2); // false


    }
}
class Dog{
    // 可以空类
}
class Target{
    // 非公开，也可以有主方法
    public static void main(String[] args){
        // psvm Tab快速生成入口函数
        System.out.println("Hello World!");
    }
}
