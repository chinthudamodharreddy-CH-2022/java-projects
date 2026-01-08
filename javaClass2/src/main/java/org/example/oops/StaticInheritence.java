package org.example.oops;

class Parent2{
    public static void eats(){
        System.out.println("parents eats along with their children");
    }
}

class Child extends Parent2{

//    public static void eats(){
//        System.out.println("parents eats along with their children");
//    }

    //here a static method is overridden, due to that this method becomes as specialised method and cant be accessed with the parent.ref to the child class object.
    //since it's a specialised class it can be accessed by creating the child class object of same ef type.

    public static void eats(){
        System.out.println("chilldren wont eat healthy");
    }
}
public class StaticInheritence {
    public static void main(String[] args) {
        //child class with parent reference
//       Parent2 parent2 = new Child();
//       parent2.eats();
        //child class with same reference
        Child child = new Child();
        child.eats();
    }
}
