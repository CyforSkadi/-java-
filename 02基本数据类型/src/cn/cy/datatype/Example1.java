package cn.cy.datatype;

public class Example1 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(x);
        float y = -2.3e12f; //默认浮点数类型为double，需要加上f转换为float
        System.out.println(y); //println()函数具有多态，可以接受不同类型输入

        byte b = 123;
        System.out.println(b); //字节型变量范围为-128~127

        char c1 = 'A';
        System.out.println(c1);
        char c2 = '中';
        System.out.println(c2);

        boolean b1 = true;
        System.out.println(b1);
    }
}
