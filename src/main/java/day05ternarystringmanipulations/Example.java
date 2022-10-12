package day05ternarystringmanipulations;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
         /*Ask user ta enter any name of the week, then get second, fourth, and sixth letter of the day name and print them on the console, in the same line.
        For example; if the user enters “Monday” output will be “ody”
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a dayname please");
        String dayName = input.next();
        System.out.print(dayName.charAt(1));
        System.out.print(dayName.charAt(3));
        System.out.print(dayName.charAt(5));

        //Type java code by using if-else statement,
        //if the password is “JavaLearner”, output will be “The password is true”.
        //Otherwise, output will be “The password is false”.

        System.out.println("Password please");
        String psw = input.next();

        if (psw.equals("JavaLearner")){
            System.out.println("true");
        } else{
            System.out.println("false");
        }

        // Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
        //the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.

        System.out.println("int");
        int a = input.nextInt();
        String result = a%2 == 0 ? "Even" : "Odd";
        System.out.println(result);


        String s = "Tom";
        String h = "Hanks";

        System.out.println(s.concat(" ").concat(h));






    }
}
