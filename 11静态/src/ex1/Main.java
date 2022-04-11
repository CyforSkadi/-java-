package ex1;

import java.time.chrono.HijrahEra;

public class Main {
    public static void main(String[] args) {
        Person mike = new Person();
        mike.name = "Mike";
        mike.count = 4;
        System.out.println(mike.name);
        System.out.println(mike.count);

        //更改了jack中的count但是mike中的count也被更改
        //原因是编译器将jack.count(mike.count) -> Person.count
        Person jack = new Person();
        jack.name = "Jack";
        jack.count = 10;
        System.out.println(mike.count);

        //静态方法不需要实例化就可以使用
        Person.showMsg();

        HeaderMaster hm1 = HeaderMaster.getHeaderMaster();
        HeaderMaster hm2 = HeaderMaster.getHeaderMaster();
        System.out.println(hm1 == hm2); //创建的其实是同一个对象
    }
}

class Person {
    //静态字段保存在Class实例(Person)中而不在Person实例(mike或jack)中
    public static int count;

    public String name;

    public static void showMsg() {
        System.out.println("this is a person class");
        //静态方法不能使用this访问非静态字段和方法
//      System.out.println(this.name);
    }
}

//静态应用：限制类的唯一实例(单例模型)
class HeaderMaster {
    private static HeaderMaster hm = null;

    //提供静态方法让用户创建唯一实例
    public static HeaderMaster getHeaderMaster() {
        if (hm == null) {
            hm = new HeaderMaster();
        }
        return hm;
    }

    //不允许用户实例化
    private HeaderMaster() {

    }
}