package ex1;

//重载 Overload
//函数签名:函数名、参数列表类型,不包括返回类型
public class Main {
    public static void main(String[] args) {
        AClass obj = new AClass();
        obj.foobar(32,53);
    }
}

class AClass {
    public void foobar(int x){
        System.out.println("foobar(int x):" + x);
    }

    public void foobar(String s){
        System.out.println("foobar(String s):" + s);
    }

    public void foobar(int x, int y){
        System.out.println(x + y);
    }
}