package org.example.oops;

//Abstract class : where only methods are declared but not implemented and these methods will be inherited and implemented in the child class.

//partial abstraction : if a class i having both abstract and concrete methods then it will be partial abstraction.
abstract class Animal2{
    public abstract void eat();
    public abstract void sleep();

    public void run(){
        System.out.println("animals runs faster than humans");
    }
}

class Lion2 extends Animal2{
    @Override
    public void eat() {
        System.out.println("lion2 hunts and eats");
    }

    @Override
    public void sleep() {
        System.out.println("lion2 eats and sleeps");
    }
}

class Deer2 extends Animal2 {
    public void eat(){
        System.out.println("deer2 eats less");
    }

    public void sleep(){
        System.out.println("deer2 sleeps more");
    }
}

class Forest{
    public void Persist(Animal2 animal2){
        animal2.eat();
        animal2.sleep();
    }
}

public class OopsAbstraction {
    public static void main(String[] args) {

        Deer2 deer2 = new Deer2();
        Lion2 lion2 = new Lion2();

        Forest forest = new Forest();
        forest.Persist(lion2);
    }
}
