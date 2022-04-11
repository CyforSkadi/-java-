package cn.cy;

import java.time.DayOfWeek;
import java.util.*;

//Map为一个接口，由HashMap等实现
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 88);
        map.put("Bob", 77);
        map.put("Clark", 99);

        System.out.println(map.get("Alice")); //get()方法根据键获得值，不存在返回null

        //遍历
//        for (String key : map.keySet()){
//            System.out.println(key);
//            System.out.println(map.get(key));
//        }
        //Entry是Map中的键值对
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            String msg = String.format("{%s : %d}", entry.getKey(),entry.getValue());
            System.out.println(msg);
        }

        //枚举map在构造时需要传入枚举的class
        Map<DayOfWeek, String> map1 = new EnumMap<DayOfWeek, String>(DayOfWeek.class);
        map1.put(DayOfWeek.MONDAY,"monday");

        //有序Map通常使用TreeMap
        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("Alice", 88);
        map2.put("Bob", 77);
        map2.put("Clark", 99);
        for (var entry : map2.entrySet()){ //var可以让编译器自动推断数据类型
            String msg = String.format("{%s : %d}", entry.getKey(),entry.getValue());
            System.out.println(msg);
        }

//        Map<Stu, Integer> m = new TreeMap<>(new StuByName()); //TreeMap查找需要传入自定义实现的Comparator
        Map<Stu, Integer> m = new TreeMap<>(new Comparator<Stu>() { //或者直接实现一个匿名Comparator
            @Override
            public int compare(Stu o1, Stu o2) {
                return Integer.compare(o2.getScore(), o1.getScore());
            }
        });
        m.put(new Stu("Alice", 88), 1);
        m.put(new Stu("Bob", 77), 2);
        m.put(new Stu("Clark", 99), 3);
        for (var entry : m.entrySet()){
            System.out.println(entry.getKey());
        }
    }
}

//自定义类放入Map中查询需要实现equals和hashCode
class Student {
    private String name;
    private String firstname;
    private int score;
    private double grade;

    @Override
    public int hashCode() {
        int hash = 0;
        hash += hash * 57 + name.hashCode();
        hash += hash * 57 + firstname.hashCode();
        hash += hash * 57 + score; //int可以直接hash
        hash += hash * 57 + Double.doubleToLongBits(grade); //double类型需要通过二进制编码返回Long

        return hash;
    }
}

class Stu {
    private String name;
    private int score;

    public Stu(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        String msg = String.format("{%s : %d}", name, score);
        return msg;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

}

//实现学生按姓名比较
class StuByName implements Comparator<Stu>{
    @Override
    public int compare(Stu o1, Stu o2) {
        return o1.getName().compareTo(o2.getName()); //逆序只需加上 * -1
    }
}