package day04nestedifswitch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {

        Scanner inputt = new Scanner(System.in);

        System.out.println("Enter the first number...");
        double firstNum = inputt.nextDouble();

        System.out.println("Enter the second number...");
        double secondNum = inputt.nextDouble();

        System.out.println("Enter the operation among +, -, *, /");
        char operation = inputt.next().charAt(0);

        switch(operation){

            case '+':
                System.out.println(firstNum + secondNum);
                break;
            case '-':
                System.out.println(firstNum - secondNum);
                break;
            case '*':
                System.out.println(firstNum * secondNum);
                break;
            case '/':
                System.out.println(firstNum / secondNum);
                break;
            case '%':
                System.out.println(firstNum * secondNum/100);
                break;
            default:
                System.out.println("That operation was not supported by this calculator");
        }
    }
}
