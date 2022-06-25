package com.baidu;
import java.util.Scanner;
public class Scanner04 {
    public static void main(String[] args) {
        // 输入多个数字，求其总和及平均数
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m++;
            sum += x;
        }
        System.out.println(m+"-和为"+sum);
        System.out.println(m+"-平均数为"+(sum/m));

        scanner.close();
    }
}
