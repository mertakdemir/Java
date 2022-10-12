package day14_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays002 {

    public static void main(String[] args) {

        //Example 1: 09/20/2022 is given, print the date like "Month:09    Day:20     Year:2022"

        String date = "09/20/2022";

        String dateArray [] = date.split("/");

        System.out.println(Arrays.toString(dateArray));

        System.out.println("Month: " + dateArray[0]);
        System.out.println("Day : " + dateArray[1]);
        System.out.println("Year : " + dateArray[2]);


        //Example 2:Get string from user and type code to find the number of words in the String.
        //I like to move it, move it" ==> 7

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence...");
        String str = input.nextLine();

        String arr[] = str.split(" ");

        System.out.println("The number of the words: " + arr.length);


        //Example 3: Count the number of words starts with "a" in the String

        int counter = 0;
        for ( String w : arr){
            if(w.startsWith("a") || w.startsWith("A")){
                counter++;
            }
        }
        System.out.println(counter + " words start with a");


    }
}
