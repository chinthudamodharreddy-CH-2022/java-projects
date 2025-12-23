package org.example.oops;

import java.util.Scanner;

class Farmer{
    float principleAmount;
    float tenure;
    static float rateOfIntrest;

    static{
        rateOfIntrest = 9.0f;
    }

    float simpleIntrest;

    void inputs(){
        System.out.println("provide the details");
        Scanner scan = new Scanner(System.in);
        System.out.println("PRINCIPLE AMOUNT");
        principleAmount = scan.nextFloat();
        System.out.println(":TENURE");
        tenure = scan.nextFloat();
    }

    void calSI(){
        simpleIntrest = (principleAmount*rateOfIntrest*tenure)/100.0f;
    }

    void display(){
        System.out.println("simple intrest:" +simpleIntrest);
    }

}
public class OopsStaticVariable {
    public static void main(String[] args) {
        Farmer farmer = new Farmer();
        farmer.inputs();
        farmer.calSI();
        farmer.display();
    }
}
