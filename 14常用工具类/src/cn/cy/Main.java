package cn.cy;

import java.util.Random;
import java.util.StringJoiner;

//java.lang
//1、StringBuilder 构建字符串
//2、StringJoiner 字符串拼接
//3、Integer 包装
//4、Math/StrictMath 数学方法
//5、Random 伪随机数
public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(23);
        sb.append(25);
        sb.insert(1,"abc");
        System.out.println(sb.toString());

        int[] arr = new int[] {12,24,56,66};
        StringJoiner sj = new StringJoiner(", ","[","]");
        for (int x : arr){
            sj.add(Integer.toString(x));
        }
        System.out.println(sj.toString());

        int x = Integer.valueOf("123");
        int y = Integer.parseInt("123");
        System.out.println(x + y);

        System.out.println(Math.PI);
        System.out.println(Math.random());

        Random random = new Random(42);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(10));
        }
    }
}
