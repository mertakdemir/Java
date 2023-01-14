package atmpractice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int pinNum;
    private double checkingBalance;
    private double savingBalance;

    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNum() {
        return pinNum;
    }

    public void setPinNum(int pinNum) {
        this.pinNum = pinNum;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double checkingAfterWithdraw(double amount){

        checkingBalance = checkingBalance - amount;
        return checkingBalance;
    }

    public double checkingAfterDeposit(double amount){

        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    public double savingAfterWithdraw(double amount){

        savingBalance = savingBalance - amount;
        return savingBalance;
    }

    public double savingAfterDeposit(double amount) {

        savingBalance = savingBalance + amount;
        return savingBalance;
    }

    public void getCheckingWithdraw(){

        System.out.println("Your current balance is: " + moneyFormat.format(checkingBalance));

        System.out.println("Enter the amount you would like to withdraw");

        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Zero or negative is not acceptable");
            getCheckingWithdraw();
        } else if (amount<=checkingBalance){

            checkingAfterWithdraw(amount);

            System.out.println("Your remaining balance is: " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("You do not have enough money");

        }
    }

    public void getCheckingDeposit(){

        System.out.println("Your current balance is: " + moneyFormat.format(checkingBalance));

        System.out.println("Enter the amount you would like to deposit");

        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("Zero or negative is not acceptable");
            getCheckingDeposit();
        } else {
            checkingAfterDeposit(amount);

            System.out.println("Your remaining balance is: " + moneyFormat.format(checkingBalance));
        }
    }
    public void getSavingWithdraw(){

        System.out.println("Your current balance is: " + moneyFormat.format(savingBalance));

        System.out.println("Enter the amount you would like to withdraw");

        double amount = input.nextDouble();

        if (amount<=0){

            System.out.println("Zero or negative is not acceptable");

            getSavingWithdraw();

        } else if (amount<=savingBalance){

            savingAfterWithdraw(amount);

            System.out.println("Your remaining balance is: " + moneyFormat.format(savingBalance));
        } else {
            System.out.println("You do not have enough money");
        }
    }
    public void getSavingDeposit() {

        System.out.println("Your current balance is: " + moneyFormat.format(savingBalance));

        System.out.println("Enter the amount you would like to deposit");

        double amount = input.nextDouble();

        if (amount <= 0) {

            System.out.println("Zero or negative is not acceptable");

            getSavingDeposit();

        } else {

            savingAfterDeposit(amount);

            System.out.println("Your remaining balance is: " + moneyFormat.format(savingBalance));
        }
    }


}
