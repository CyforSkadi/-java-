package cn.cy.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //申明数组变量
        int[] ns;
        //向jvm申请创建数组，初始化值均为0
        ns = new int[5];
        //0 0 0 0 0 -> 1 0 0 0 0
        ns[0] = 1;

        int[] ns1 = new int[5];
        System.out.println(ns1[0]);

        //创建同时初始化,则不需要给定数组大小
        //或者语法糖：int[] ns = {1,2,3,4,5};
        int[] ns2 = new int[]{1,2,3,4,5};
        System.out.println(ns2[4]);
        //循环输出数组
        for (int i = 0; i < ns.length; i++) {
            System.out.print(ns2[i]);
            System.out.print(' ');
        }
        //迭代器形式循环
        for (int n : ns2){
            System.out.println(n);
        }
        //一次性输出
        System.out.println(Arrays.toString(ns2));
        //排序
        Arrays.sort(ns2);
        System.out.println(Arrays.toString(ns2));

        //多维数组:创建3×3数组时先创建3个引用，3个引用分别指向3个一维数组
        int[][] ns3 = {
                {1,2,3},
                {4,5,6,4,5},
                {7,8,9,3}
        };
        //通过for循环遍历
        for (int[] arr : ns3){
            System.out.println(Arrays.toString(arr));
        }

    }
}
