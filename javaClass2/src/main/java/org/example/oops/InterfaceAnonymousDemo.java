package org.example.oops;

interface Abc{
    void printNumber(int num);
}

interface Calculator{
    int add(int num1, int num2);
}

//these interface methods can be implemented by creating a class and providing implementation.
//Or these can be implemented by Anonymous classes too.
public class InterfaceAnonymousDemo {
    public static void main(String[] args) {
        //implementing by anonymous class
        Abc abc = new Abc() {
            public void printNumber(int num) {
                System.out.println("number is:" +num);
            }
        };
        //implementing by anonymous class with lambda expressions
        Abc abc1 = (int n) -> {
            System.out.println("number is : " +n);
        };

        //implementing by anonymous class
        Calculator calculator = new Calculator() {
            public int add(int num1, int num2) {
                return num1+num2;
            }
        };

        //implementing by anonymous class with lambda expressions
        Calculator calculator1 = ( n1, n2) -> { return n1+n2;}; 
        //only statements can be used without return, if there is assignment then we will use return keyword

        int result = calculator1.add(5,3);
        System.out.println("sum:" +result);


        // Calculator calculator1 = Integer::sum;
    }
}
