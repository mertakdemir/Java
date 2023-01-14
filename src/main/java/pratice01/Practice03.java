package pratice01;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;

public class Practice03 {

    public static void main(String[] args) {




        //) Type code to draw the following image by using a for loop.
        //A A A A A A A A
        //A X X X X X X A
        //A X X X X X X A
        //A X X X X X X A

        int rows = 4, columns = 8;

        for (int i = 1; i<=rows; i++) {

            String a = "";

            if (i == 1) {

                for (int k = 1; k <= columns; k++) {

                    a = a + "A" + " ";
                }
                System.out.println(a);
            }else {
                a = a + "A" + " ";

                for (int m = 2; m<columns; m++){

                    a = a + "X" + " ";

                }
                a = a + "A" + " ";
                System.out.println(a);


            }
        }

        String str = "abc abc abc abc bcd bcd cde";

        str = str.replaceAll("\\p{Punct}", "");

        String arr[] = str.split(" ");


        Map<String, Integer> myMap = new HashMap<>();

        for (String w : arr){
            Integer numOfOccurrence = myMap.get(w);

            if (numOfOccurrence == null){
                myMap.put(w, 1);
            } else {
                myMap.put(w, numOfOccurrence+1);
            }
        }

        System.out.println(myMap);

        //Type code to print digits just in the decimal part of the given decimal number with an
        //asterix. For example; 75.4238 Ş *4*2*3*8

        double decimal = 75.4238;

        String a = String.valueOf(decimal);

        int idx = a.indexOf(".");
        String s = a.substring(idx+1);

        String result = "";

        for (int i = 0; i<s.length(); i++){

            String b = s.substring(i, i+1);

            result = result + b + "*";
        }
        System.out.println(result);











    }

}

























