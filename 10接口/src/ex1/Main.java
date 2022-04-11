package ex1;

public class Main {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.run();
    }
}


//abstract class Person {
//
//    public abstract void take();
//    public abstract void run();
//
//}

//接口Interface:不含有字段，且只含有抽象方法的抽象类可以封装为接口
interface Person {
    void greeting();
}

interface Student extends Person {
    void run();
}

//通过implements表示与接口的实现关系
class Foobar implements Student {

    @Override
    public void greeting() {
        System.out.println("this is student class");
    }

    @Override
    public void run() {

    }
}

//接口的默认方法:实现接口的时候可以不覆写
interface InterfaceA {
    default void run(){
        System.out.println("default method");
    }
}

class ClassA implements InterfaceA {

}