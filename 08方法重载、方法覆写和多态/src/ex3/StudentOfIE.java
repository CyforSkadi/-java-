package ex3;

public class StudentOfIE extends Student {

    public StudentOfIE(double regularGrade, double finalGrade) {
        super(regularGrade, finalGrade);
    }

    @Override
    public double totalMarks() {
        return 0.5 * this.finalGrade + 0.5 * this.regularGrade;
    }

    @Override
    public String toString() {
        return "Regular:" + this.regularGrade + " Final:" + this.finalGrade
                + " Total:" + this.totalMarks();
    }

    public double originMarks() {
        //super.调用被覆盖的父类方法
        return super.totalMarks();
    }
}
