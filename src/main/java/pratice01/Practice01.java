package pratice01;

import java.util.*;

public class Practice01 {



    public static void main(String[] args) {

//Ask user to enter his/her name, surname and credit number and convert all characters in
        //name and surname to asterics except for the initials. Also convert all numbers in credit card to
        //asterics except for the last 4 digits.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you name, surname and credit card number please");
        String fullNameAndCardNumber = scan.nextLine();

        String hiddenName = fullNameAndCardNumber.split(" ")[0];
        String hiddenSurname = fullNameAndCardNumber.split(" ")[1];
        String hiddenCardNumber = fullNameAndCardNumber.split(" ")[2];

        hiddenName = hiddenName.replaceAll("[a-z]", "*");
        hiddenSurname = hiddenSurname.replaceAll("[a-z]", "*");

        String hiddenNum = "";

        for (int i = 0; i<hiddenCardNumber.length(); i++) {

            if (i < hiddenCardNumber.length() - 4) {

                hiddenNum = hiddenNum + "*";

            } else {

                hiddenNum = hiddenNum + hiddenCardNumber.charAt(i);
            }


        }
        System.out.println(hiddenName + " " + hiddenSurname + " " + hiddenNum);
    }
}
