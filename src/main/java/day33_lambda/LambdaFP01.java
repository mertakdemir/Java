package day33_lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaFP01 {

      /*
    The Lambda expression is used to provide the implementation of an interface which has functional interface.
    It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing
     the implementation.
     A lambda expression is a short block of code which takes in parameters and returns a value.
     Lambda expressions are similar to methods, but they do not need a name, and they can be implemented
     right in the body of a method.
     functional programming is called lambda . To type codes in functional programming is shorter, and it is error free.
     In functional programming, we use the methods that were created by Java.
     The usage of structured programing is a longer way to type codes in Java.
     For ex; substring() is created by Java it is error free bec it was created by Java which means that it was tested
     thousands of times before it was deployed. Functional programming can be used for arrays, collections and maps,
     but we cannot use maps directly in functional programming directly. At the beginning we should convert a map to a
     collection, and then we can use maps for functional programming as well ==>How to convert a map into a collection??

      by using entryset() we can convert a map into a set and set is collection then you can use Collections in functional programming.

      1)"Lambda" is functional programming, IT field started to use "Lambda" in Java 8.
      2)In Functional Programming  we focus on "what to do?" but in Structured Programming Language we focus on "how to do?"
      3)Functional Programming can be used just with Arrays and Collections.
      4)By using "entrySet()" java converts Map to Set then you can Functional Programming in Maps as well.
     */

    public static void main(String[] args) {


        List<Integer> l = new ArrayList<>();

        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);

        printElements(l);//8 9 131 10 9 10 2 8

        printElementsFunctional(l);

        printEvenElementsStructured(l);

        printEvenElementsFunctional(l);

        printSquareOfOddElements(l);

        printCubeOfDistinctOddElements(l);

        sumOfSquaresOfDistinctEvenElements(l);

        productOfCubesOfDistinctEvenElements(l);

        getMaxElement01(l);

        getMaxElement02(l);

        getMinValue(l);

        getMinValue2(l);


    }

    //Create a method to print the elements on the console in the same line with a space
    //between two consecutive elements.

    public static void printElements(List<Integer> list) {

        for (Integer w : list) {

            System.out.print(w + " ");
        }

        System.out.println("");
    }

    public static void printElementsFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));//8 9 131 10 9 10 2 8


        System.out.println("");
    }


    //Create a method to print the even elements in the list on the console in the same line with a space
    //between two consecutive elemenets.

    public static void printEvenElementsStructured(List<Integer> list) {

        for (Integer w : list) {

            if (w % 2 == 0) {
                System.out.print(w + " "); //8 10 10 2 8
            }
        }
        System.out.println("");
    }

    public static void printEvenElementsFunctional(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));//8 10 10 2 8


        System.out.println("");
    }

    //Create a method to print the square of odd list elements on the console in the same line
    //with a space between two consecutive elements.

    public static void printSquareOfOddElements(List<Integer> list) {

        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));//81 17161 81

        System.out.println("");
    }

    public static void printCubeOfDistinctOddElements(List<Integer> list) {

        list.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));//729 2248091

        System.out.println("");
    }



    //5) Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquaresOfDistinctEvenElements(List<Integer> list){

        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);

        System.out.println(sum);//168

    }

    //6)Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){

        Integer product = list.stream().distinct().filter(t-> t%2 == 0).map(t-> t*t*t).reduce(1, (t, u)-> t*u);

        System.out.println(product);//4096000

    }

    //7)Create a method to find the maximum value from the list elements

    public static void getMaxElement01(List<Integer> list){

        Integer maxValue = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u)-> t>u ? t : u);//131

        System.out.println(maxValue);//131
    }

    public static void getMaxElement02(List<Integer> list){

        Integer max = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) -> u );

        System.out.println(max);//131
    }

    //8)Create a method to find the minimum value from the list elements(in 2 ways)

    public static void getMinValue(List<Integer> list){

        Integer min = list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u)-> t<u ? t : u);

        System.out.println(min);

    }

    public static void getMinValue2(List<Integer> list){

        Integer min2 = list.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> u);

        System.out.println(min2);




    }
}
