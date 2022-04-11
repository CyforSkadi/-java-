package ex2;

//学生类继承自人类,但不能访问其private成员,但可以访问protected和public成员
public class Student extends Person{
    protected double grade;

    public Student() {

    }

    public Student(String name, int age, double grade) {
        super(name, age); //如果父类定义了构造方法，子类构造方法需要调用父类构造方法，即添加super();
        this.grade = grade; //独有的属性单独处理
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String msg() {
        return name + "," + age + "," + grade;
    }
}
