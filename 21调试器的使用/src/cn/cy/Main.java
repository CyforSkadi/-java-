package cn.cy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//step over:单行执行  step into:进入自定义函数  force step into:进入任何一个函数
//resume program:执行程度直到再次遇到断点
//条件中断：断点上右键,condition中输入条件
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random(42);
        int n = random.nextInt(1000) + 1;
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt());
        }
    }
}
