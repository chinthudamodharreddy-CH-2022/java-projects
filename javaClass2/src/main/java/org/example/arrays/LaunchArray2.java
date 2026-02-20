package org.example.arrays;

import java.util.Scanner;

public class LaunchArray2 {
    public static void main(String[] args) {
        int[][] arr= new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        arr[2] = new int[4];

        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j<arr[i].length; j++){
                System.out.println("enter the marks of class" + i + "student" + j );
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("marks are stored as follows:" );
        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
