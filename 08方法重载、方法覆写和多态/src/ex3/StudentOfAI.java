package ex3;

public class StudentOfAI extends Student {

    public StudentOfAI(double regularGrade, double finalGrade) {
        super(regularGrade, finalGrade);
    }

    @Override
    public double totalMarks() {
        return 0.3 * this.regularGrade + 0.7 * this.finalGrade;
    }

    @Override
    public String toString() {
        return "Regular:" + this.regularGrade + " Final:" + this.finalGrade
                + " Total:" + this.totalMarks();
    }
}
