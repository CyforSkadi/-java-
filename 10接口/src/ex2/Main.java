package ex2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Mike"),
                new Student("Jack"),
                new Student("Clark")
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}

class Student implements Comparable{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    //要想排序必须实现Comparable接口中的compareTo方法
    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.name.compareTo(s.name);
    }

    @Override
    public String toString() {
        return this.name;
    }
}