package day07stringmanipulations;

public class StringManipulations01 {
    public static void main(String[] args) {


        String str =  "Java is easy";
        boolean isExist = str.contains("a");
        System.out.println(isExist);

        boolean result = str.startsWith("F");
        System.out.println(result);

        boolean res = str.startsWith("i", 5);
        System.out.println(res);

        /*
        Example ; Check if the given password
         i) has "A" in any position
         ii) has "xy" at the beginning
         iii) has "W" as 7th character
         iiii) has 8 characters in total
         */

        String pwd = "xyAfdsWt";
        boolean first = pwd.contains("A");
        System.out.println(first);
        boolean second = pwd.startsWith("xy");
        System.out.println(second);
        boolean third = pwd.startsWith("W", 6);
        System.out.println(third);
        boolean fourth = pwd.length()==8;
        System.out.println(fourth);

        String s = "Do practise to be better";

        boolean rslt = s.endsWith("r");
        System.out.println(rslt);

        String t = s.concat("!").concat("...");// concat() method is same with the "+" in Java.

        System.out.println(t);

    }
}
