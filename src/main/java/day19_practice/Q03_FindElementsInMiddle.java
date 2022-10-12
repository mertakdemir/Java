package day19_practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q03_FindElementsInMiddle {

    public static void main(String[] args) {
         /*
        Find the middle element in an integer array
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8        {1 2 3 4 5 6}
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */

        int[ ] a = new int[ ]{12, 5, 8, 13, 15};
        Arrays.sort(a);


        if(a.length%2!=0){
            Integer b = a.length/2;
            System.out.println(a[b]);

        }else{
            Integer b = a.length/2;
            Integer averageValue = (a[b] + a[b-1])/2;   //(12 + 8)/2
            System.out.println(averageValue);
        }
    }
}
