package day03_Scanner;


import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

         // Example: Get the width and the length of a rectangle from the user and get the area.

        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the rectangle?");
        double length = input.nextDouble();

        System.out.println("What is the width of the rectangle?");
        double width = input.nextDouble();

        System.out.println(length*width);

    }
}
