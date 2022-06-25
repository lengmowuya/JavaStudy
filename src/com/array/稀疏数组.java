package com.array;
import java.util.Arrays;
public class 稀疏数组 {
    public static void main(String[] args) {
        // 默认棋盘数组
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;
        // 输出源数组
        printArrays(array1);

        // 转为稀疏数组
        int[][] array2 = toSparseArray(array1);
        printArrays(array2);

        // 还原源数组
        int[][] array3 = restoreSparseArray(array2);
        printArrays(array3);
    }
    // 通过稀疏数组还原
    public static int[][] restoreSparseArray(int[][] array){
        int[][] array3 = new int[array[0][0]][array[0][1]];
        for(int i = 1;i< array.length;i++){
            array3[array[i][0]][array[i][1]] = array[1][2];
        }
        return array3;
    }
    // 转换为稀疏数组
    public static int[][] toSparseArray(int[][] array){
        // 获取有效值的个数
        int sum = 0;
        for(int i = 0;i<11;i++){
            for(int j = 0;j<11;j++){
                if(array[i][j]!=0){
                    sum++;
                }
            }
        }
        System.out.println("有效值的个数"+sum);

        // 创建稀疏数组的基本格式和信息
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 11; // 源数组长宽
        array2[0][1] = 11;
        array2[0][2] = sum; // 源数组有效数总数

        // 遍历二维数组，将非零的值，存放在稀疏数组中
        int count = 0;
        for ( int i = 0; i < array.length;i++){
            for(int j = 0;j < array[i].length;j++){
                if(array[i][j] != 0 ){
                    count ++; // 开启新一行
                    array2[count][0] = i;  // 有效值的坐标
                    array2[count][1] = j;
                    array2[count][2] = array[i][j]; // 有效值
                }
            }
        }
        return array2;
    }
    // 输出二维数组
    public static void printArrays(int[][] array){
        for(int[] ints : array){
            for(int anInt : ints){
                System.out.print(anInt+"\t");
            }
            System.out.println();
        }
    }
}
