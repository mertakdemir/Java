package day19_stringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {


        //What is "StringBuilder Class" ?
        //"StringBuilder Class" is for creating "Mutable Strings"


        //We use "String Class" to create a String. Why or when we will need "StringBuilder Class"?
        //String Class is "immutable", "StringBuilder Class" is "mutable".



        //String Class is "immutable" because of that it does not change existing value.
        //If you want to assign a new value to a new variable, Java will create a new container inside
        //the "String pool" then will put new value in it, then changes the address pointer to the new container.


        String name = "Tom";

        name = "Mark";

        // If any container does not have any address pointer, "Garbage Collection" removes the container
        //from the memory.  before removing things from memory, Java "finalize" them, without
        //finalizing Java does not remove anything from memory.


        String s = "John";

        String r = "John";

        r = "Sam";


        //I want a separate container whose value is John

        String u = new String("John");


        //If you want to change the value directly, without creating new container in memory you can use
        //"StringBuilder" Class.

        StringBuilder sb = new StringBuilder("Clara");

        sb = new StringBuilder("Jim");


        //How to create a StringBuilder Object
        //1.Way:
        StringBuilder sb1 = new StringBuilder("Clara");
        System.out.println(sb1); //Clara

        //2.Way
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2);//Empty


        sb2.append("Clara ");
        System.out.println(sb2); //Clara


        sb2.append("Ocean ");
        System.out.println(sb2); //ClaraOcean

        sb2.append("Miami ").append("FL ").append("USA");
        System.out.println(sb2); //Clara Ocean Miami FL USA


        //How to learn the capacity in a StringBuilder

        StringBuilder sb3 = new StringBuilder();

        sb3.append("Jackson");
        sb3.append("Mexico");
        sb3.append("The USA");
        sb3.append("...............");

        int numOfChars = sb3.length();
        System.out.println(numOfChars); //20

        int cap = sb3.capacity();
        System.out.println(cap);//16


        //Note: If you exceed the existing capacity, Java will increase the capacity
        //like; 2*Existing Capacity + 2











    }
}
