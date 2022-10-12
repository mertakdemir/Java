package day07stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {

        String str = "Java is OOP";

        String result1 = str.replace('O', '*');
        System.out.println(result1);

        String result2 = str.replace("Java", "*");
        System.out.println(result2);

        String st = "Ali is 13 years old, i think he seems 15.";

        //Example 1: Change all digits to "*" in the given String.

        String st1 = st.replace('0', '*').
                     replace('1', '*').
                     replace('2', '*').
                     replace('3', '*').
                     replace('4', '*').
                     replace('5', '*').
                     replace('6', '*').
                     replace('7', '*').
                     replace('8', '*').
                     replace('9', '*');
        System.out.println(st1);

        // If your code doesnt work for all values, it is called "Hard Coding" and "Hard Coding" cannot be accepted.

        //2.Way : Recommended
        st.replaceAll("[0-9]", "*");
        System.out.println(st1);


        /*
            Regex means "Regular Expressions"
            Regex represents a group of data
                All digits: [0-9]
                All lowercase letters: [a-z]
                All uppercase letters: [A-Z]
                All lower and uppercase letters: [a-zA-Z]
                All lower and uppercase letters and digits: [a-zA-Z0-9]
                Some multiple characters like a, e, i, o, u: [aeiou]

                All characters different from digits:[^0-9]
                All characters different from letters:[^a-zA-Z]
                All characters different from vowels:[^aeiou]

                Space character: \\s
                All characters different from space character: \\S

                All digits: \\d
                All characters different from digits: \\D

                All uppercase, lowercase letters and digits and _: \\w
                Different from All uppercase, lowercase letters and digits and _: \\W

                All punctuation marks: \\p{Punct}
         */


        /*
        Type code to check if a password is valid or not for the following conditions;
Password must have at least 8 characters different from space character
Password must have at least 1 symbol
         */

        String pwd = "1a23b46?es";
        //Password must have at least 8 characters different from space character.
        boolean firstRule = pwd.replaceAll("\\s", "").length()>7;
        //Password must have at least 1 symbol
        boolean secondRule = pwd.replaceAll("\\s", "").replaceAll("[a-zA-z0-9 ]", "").length()>0;
        System.out.println("Is the password valid?" + (firstRule&&secondRule));

    }
}
