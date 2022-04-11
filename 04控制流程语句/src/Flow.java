public class Flow {
    public static void main(String[] args) {
        int score = 78;
        //条件分支 慎用等于== 尤其是比较浮点数
        if (score >= 90){
            System.out.println("A");
        } else if (score >= 80){
            System.out.println("B");
        } else if (score >= 70){
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        String s = "Bob";
        switch (s){
            case "Alice":
                System.out.println(1);
                break;
            case "Bob":
                System.out.println(2);
            default:
                System.out.println(0);
        }



    }
}
