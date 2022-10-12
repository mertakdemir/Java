package day11_Q01;

public class Q01_StringManipulations {
    public static void main(String[] args) {
        //Type code to reverse a string.
        //    Tom Hanks==> sknaH moT

        String name = "Tom Hanks";
        String reversedName = "";

        for (int i = name.length()-1 ; i >=0; i-- ){

            reversedName = reversedName + name.charAt(i);

        }
        System.out.print(reversedName);
        System.out.println();

        //Get the initial from full name.(Middle Name is out of scope).
        //Tom Hanks ==> TH

        String fullName= "   Tom Hanks   ";

        //trim() method removes the spaces just from the beginning and from the end.It does not touch spaces in the middle.
        //substring(startingIndex, endIndex) method is used to get a specific part of a string.
        //starting index is inclusive, ending index is exclusive.

        String initialFirstName=fullName.trim().substring(0, 1).toUpperCase();
        System.out.println("Initial of first name is: " + initialFirstName);

        String initialLastName = fullName.trim().split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println("Initial of the last name:" + initialLastName);

        System.out.println(initialFirstName + initialLastName);
    }
}
