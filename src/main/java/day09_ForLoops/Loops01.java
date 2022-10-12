package day09_ForLoops;

public class Loops01 {
    public static void main(String[] args) {

        //Example 1 : Type code to reverse a String
        // For ex ==> Tom == moT

        String name = "Mark";

        String reversedName = "";

        for ( int i = name.length()-1 ; i>=0 ; i--){

            char ch = name.charAt(i);
           reversedName = reversedName + ch;

        }
        System.out.print(reversedName);
        System.out.println();

        String lastName = "Johnson";

        String reversedLn = "";

        for ( int i =lastName.length()-1 ; i>=0 ; i--){

            char ch2 = lastName.charAt(i);
            reversedLn = reversedLn + ch2;
        }
        System.out.print(reversedLn);
        System.out.println();


        //Example 2 : Find the sum of the integers from 3 to 6

        int sum = 0;

        for ( int i = 3; i<7; i++){

            sum = sum + i;

        }
        System.out.println(sum);

        //Example 3 : Find the multiplication of the integers from 3 to 6

        int multiplication = 1;
        for ( int i = 3; i < 7 ; i++){
             multiplication = multiplication * i;
        }
        System.out.println(multiplication);


        //Example 4 : Type code to find the sum of the digits of an integer
        // 584 ==> 5+8+4 = 17

        int sumOfDigits = 0;
        int num = -584;

        num = Math.abs(num);

        for ( int i = 584; i>0; i=i/10){

            sumOfDigits = sumOfDigits + i%10;

        }
        System.out.println(sumOfDigits);
    }
}
