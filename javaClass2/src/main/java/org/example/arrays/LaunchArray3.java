package org.example.arrays;

import java.util.Arrays;

public class LaunchArray3 {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for(int a: arr){
            System.out.print(a);
        }

        System.out.println();

        //using pre defined arrays class static methods
        Arrays.sort(arr);

        //after sorting
        for(int a: arr){
            System.out.print(a);
        }
        System.out.println();

        //to convert the array into string
        String str = Arrays.toString(arr);
        System.out.println(str);




    }


}
