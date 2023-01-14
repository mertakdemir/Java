package day26exceptions;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args){

        /*

  Count the frequency of the letters in a given String as the format below:
  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";

   */

        String str = "Java is so Good";

        String output = "";

        for (int i = 0; i<str.length(); i++){

            int counter = 0;

            for (int k = 0; k<str.length(); k++){

                if (str.charAt(i) == str.charAt(k)){

                    counter++;
                }
            }
            if (!output.contains(String.valueOf(str.charAt(i)))){

                output = output + str.charAt(i) + counter + " ";
            }
        }
        System.out.println(output);


    }


}


















