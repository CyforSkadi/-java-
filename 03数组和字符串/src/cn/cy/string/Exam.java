package cn.cy.string;

public class Exam {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);
        System.out.println(s1.charAt(2));

        String s2 = new String(s1);
        System.out.println(s1.equals(s2));//比较值

        String s3 = null;
        //s3.equals("abc");//报错NullPointerException，指向null的对象不能调用任何方法
    }
}
