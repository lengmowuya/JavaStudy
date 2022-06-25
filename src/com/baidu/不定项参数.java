package com.baidu;

public class 不定项参数 {
    public static void main(String[] args) {
        不定项参数 demo = new 不定项参数();
//        demo.test();
        demo.test(6);
    }
    public void test(int... i){
        System.out.println(i[0]);
    }
}
