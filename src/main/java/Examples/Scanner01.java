package Examples;

import java.util.Scanner;

public class Scanner01 {

    /*
    Scanner class is used to gets the data from user into our codes.
    How do we get the data from the user?
    1.Step: Create an object from "Scanner Class".

    Class Name     Object Name    Assignment Operator   new Keyword      Constructor==>Class Name +(
     Scanner          input             =                  new                  Scanner(System.in);

     2.Step: Give a message to user about the data you ask

     */


       public static void main(String[] args) {

           Scanner input = new Scanner(System.in);

           System.out.println("What is your name");
           String name = input.next();

           System.out.println("What is your fullname");
           String fullName = input.next();
           fullName += input.nextLine();

           System.out.println("How old are you");
           int age = input.nextInt();

           System.out.println("Where are you from?");
           String from = input.next();


           System.out.println("Thanks " + name + ", Your fullname is " + fullName + ", You are " + age + " years old " + ", You are from " + from);











       }
}
