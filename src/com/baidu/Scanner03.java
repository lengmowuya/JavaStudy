package com.baidu;
import java.util.Scanner;
public class Scanner03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float f= 0.0f;
        System.out.println("请输入整数:");
        if(scanner.hasNextInt()){
            i = scanner.nextInt();
            System.out.println("整数:"+i);
        }else{
            System.out.println("ERROR-输入的不是整数");
        }

        System.out.println("请输入小数:");
        if(scanner.hasNextFloat()){
            f = scanner.nextFloat();
            System.out.println("小数:"+f);
        }else{
            System.out.println("ERROR-输入的不是小数");
        }
        scanner.close();
    }
}
