package practice;

public class Q3stringManipulations {
    public static void main(String[] args) {
        /*
         String shirtPrice= "$ 12.99";
         String bookPrice= "$ 35.99";

   Type a code to find the sum of the shirt and book prices.
         */

        String shirtPrice = "$ 12.99", bookPrice = "$ 35.99";

        String shirt = shirtPrice.replace("$ ", "");
        String book = bookPrice.replace("$ ", "");

        double sd = Double.valueOf(shirt);
        double bd = Double.valueOf(book);
        System.out.println(sd + bd);



    }
}
