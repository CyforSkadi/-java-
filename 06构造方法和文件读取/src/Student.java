public class Student {
    //成员变量可以设定默认值
    private String name = "unnamed";
    private int age = 0;
    private double grade = 0.0;

    //构造方法一般为public
    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //构造方法可以有多个,根据参数类型决定调用哪个
    public Student(String name){
        this.name = name;
        this.age = 20;
        this.grade = 4.0;
    }

    //原构造方法会被覆盖
    public Student() {

    }

    public String msg() {
        return "this is " + name + ", age is " + age + ", grade is " + grade;
    }
}
