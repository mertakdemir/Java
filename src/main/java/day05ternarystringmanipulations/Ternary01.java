package day05ternarystringmanipulations;

public class Ternary01 {

    //"Ternary" does the same with " if else" by using more simple syntax.

    public static void main(String[] args) {

        //If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"

        int i = 12;

        if(i>0){
            System.out.println("The integer is positive");
        }else {
            System.out.println("The integer is not positive");
        }

        //2.Way: First part will be selected if the condition is true, if the condition is false second part will be selected.

        String result = i>0 ? "The integer is positive" : "The integer is not positive";
        System.out.println(result);

        //Type a program to print the minimum of 2 doubles on the console. Use ternary.
        //12,23 ==>1 12      345, 23 ==> 23

        double d = 56.65, e = 17.68;
        double min =  d>e ? e : d;
        System.out.println(min);

        /*Type code to calculate the absolute value of a number
        For positive numbers and zero absolute value is the same with the number
        For negative numbers to find absolute value multiply the number by -1

         */

        double f = 0;

        double abs = f>=0 ? f : f*-1;//Note: Instead of using ">=", you can use "<". This is better
        double betterAbs = f<0 ? -1*f : f;
        System.out.println(abs);
        System.out.println(betterAbs);
        System.out.println(betterAbs);

        //You have 2 integers;
        // If both of the integers are positive do multiplication
        // otherwise, return "I do not how to multiply"


        int a = 12 , b = 10;

        Object res = a>0 && b>0 ? a*b : "I do not know how to multiply";







        }

    }

