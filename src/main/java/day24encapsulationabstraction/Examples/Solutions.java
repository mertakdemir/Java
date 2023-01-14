package day24encapsulationabstraction.Examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;

public class Solutions {

    public static void main(String[] args) {

        //Type code to put all zeros to end in an integer array.
        //Example: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        Integer arr[] = {5, 0, 2, 0, 3};
        Integer brr[] = new Integer[arr.length];

        int a = 0;
        int b = arr.length-1;

        for (int i = 0; i<arr.length; i++){
            if (arr[i] != 0){

                brr[a] = arr[i];
                a++;
            } else{

                brr[b] = 0;
                b--;
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}
