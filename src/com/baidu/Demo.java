package com.baidu;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        // 创建一个扫描器对象，用于接收键盘数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("使用next方法接收:");
        if(scanner.hasNext()){
            // 使用next方法接收
            String str = scanner.next(); // 程序等待用户输入完毕
            System.out.println("输出的内容为:"+str);
        }
        // 凡是属于IO流的类如果不关闭会一直占用资源，要养成好习惯用完就关掉
        scanner.close();
        // 一定要读取到有效字符后才可以结束输入
        // next()不能获得带空格的字符串，以空格为截止字符串
    }
}
