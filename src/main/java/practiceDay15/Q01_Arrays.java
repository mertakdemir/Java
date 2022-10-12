package practiceDay15;

import java.util.Arrays;

public class Q01_Arrays {
    public static void main(String[] args) {
        //Example 1: Type code to check if a specific element exist in an Array or not.
        //1.Way

        String str [] = {"Ellie", "Susan", "Michael", "George", "Tom"};

        String name = "George";

        int counter = 0;
        for ( String w : str){
            if (w.equals(name)){
                counter++;

            }
        }
        if(counter>0){
            System.out.println(name + " exists in the array");
        } else {
            System.out.println(name + " does not exist in the array");
        }

        //2.Way:
        //We will use binarySearch().
        //If the element exists binarySearch() method returns the index of the element.
        //When we need to use binarySearch() method we have to sort the array first and use
        // binarySearch() method.

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));

        int idx = Arrays.binarySearch(str, "George");
        System.out.println(idx);


    }
}
