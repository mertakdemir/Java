package practice;

import java.util.Scanner;

public class Q01_IfStatement {
    /*
If the score is less than 50 then you will fail
If the score is greater than 50 then you will pass,

If the score is less than 50 then you will fail otherwise you will pass.(this way is better as it is shorter)
here only one condition will be checked.

if the first part is true then the first action will occur but
if the first condition is false then the second action will occur,this is the logic of "if else".
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        int grade = input.nextInt();

        if(grade<50){
            System.out.println("Failed");
        }else if((grade>=50) && (grade<=100)){
            System.out.println("Passed");
        }else if((grade<=0) || (grade>100)){
            System.out.println("Invalid grade");
        }

    }
}
