package day08stringmanipulationloops;

public class StringManipulation01 {
    public static void main(String[] args) {

        String str = "Java is easy. Java is OOP.";

        String result1 = str.replaceFirst("Java", "Apex");
        System.out.println(result1);

        /*
        Example 1 : String shirtPrice = ‘$12.99’;
      String bookPrice = ‘$35.99’;
      Type code to find the sum of the shirt and book prices.
         */

        String a = "$12.99";
        String b = "$35.99";

        String c = a.replace("$", "");
        String d = b.replace("$", "");

        double f = Double.valueOf(c);
        double e = Double.valueOf(d);
        System.out.println(f+e);

        /*
            Example 2: Swap the integers
                       a=12    b=23    ==>    a=23    b=12
        */

        int t = 12, y= 23;
        int temp = 0;

        temp = y;
        y = t;
        t = temp;

        System.out.println(t);
        System.out.println(y);

        /*
        2.way : Without using third variable
         */

        int x = 12, z = 23;

        z = z-x;
        x = z+x;
        z = x-z;


    }
}

