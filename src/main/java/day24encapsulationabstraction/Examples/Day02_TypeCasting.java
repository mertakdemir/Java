package day24encapsulationabstraction.Examples;

public class Day02_TypeCasting {


    /*

Type casting; converting a number primitive data type to another number primitive data type.For ex;
while using data type convert as 'byte' convert to 'int'. Normally it is byte but it will behave like
 byte. (You can't change char or boolean data types, as they are not numeric data types).



byte - short - int - long - float-double

For ex;

**If you convert small data type to large dat type it is called 'Auto widening'.
**If you convert large data type to small data type it is called 'Explicit Narrowing'.

     */
    public static void main(String[] args) {
        byte age = 12;
        int myAge = age;

        short populationOfVillage = 21000;
        int populationOfMyVillage = populationOfVillage;
        System.out.println(myAge + populationOfMyVillage);

        short pieces = 15;
        int morePieces = pieces;
        System.out.println(morePieces);


        //Explicitly narrowing

        double x = 23.45;
        long y = (long) x;
        System.out.println(y);

       int a = 15;
       byte b = (byte) a;
       System.out.println(b);

        //Example 1: Create 2 integer variables and a String value

        int i = 13, k = 21;
        String s = "Tom";
        System.out.println(s + k*i);

        int result = 3 -2 *(5+2*3) /11;
        System.out.println(result);

        int ab = 15;
        long abc = ab;
        System.out.println(abc);

        short as = 5;
        byte asd = (byte) as;
        System.out.println(asd);

        short e = 12, r = 13;
        byte t = 14;
        System.out.println(e*r + t);

    }
}





