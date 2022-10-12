package day19_practice;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_TernaryPractice {
    public static void main(String[] args) {



    /*/*
     * Type code to find the common elements between two String Arrays
     * (without case sensitivity)
     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     * Output : [brad,sofia,emily]

     */


    String arr[] = {"John", "Brad", "Angel", "Sofia", "Emily"};
    String brr[] = {"sofia", "brad", "grace", "emily", "hazel"};
    List<String> a = new ArrayList<>();

    for (String w : arr){
        for (String u : brr){

            if (w.equalsIgnoreCase(u)){
                a.add(w);
            }
        }
    }
        System.out.println(a);




        ////Ask user to enter an integer and print "even" on the console for even integers, increase the value by 3
        //for odd integers and print it on the console by using ternary.

        Scanner input = new Scanner(System.in);
        System.out.println("Integer");
        int b = input.nextInt();


        System.out.println(b%2 != 0 ? b+3 : "Even" );


    }
}