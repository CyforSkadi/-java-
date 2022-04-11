package ex2;

//覆写Override
//子类的同签名函数覆盖父类的同签名函数
public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.foobar();

        Person p = new Student();
        p.foobar();
    }
}

class Person{
    public void foobar(){
        System.out.println("Person: foobar");
    }
}

class Student extends Person {
    @Override //加Override修饰，让编译器检查覆写是否成功
    public void foobar() {
        System.out.println("Student: foobar");
    }
}