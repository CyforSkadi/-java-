package ex2;

public class Main {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.count);
    }
}

interface Person {
//    public static final int count = 99;
    // 接口中的字段必须是public static final 可以省略
    int count = 99;

}

class Student implements Person {

}