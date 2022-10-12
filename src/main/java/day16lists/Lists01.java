package day16lists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {


        //How to create a List(ArrayList)?

        //1.Way
        ArrayList<Integer> myList = new ArrayList<Integer>();

        //2.Way
        ArrayList<Integer> myList2 = new ArrayList<>();

        //3.Way
        List<Integer> myList3 = new ArrayList<>();  //Common one is 3. way

        //How to print a List on the console?

        System.out.println(myList3); // []

        //How to add elements into a List?
        //Note: add() method puts the elements in insertion order
        myList3.add(12);
        myList3.add(7);
        myList3.add(23);
        System.out.println(myList3);

        //How to add an element into a specific index
        myList3.add(1,50);
        System.out.println(myList3);
        myList3.add(3,99);
        System.out.println(myList3);

        //How to join two Lists

        List<String> a = new ArrayList<>();
        a.add("A");
        a.add("B");
        List<String> b = new ArrayList<>();
        b.add("X");
        b.add("Y");
        b.add("Z");

        a.addAll(b);  //addAll() method puts one list to another one.

        System.out.println(a);

        a.addAll(1,b);
        System.out.println(a);

        //How to get the number of elements in a List?

        int sizeOfA = a.size();  //size() method gives the number of the elements.
        System.out.println(sizeOfA);

        //Note: When you talk about the number of the elements in an Array use "length" method,
        // for the Lists use "size()" method.

        //Example 1: Type code to check if the given list is empty or not.

       //1.Way
        List<Character> c = new ArrayList<>();

       c.add('x');
       c.add('y');

       int sizeOfC = c.size();

       if(sizeOfC == 0){
           System.out.println("The list is empty");
       } else {
           System.out.println("The list is not empty");
       }

       //2.Way: Java created a method to check if a list is empty or not.
       //   isEmpty() method returns true if the list does not have any element.
       //   isEmpty() method returns false if the list has at least one element.

        boolean isEmpty = c.isEmpty();
         if (isEmpty){
             System.out.println("The list is empty");
         } else {
             System.out.println("The list is not empty");
         }

         //Note: If Java has a method for a specific functionality, using the method is preferable.

        //Example 2: Type code to check if the list does not have any element different from space or the list does not have any element
        //  [] ==> Acceptable        [ , , ] ==> Acceptable       [a] ==> Not Acceptable    ...


        List<String> d = new ArrayList<>();

         d.add(" ");
         d.add(" ");
         d.add(" ");
         d.add(" ");
         d.add("a");


        //To be able to use removeAll() method you need List, therefore we created a list contains space character.
        List<String> e = new ArrayList<>();
        e.add(" ");

        //removeAll() method is used to remove multiple elements from a List
        //When you use removeAll() method you will need a List stores the elements you want to remove
        d.removeAll(e);

        System.out.println(d);

        if (d.isEmpty()){
            System.out.println("The list is empty or has just space character");
        } else {
            System.out.println("The list character/s different from space");
        }












    }
}
