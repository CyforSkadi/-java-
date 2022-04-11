package ex3;

//多态Polymorphic
//调用方法是看this具体是什么类，就调用什么类中的方法
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new StudentOfAI(80,60),
                new StudentOfIE(80,60)
        };
        for (Student s : students){
            System.out.println(s.totalMarks());
        }

        for (Student s : students){
            System.out.println(s);
        }
    }
}
