package oop;

// 一个项目应该只存在一个main方法
public class Application {
    public static void main(String[] args) {
        // 创建对象的时候，会对类中构造器的调用。
        Student Linda = new Student();
        Student Jack = new Student();

        Linda.name = "Linda";
        Linda.age = 23;

        System.out.println(Linda.name);
        System.out.println(Linda.age);
        System.out.println(Jack.name);
        System.out.println(Jack.age);

        Person Ace = new Person();
        System.out.println(Ace.name);

        Person Monster = new Person("Monster");
        System.out.println(Monster.name);
    }
}
