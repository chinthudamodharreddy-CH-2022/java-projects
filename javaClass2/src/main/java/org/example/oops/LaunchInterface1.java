package org.example.oops;

//by default the methods inside the interface will be public abstract
interface Calc{
    public void add(int n1, int n2);
    int mul();
    public abstract void disp();
}

interface Calc2{
    void divide(int n1, int n2);
}

class Telusko{ 
    public void show(){
        System.out.println("telusko java learnings");
    }

    public void disp(){
        System.out.println("display of class");
    }
}

//class can extend other class and can implement multiple interfaces at once
class MyCalc extends Telusko implements Calc, Calc2{
    @Override
    public void add(int n1, int n2) {
        int res = n1 + n2;
        System.out.println("sum result:" +res);
    }

    @Override
    public int mul() {
        int res;
        res = 4*4;
        return res;
    }

    @Override
    public void disp() {
        System.out.println("addition and multiplication is done differently");
    }

    @Override
    public void divide(int n1, int n2) {
        int res;
        res = n1/n2;
        System.out.println("div result:" +res);
    }
}
public class LaunchInterface1 {
    public static void main(String[] args) {
        //with the parent reference as interface only methods of those interface can be accessed, whereas other interface
        //methods will become as a specialised method to the class
        //Calc calc = new MyCalc();

        MyCalc calc = new MyCalc();
        calc.add(5,2);
        //even though the class is having disp() method from extending Telusko class, the overridden method of disp() will be priortised
        calc.disp();

    }
}
