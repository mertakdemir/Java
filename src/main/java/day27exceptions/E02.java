package day27exceptions;

public class E02 {

    /*
     1)If you want to execute a code for every scenario, use "finally" block after "try" body
     2)"try" can be used like = i) try + single catch, ii)try + multiple catch, iii)try+catch+finally
     iiii)try+ multiple catch + finally, iiiii)try+ finally
     3)"ArithmeticException", "NullPointerException", "ArrayIndexOutOfBoundsException", "NumberFormatException",
          "StringIndexOutOfBoundsException", "IllegalArgumentException"  are displayed on the console after I click on "Run" button
          therefore those are called "RunTime Exception"
       4)There is "Compile Time Exception", they will be displayed before clicking on the "Run" button.
          Therefore, they are called "Compile Time Exception"
     */

    public static void main(String[] args) {

        divide(6, 0);


    }

    //Create a method to do division then save the result into database

    public static void divide(int a, int b) {

        try {
            System.out.println(a / b + " was saved into database");
        } catch (ArithmeticException e) {
            System.out.println("Do not use zero as divisor");
        } finally {
            System.out.println("Cut the connection with the database");
        }
    }
}