package day03_Scanner;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day name");
        String dayName = input.next();
        if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("wednesday") || dayName.equalsIgnoreCase("thursday") || dayName.equalsIgnoreCase("friday")){
            System.out.println("Weekday");
        } else if (dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend day");
        }else{
            System.out.println("Invalid day name");
        }
    }
}

