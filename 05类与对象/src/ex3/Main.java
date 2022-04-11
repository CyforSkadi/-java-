package ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        String[] names = {"Alice","Bob","Clark"};
        group.setNames(names);
        System.out.println(group.msg());

        //对象中的names被改变，因为数组是引用
        names[1] = "Duke";
        System.out.println(group.msg());

        //为了避免上述情况发生，在调用对象方法时再创建数组
        group.setNames(new String[] {"Alice","Bob","Clark"});
        names[1] = "Duke";
        System.out.println(group.msg());
    }
}

class Group {
    private String[] names;

    public void setNames(String[] names) {
        this.names = names;
    }

    String msg(){
        return Arrays.toString(this.names);
    }

}