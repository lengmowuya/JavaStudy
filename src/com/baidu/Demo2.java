package com.baidu;
import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextLine方法接收：");
        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输出的内容为"+str);;
        }
        scanner.close();
        // nextLine()以Enter为结束符，方法返回的是输入回车之前的所有字符。
        // 可以获得空白
    }
}
