package day03_Scanner;

import java.util.Scanner;


public class Scanner04 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first, middle, last name and SSN");
        String firstName = input.next();
        String middleName = input.next();
        String lastName = input.next();
        long SSN = input.nextLong();

        System.out.println("Your name is " + firstName + ", and your middle name is " + middleName + ", and your last name is " + lastName + ", and your SSN is " + SSN);

    }
}
