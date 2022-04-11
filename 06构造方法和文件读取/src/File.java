import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

public class File {
    //创建文件读取异常交给jvm处理，读取失败抛出异常
    public static void main(String[] args) throws IOException {
        Student[] students = null;

        //从文件中读取
        //创建输入流
        InputStream is = new FileInputStream("data\\info.txt"); //反斜杠为转义字符，需要再加一个\转移
        //把文件流导入scanner
        Scanner scanner = new Scanner(is, "UTF-8");

        students = new Student[3];
        int count = 0;
        //while循环读取每一行,判断是否有下一行作为条件
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            //通过逗号分割,返回一个String[]
            String[] tokens = line.split(",");
            System.out.println(Arrays.toString(tokens));

            //类型转换
            String name = tokens[0];
            int age = Integer.valueOf(tokens[1]);
            double grade = Double.valueOf(tokens[2]);
            System.out.println(name + "," + age + "," + grade);

            //根据文件中读取的数据构造对象
            Student student = new Student(name, age, grade);
            System.out.println(student.msg());

            //将对象放入数组
            students[count] = student;
            count += 1;
        }

        //遍历对象数组的信息
        for (Student stu : students){
            System.out.println(stu.msg());
        }

        //关闭文件
        is.close();
    }
}



