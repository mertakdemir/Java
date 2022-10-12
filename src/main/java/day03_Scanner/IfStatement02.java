package day03_Scanner;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day name");
        String dayName = input.next();

        if (dayName.equals("Monday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Tuesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Wednesday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Thursday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Friday")) {
            System.out.println("Weekday");
        }
        if (dayName.equals("Saturday")) {
            System.out.println("Weekend day");
        }
        if (dayName.equals("Sunday")) {
            System.out.println("Weekend day");
        }
        //2.way: if else statement ==> with or => || ==> this sign means "OR" operator in Java

        if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday")){
            System.out.println("Weekday");

        }else if(dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday"))
            System.out.println("Weekend day");
        else{
            System.out.println("Invalid day name");

            /*
Note: "OR" operator in Java ==> ||
"||" can be used just with booleans==> true or false.

To get false from "||" operator everything should be false.

Just a single "true" makes the result true.==>|| is optimistic
To get "false" from || every condition should be false
true || true ==> true
true || false ==> true
false || true ==> true
true || false ==> true
false || false ==> false

 */
        }
    }
}
