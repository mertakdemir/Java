package day18_daytimeclassandvarargs;

public class IncrementDecrement01 {

    public static void main(String[] args) {

        int a = 12;

        int b = a++;  // Post increment

        System.out.println(b);
        System.out.println(a);


        int x = 15;

        int y = x--;  // Post decrement

        System.out.println(x);
        System.out.println(y);

        int n = 21;

        int m = ++n; // Pre Increment

        System.out.println(n);
        System.out.println(m);

        int t = 32;

        int u = --t; //Pre Decrement

        System.out.println(t);
        System.out.println(u);


    }
}
