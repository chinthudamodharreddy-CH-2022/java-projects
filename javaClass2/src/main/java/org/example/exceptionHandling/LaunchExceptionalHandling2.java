package org.example.exceptionHandling;

import java.util.Scanner;

class Alpha1{
    void division() throws ArithmeticException
    {
        System.out.println("division method started");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("enter numerator:");
            int num1 = scan.nextInt();
            System.out.println("enter the denominator:");
            int num2 = scan.nextInt();

            int res = num1 / num2;
            System.out.print("result:" + res);
        }catch (ArithmeticException e){
            System.out.println("exception handled in division method");
            throw e;
        }
        finally {
            System.out.println("division method terminated successfully");
        }

    }
}
public class LaunchExceptionalHandling2 {

    public static void main(String[] args) {
        System.out.println("main method started");
        try {
            Alpha1 a1 = new Alpha1();
            a1.division();
        }catch (ArithmeticException e){
            System.out.println("exception handled in the main method");
        }
        System.out.println("main method terminated successfully");
    }

}
