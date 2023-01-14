package atmpractice;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account{

    Scanner input = new Scanner(System.in);

    Map<Integer, Integer> data = new HashMap<>();

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    boolean flag = true;


    public void login(){

        do {
            data.put(1234, 2341);
            data.put(2345, 3452);
            data.put(3456, 4563);
            data.put(4567, 5674);

            try{
                System.out.println("Enter your Account number");
                setAccountNumber(input.nextInt());
                System.out.println("Enter your Pin number");
                setPinNum(input.nextInt());

            }catch (Exception e){
                System.out.println("Invalid Account or Pin number, please try again or press 'q' to exit");
            }

            String exit = input.nextLine();

            if (exit.equalsIgnoreCase("q")){

                System.out.println("See you later");

                flag = false;
            }

            int count = 0;

            for (Map.Entry<Integer, Integer> w : data.entrySet()){

                if (w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNum())){

                    selectAccount();
                } else {

                    count++;
                }
            }

            if (count == data.size()){

                System.out.println("You have entered wrong Account or Pin number");
                System.out.println("Please try again or press 'q' to exit");

                String quit = input.nextLine();

                if (quit.equalsIgnoreCase("q")){

                    System.out.println("See you later");

                    flag = false;
                }
            }
        }while (flag);
    }

    public void optionsDisplay(){
        System.out.println("Pick the number you would like to do");
        System.out.println("1: View Balance");
        System.out.println("2: Withdraw");
        System.out.println("3: Deposit");
        System.out.println("4: Quit");
    }

    public void selectAccount(){

        System.out.println("Select the number of accounts you would like to access");

        System.out.println("1: Checking Account");
        System.out.println("2: Saving Account");
        System.out.println("3: Quit");

        int options = input.nextInt();

        switch (options){

            case 1:
                System.out.println("You are in your checking account");
                getChecking();
                break;
            case 2:
                System.out.println("You are in your saving account");
                getSaving();
                break;
            case 3:
                System.out.println("See you later");
                flag = false;
                break;
            default:
                System.out.println("Invalid number");

        }


    }

    public void getChecking(){

        do {
            optionsDisplay();

            int option = input.nextInt();

            if (option == 4){

                break;
            } else{

                switch (option){

                    case 1:
                        System.out.println("Your current balance is: " + moneyFormat.format(getCheckingBalance()));
                        break;
                    case 2:
                        getCheckingWithdraw();
                        break;
                    case 3:
                        getCheckingDeposit();
                        break;
                    default:
                        System.out.println("Invalid option");
                }

            }
        }while (flag);
        selectAccount();
    }

    public void getSaving(){

        do {
            optionsDisplay();

            int option = input.nextInt();

            if (option == 4){

                break;
            } else {

                switch (option){

                    case 1:
                        System.out.println("Your current balance is: " + moneyFormat.format(getSavingBalance()));
                        break;
                    case 2:
                        getSavingWithdraw();
                        break;
                    case 3:
                        getSavingDeposit();
                        break;
                    default:
                        System.out.println("Invalid option");
                }

            }


        }while (flag);
        selectAccount();
    }
}
