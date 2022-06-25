package com.array;
import java.util.Arrays;
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] a =  {1,88,3058304,55,2,1,-99,2,345,523,352,154,2348};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }
    public static int[] sort(int[] array){
        int temp = 0;
        for(int i =0;i<array.length-1;i++){
            boolean flag = false;
            for(int j = 0;j<array.length-1;j++){
                if(array[j+1] < array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                break;
            }
        }
        return array;
    }
}
