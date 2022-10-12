package day03_Scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the heigth of the rectangular prism");
        int h = input.nextInt();

        System.out.println("Enter the length of the rectangular prism");
        short l = input.nextShort();

        System.out.println("Enter the width of the rectangular prism");
        byte w = input.nextByte();

        System.out.println("Your rectangular prism's total area is: " + (4*h*l + 2*w*l));



    }


}
