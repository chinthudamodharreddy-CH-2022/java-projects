package org.example.exceptionHandling;

import java.util.Scanner;

public class LaunchExceptionHandling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("enter the 1st number to divide:");
            int num1 = scan.nextInt();

            System.out.print("enter the 2nd number to divide:");
            int num2 = scan.nextInt();

            int res = num1 / num2;

            System.out.println("result:" + res);

            System.out.println("enter the size of the array");
            int size = scan.nextInt();
            int[] arr = new int[size];

            System.out.println("enter the element to insert in the array");
            int elem = scan.nextInt();

            System.out.println("enter the array position to place the element");
            int position = scan.nextInt();

            arr[position] = elem;

        }
        catch (ArithmeticException ae){
            System.out.println("please enter the valid denominator");
        }
        catch (NegativeArraySizeException e){
            System.out.println("please enter non negative array size");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("enter position with in the range");
        }
        catch (Exception e){
            System.out.println("some exception occurred");
        }
        System.out.println("execution completed successfully");
    }
}
