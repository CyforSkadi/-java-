package ex2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Mike", 22, 3.4);

        Person p1 = new Person();
        Person p2 = new Student(); //学生是一个人，可以赋值给Person对象
        // Student s1 = new Person(); //人不是一个学生，不能赋值给Student对象
        ((Student)p2).setGrade(3.6); //p2是一个Person对象，没有setGrade方法，
                                    // 需要类型转换为Student对象才能调用(向上转型),向下转型有风险

        System.out.println(p2 instanceof Student); //判断p2是否是Student实例
        System.out.println(p2 instanceof Person); //p2即是Student实例也是Person实例
    }
}
