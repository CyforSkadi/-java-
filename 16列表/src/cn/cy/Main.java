package cn.cy;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//List是一个接口，由ArrayList和LinkedList实现
public class Main {
    public static void main(String[] args) {
        //<>里面是泛型，表明列表里元素都是Integer(不能是int)
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(0,4);
        //list里面对象默认是Object
        for (Object s : list){
            System.out.println(s);
        }

        //List.of创建不可变列表
        List<String> list1 = List.of("Hello","world");

        List<String> list2 = new ArrayList<>();
        list2.add("hello");
        list2.add("world");
        list2.add("!");
        list2.remove("world"); //查找和删除中采用equal进行比较而不是==
        System.out.println(list2.toString());

        List<Student> students = new ArrayList<>();
        students.add(new Student("21321424", "Mike"));
        students.add(new Student("64333242", "Jack"));
        Student x = new Student("64333242", "Jack");
        //contains()会调用equals，如果没有定义会使用Object的equals方法比较
        System.out.println(students.contains(x));
    }
}

//自己构造的类放入列表需要实现equals方法
class Student {
    private String name;
    private String stuId;

    public Student(String stuId, String name){
        this.name = name;
        this.stuId = stuId;
    }

    @Override
    public boolean equals(Object obj) {
        //先判断是不是Student对象且不是null
        if (obj instanceof Student){
            //恒等需要满足：自反、对称性、传递性
            //先将obj转换为Student对象
            Student stu = (Student) obj;

            //判断二者stuId是否为null
//            if (this.stuId == null && stu.stuId == null){
//                return true;
//            } else if (this.stuId != null) {
//                return this.stuId.equals(stu.stuId);
//            }

            //或者直接使用Objects的equals方法实现与上述相同的功能
            return Objects.equals(this.stuId, stu.stuId);
        }
        return false;
    }
}