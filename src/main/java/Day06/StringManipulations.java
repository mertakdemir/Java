package Day06;

public class StringManipulations {
    public static void main(String[] args) {

        String name= "        Tom12     Hanks!....  Hello...     ";
        int numOfLetters= name.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters);

        int a = name.replaceAll("[^ ]", "").length();
        System.out.println(a);

    }
}
