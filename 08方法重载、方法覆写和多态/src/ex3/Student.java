package ex3;

public class Student {
    protected double regularGrade;
    protected double finalGrade;

    public Student(double regularGrade, double finalGrade){
        this.regularGrade = regularGrade;
        this.finalGrade = finalGrade;
    }

    public double totalMarks(){
        return finalGrade;
    }
}
