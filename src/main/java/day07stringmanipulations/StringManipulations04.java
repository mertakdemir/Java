package day07stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        String str = "    ";

        boolean empty = str.isEmpty();//isEmpty() method returns true if String does not have any character.
        System.out.println(empty);

        boolean blank = str.isBlank();//isEmpty("") ==>true, isEmpty(" ")==>false
        System.out.println(blank);//isEmpty("") ==>true, isEmpty(" ")==>true

        //Example 1: Check if a String has just letters and spaces in it.

        String s = "Learn Java earn money!";
        boolean result = s.replaceAll("[a-zA-z ]", "").isEmpty();
        System.out.println(result);


        /*Example 2: Check SSN for the following rules.
                 1) It must have just digits.
                 2) It must have 9 digits.
         */

        String ssn = "123A45678";
        boolean firstRule = ssn.replaceAll("[0-9]", "").isEmpty();
        boolean secondRule = ssn.length()==9;
         if(firstRule && secondRule){
             System.out.println("valid");
         } else {
             System.out.println("invalid");
         }
    }
}
