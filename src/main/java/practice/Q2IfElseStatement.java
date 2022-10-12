package practice;

import java.util.Scanner;

public class Q2IfElseStatement {
    public static void main(String[] args) {
        //Ask user to enter his weight and height.
        // Calculate body index of the user.
        // To calculate body mass index use "bodyMassIdx = weight / squareOfHeigth" formula.
        // ** 1) body mass inx less than 18.5 ==> "You are weak".
        // ** 2) bodyMaxInx between 18.5 -25 ==> Your weight is ideal
        // ** 3) bodyMassIndex between 25-30 ==> You are fat
        // **4) bodyMassIndex greater than 30 ==> Obese

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your weight");
        double weight = scan.nextDouble();
        System.out.println("Enter your height");
        double height = scan.nextDouble();

        if (weight/(height*height)>0 && weight/(height*height)<18.50){
            System.out.println("You are weak");
        } else if (weight/(height*height)>=18.50 && weight/(height*height)<25){
            System.out.println("Your weight is ideal");
        } else if (weight/(height*height)>=25 && weight/(height*height)<30){
            System.out.println("You are fat");
        } else if (weight/(height*height)>=30){
            System.out.println("Obese");
        } else {
            System.out.println("invalid numbers");
        }
    }
}
