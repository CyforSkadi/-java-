package ex1;

//公共类可以被整个项目访问到，类名必须和文件名一致
public class Main {
    public static void main(String[] args) {
        //实例化
        Student student = new Student();
        student.name = "Jack";
        student.setScore(90);
        System.out.println(student.msg());
    }
}

//包内的类只能被当前文件中的类访问
class Student{
    public String name;
    private int score;

    //定义接口访问私有字段
    public void setScore(int score){
        if (score < 0 || score > 100){
            //输入超限抛出异常
            throw new IllegalArgumentException("score must between 0~100");
        }
        //重复声明了score变量，需要用this关键字区分
        this.score = score;
    }

    public String msg(){
        //方法中变量没有重复声明，会自动加上this关键字
        return name + "," + weightedScore();
    }

    //私有方法类外访问不到
    private int weightedScore(){
        return (int)(this.score * 0.8 + 20);
    }
}