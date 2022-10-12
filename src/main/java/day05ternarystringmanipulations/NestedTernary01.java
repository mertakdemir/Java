package day05ternarystringmanipulations;

public class NestedTernary01 {
    public static void main(String[] args) {
        /*
        Type java code by using nested ternary.
        Write a program to check if a year is leap year or not.
        If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
 */


        int year = 1800;

        String leap = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "Not leap") : (year % 4 == 0 ? "Leap" : "Not leap");

        System.out.println(leap);

         /*
     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'
     Solve the task by using nested-ternary
*/
        String pwd = "Ka1b3cXy";

        String password = pwd.length()>8 ? (pwd.charAt(0) == 'i' ? "Valid" : "Invalid") : (pwd.charAt(0) == 'K' ? "Valid" : "Invalid");
        System.out.println(password);


    }
}
