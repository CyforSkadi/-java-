
public class Forloop {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        //对可迭代对象使用foreach遍历
        String[] names = {"Alice","Bob","Clark"};
        for (String name : names){
            System.out.println(name.toUpperCase());//全部转换为大写
        }
    }
}
