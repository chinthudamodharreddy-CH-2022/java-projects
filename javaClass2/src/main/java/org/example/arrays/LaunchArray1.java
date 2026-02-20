package org.example.arrays;

import java.sql.Array;
import java.util.Scanner;

public class LaunchArray1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("enter the marks of class "+i+ "of student:" +j);
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("students marks are saved as follow:");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }
}
