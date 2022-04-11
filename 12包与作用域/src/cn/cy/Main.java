package cn.cy;
//源码 cn->cy->Main.java
//包  cn->cy->Main.class

import java.util.Arrays;
//导入静态方法
import static java.lang.System.*;


public class Main {
    public static void main(String[] args) {
        int[] xs = new int[] {1,2,3};
        //使用完整类名
        String result = java.util.Arrays.toString(xs);
        //使用import
        String result1 = Arrays.toString(xs);

        out.println(3);
    }
}

//编译器寻找完整类名步骤
//1、是否在import语句的包中
//2、是否在当前Package
//3、是否在import*中
//4、是否在java.lang中
//5、如未找到，报错
