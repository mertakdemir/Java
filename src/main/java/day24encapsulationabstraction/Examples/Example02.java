package day24encapsulationabstraction.Examples;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class Example02 {
    public static void main(String[] args) {


        //How to check the number of repeated elements in a List
        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(21);
        myList.add(14);
        myList.add(15);
        myList.add(12);
        myList.add(21);
        myList.add(14);


        Map<Integer, Integer> myMap = new HashMap<>();

        for (Integer w : myList){

            Integer numOfOccurrence = myMap.get(w);

            if (numOfOccurrence == null){
                myMap.put(w, 1);
            }else {
                myMap.put(w, numOfOccurrence+1);
            }
        }

        Collection<Integer> myValue = myMap.values();

        Integer counter = 0;

        for (Integer w : myValue){
            if (w>1){
                counter++;
            }
        }
        System.out.println("There are " + counter + " repeated elements");
    }
}






























