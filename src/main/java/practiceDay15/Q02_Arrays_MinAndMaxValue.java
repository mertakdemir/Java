package practiceDay15;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_MinAndMaxValue {
    public static void main(String[] args) {

        //Type code to print the sum of the minimum and maximum value of an integer array.

        int arr [] = {23, 12, 34, 10, 78, 19};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[arr.length-1];

        System.out.println(min + max);


        //Create an Array and first take the number of the elements and then print them on the console.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of employees to store in the Array");

        int length = input.nextInt();

        String arrEmployee[] = new String[length];

        for (int i = 0; i<length; i++){

            System.out.println("Enter " + (i+1) + ". employee name. Please press 'Q' button to quit");

            String employeeNames = input.next();

            if (!employeeNames.equalsIgnoreCase("Q")){
                arrEmployee[i] = employeeNames;
            } else {
                break;
            }

        }
        System.out.println(Arrays.toString(arrEmployee));



    }
}
