package oop;

public class Student extends Person{
    public void study(){
        System.out.println(this.name+"在学习");
        // 子类继承了弗雷，就会拥有父类的全部方法。
        System.out.println(this.money);
        // 调取到父类属性
        System.out.println(super.name);
    }
}
