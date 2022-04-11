package cn.cy;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) throws Exception {
        //<>设置泛型String，jvm会将容器中所有元素都变为String，编译器也会检查输入的元素是不是String类型
        List<String> list = new ArrayList();
        list.add("hello");
//        list.add(2);

        SimpleList<Integer> l = new SimpleList();
        //l.add("hello");
        l.add(2);
        l.add(5);
        //l.add(3.4);
        System.out.println(l);

        int sum = sumOf(l);
    }
    //Number是常见数值类型的父类,如Integer,Double等
    //<? extends T>为泛型的通配符,表示可以接受所有T及T的子类
    //<? super T>表示可以接受所有T及T的父类(直系)
    static int sumOf(SimpleList<? extends Number> list){
        Integer sum = 0;
        for (int i = 0; i < list.length(); i++) {
            sum += list.get(i).intValue();
        }
        return sum;
    }
}

//实现一个简单的List,实现其泛型
//创建泛型时尽量避免new泛型的变量
class SimpleList<T> {
    private Object[] objects;
    private int count;
    private final int capacity = 100;

    public SimpleList() {
        //泛型不能初始化数组
//        objects = new T[capacity];
        objects = new Object[capacity];
        count = 0;
    }

    public int length(){
        return count;
    }

    public void add(T e) throws Exception {
        if (count < capacity){
            objects[count] = e;
            count ++;
        } else {
            throw new Exception("out of memory");
        }
    }

    public T get(int index){
        if (index < 0 || index >= count){
            throw new IllegalArgumentException("lower out of bound");
        }
        return (T)objects[index];
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ");
        for (int i = 0; i < count; i++) {
            sj.add(this.get(i).toString());
        }
        return sj.toString();
    }
}