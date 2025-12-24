package org.example.oops;
class Demo1{
    int a,b;

    //this Demo1 0-param constructor will be executed when Demo2() constructor is initialised
    public Demo1(){
        System.out.println("zero param constructor of the Demo1 class");
        a=10;
        b=20;
    }

    public Demo1(int a, int b){
        System.out.println("parameter constructor of demo1 class");
        this.a = a;
        this.b = b;
    }
}

class Demo2 extends Demo1{
    int m,n;

    //constructor's first execution step is always a super method call & if parent class exists it goes to super class and
    // here super method call goes to parent class Demo1 0-param constructor and executes it.
    public Demo2(){
        super();
        System.out.println("zero parameters constructor of the Demo2 class");
        m=30;
        n=40;
    }

    //this calls the 0-param constructor of the parent class without passing params, due to default behaviour of calling super method call.
    // to call param constructor pass the required params to the super method and it will call the constructor with params in the parent/super class.
    public Demo2(int m, int n){

        super(50,60);
//        this();
        System.out.println("parameters constructor of the demo 2 class");
        this.m = m;
        this.n = n;
    }

    public void display(){
        System.out.println("a: " +a);
        System.out.println("b: " +b);
        System.out.println("m: " +m);
        System.out.println("n: " +n);
    }
}
public class OopsConstructorInh {
    public static void main(String[] args) {
        //this initialises the constructor of the Demo2 class
        Demo2 d2 = new Demo2();
        d2.display();

        Demo2 d3 = new Demo2(50,60);
        d3.display();
    }
}
