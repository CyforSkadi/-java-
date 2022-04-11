import java.util.Scanner;

public class Control {
    public static void main(String[] args) {
        System.out.println("hello" + 123);
        //输出语句
        int age = 12;
        String name = "Alice";
        System.out.printf("%s is %d years old", name,age);

        //输入语句
        Scanner scanner = new Scanner(System.in);
        System.out.print("please input your age:");
        age = scanner.nextInt();//读取一个整型变量
        System.out.print("please tell me your name:");
        name = scanner.nextLine();//读取多余回车
        name = scanner.nextLine();//读取一整行
        System.out.printf("%s is %d years old", name,age);
    }
}
