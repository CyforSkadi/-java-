package ex4;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        //person.name = "abd";
    }
}

//类前加final表示类不能被继承,即为继承树的叶子结点
final class Person {
    //字段前加final表示在初始化或构造方法赋值之后不能修改
    public final String name = "unknown";

    //方法前加final表示方法不能被覆盖
    public final void foobar() {

    }
}
