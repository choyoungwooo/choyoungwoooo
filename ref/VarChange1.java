package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        //a= 10 b =10
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        //a변경
        //a = 20; b= 10
        a = 20;
        System.out.println("변경 a = "+a);
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        //b변경
        //a=20 b=30
        b = 30;
        System.out.println("변경 b = "+b);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
