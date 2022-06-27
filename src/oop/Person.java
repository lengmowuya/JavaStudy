package oop;

public class Person {
    String name;
    int age;
    public int money;
    private int count;
    protected String change;
    // 一个类即使什么都不写，他也会存在一个构造器
    public Person(){

    }
    public Person(String name){
        this.name = name;
    }
    // alt + insert生成构造器

    public Person(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
