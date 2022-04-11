package cn.cy;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[] {
                new Student(),
                new Teacher(),
                new Student()
        };

        for (Person p : persons) {
            p.twice();
        }
    }
}

//不会被实例化的类可以定义为抽象类
abstract class Person {
    //抽象类的方法可以定义为抽象方法,不需要实现,而靠子类继承覆写
    public abstract void foobar();
    //抽象类方法不一定为抽象方法
    public void twice() {
        this.foobar();
        this.foobar();
    }
}

class Student extends Person {
    //抽象类的抽象方法子类必须覆写
    @Override
    public void foobar() {
        System.out.println("this is student class");
    }
}

class Teacher extends Person {

    @Override
    public void foobar() {
        System.out.println("this is teacher class");
    }
}
