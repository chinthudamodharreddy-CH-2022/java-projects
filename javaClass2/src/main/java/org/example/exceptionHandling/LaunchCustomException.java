package org.example.exceptionHandling;

import java.util.Scanner;

class InvalidCustomerException extends RuntimeException{
    public InvalidCustomerException(String msg){
        super(msg);
    }

}
class ATM {
    private int acc_number = 1234;
    private int pass_wd = 1224;

    int ac;
    int pw;

    public void takeInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the acc number");
        ac = scan.nextInt();
        System.out.println("enter the password");
        pw = scan.nextInt();
    }

    public void verify(){
        if(acc_number == ac && pass_wd == pw){
            System.out.println("collect your cash");
        }else {
            InvalidCustomerException ice = new InvalidCustomerException("invalid credentials");
            //System.out.println("invalid credentials, please try again");
            throw ice;

        }
    }

}

class Bank{
    public void initiate(){
        ATM atm = new ATM();
        try {
            atm.takeInput();
            atm.verify();
        }catch (RuntimeException e){
            //System.out.println(e.getMessage());
            System.out.println(e.getMessage());
            //System.out.println("invalid credentials pls try again");
            try{
                atm.takeInput();
                atm.verify();
            }catch (RuntimeException f){
                System.out.println(e.getMessage());
                //System.out.println("invalid credentials pls try again");
                try{
                    atm.takeInput();
                    atm.verify();
                }catch (RuntimeException g){
                    System.out.println(e.getMessage());
                    System.out.println("invalid credentials OUT OF ATTEMPTS BLOCKED!!!");
                }
            }
        }
    }

}

public class LaunchCustomException {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.initiate();
    }
}
