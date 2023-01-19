// import java.util.Scanner;

public class Demo {
    int x;
    int y;

    public Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        Demo d1 = new Demo(2, 3);
        System.out.println("in main before swap " + d1.x + " " + d1.y);
        swap(d1);
        System.out.println("in main after swap " + d1.x + " " + d1.y);// call by referrence
        // int a = 1;
        // int b = 2;
        // System.out.println("in main before swap " + a + " " + b);
        // swap(a, b);
        // System.out.println("in main after swap " + a + " " + b);// call by value
        // }

        // public static void swap(int a, int b) {

        // System.out.println("before swap");
        // System.out.println(a + " " + b);
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println("after swap");
        // System.out.println(a + " " + b);

        //
    }

    public static void swap(Demo D) {
        System.out.println("before swap " + D.x + " " + D.y);
        D.x = D.x + D.y;
        D.y = D.x - D.y;
        D.x = D.x - D.y;
        System.out.println("after swap " + D.x + " " + D.y);
    }
}
