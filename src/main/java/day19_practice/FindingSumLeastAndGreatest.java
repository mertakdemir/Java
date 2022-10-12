package day19_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindingSumLeastAndGreatest {

    public static void main(String[] args) {

        //Find the sum of the least and the greatest price given in a String List.
        //Example: List<String> myList = new List<String>{"$12.99", "$8.99", "$23.60", "$54.45"} ==>62.70


        List<String> a = new ArrayList<>();

        a.add("$12.99");
        a.add("$8.25");
        a.add("$23.60");
        a.add("$54.45");



        List<Double> b = new ArrayList<>();

        for (String w : a){
            Double price = Double.valueOf(w.replace("$", ""));
            b.add(price);
        }
        Collections.sort(b);
        double sum = b.get(0) + b.get(b.size()-1);

        System.out.println(sum);








    }
}
