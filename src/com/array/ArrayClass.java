package com.array;
import java.util.Arrays;
public class ArrayClass {
    public static void main(String[] args) {
        int[] a = {1,88,3058304,55,2,1,-99,2,345,523,352,154,2348};
        System.out.println(a); // [I@1b6d3586
        // 用方法转化输出
        System.out.println(Arrays.toString(a)); // [1, 2, 345, 523, 352, 154]
        printArray(a);

        // 数组排序 从小到大
        Arrays.sort(a);
        System.out.println(Arrays.toString(a)); // [1, 2, 154, 345, 352, 523]

        // 数组填充 数组2-4下标的被0填充(左闭右开）所以实际变零的是下标2和下标3的
        Arrays.fill(a,2,4,0);
        System.out.println(Arrays.toString(a)); // [1, 2, 154, 345, 352, 523]
    }
    public static void printArray(int[] a){
        for(int i = 0;i< a.length;i++){
            if(i==0){
                System.out.print("[");
            }
            if(i==a.length-1){
                System.out.print(a[i]+"]\n");
            }else{
                System.out.print(a[i]+", ");
            }
        }
    }
}
