package day26exceptions;

public class E03 {

    public static void main(String[] args) {

        int r1 = getNumberOfChars("Tom Hanks"); //9
        System.out.println(r1);//9

        int r2 = getNumberOfChars("");
        System.out.println(r2);

        int r3 = getNumberOfChars(null);//NullPointerException: If you use "length()" method with "null" you will get NullPointerException
        System.out.println(r3);


    }

    //Create a method to find the number of characters in a String
    public static int getNumberOfChars(String str){

        int numOfChar = 0;

        try{
         numOfChar = str.length();

        }catch (NullPointerException e){
            System.out.println("A problem occurred in using length()");//null
        }
        return numOfChar;

        }
}
