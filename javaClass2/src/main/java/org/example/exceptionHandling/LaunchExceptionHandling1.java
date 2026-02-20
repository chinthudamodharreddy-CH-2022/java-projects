package org.example.exceptionHandling;

import java.util.Scanner;

class Alpha{

    void division() throws ArithmeticException
    {
        System.out.println("division method started");
        Scanner scan = new Scanner(System.in);

        System.out.println("enter numerator:");
        int num1 = scan.nextInt();
        System.out.println("enter the denominator:");
        int num2 = scan.nextInt();

        int res = num1 / num2;
        System.out.print("result:" + res);

        System.out.println("division method terminated");
    }

}
public class LaunchExceptionHandling1 {

    public static void main(String[] args) {
        System.out.println("main method started");
        try {
            Alpha a = new Alpha();
            a.division();
        }catch (ArithmeticException e){
            System.out.println("exception handled in the main method");
        }
        System.out.println("main method terminated");
    }
}
