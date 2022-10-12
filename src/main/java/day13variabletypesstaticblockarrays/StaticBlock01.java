package day13variabletypesstaticblockarrays;

/*
1) If you do not assign any value for "static" and "non-static" variables, Java assigns "default values" to them
but Java does not assign default value for "local variables"

2) Default values are "0" for numeric data types, it is "null" for String, it is false for boolean.
 */

public class StaticBlock01 {
    /*
    1)Java class Loader makes the classes ready to use
    2)When the classes make ready, class members are loaded according to some order.
    main method is the first to be loaded normally
    3)Sometimes we need something to be loaded before main method, for this scenario we use "static block"
    The code inside the "static block" is executed before everything in the class, even before main method.
    4)Rule= "Static" structures can work just with static class members.
       Do not put non-static class members into static methods, it will give error.
    5)"Static block" can be used just with "static variables", because of the fourth rule.
    6)"Static block" is used to initialize "static variables"
     */

    public static double pi;

    public int age = 13;

    static{
        System.out.println("This is static block 1");
        pi = 3.14;
    }

    static{
        System.out.println("This is static block 2");
    }

    public static void main(String[] args) {
        System.out.println("This is main method");


    }
}
