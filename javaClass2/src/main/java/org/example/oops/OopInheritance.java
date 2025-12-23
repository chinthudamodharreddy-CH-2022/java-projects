package org.example.oops;

class Plane{
    void takeOff(){
        System.out.println("plane took off");
    }
    void fly(){
        System.out.println("plane is flying");
    }
}

class PassengerPlane extends Plane{

    //takeOff()
    void fly(){
        System.out.println("passenger plane flies at medium height");
    }

    void landing(){
        System.out.println("plane is landing");
    }
}

public class OopInheritance {
    public static void main(String[] args) {
        Plane parent = new PassengerPlane();
        parent.fly();
        parent.takeOff();
        //parent.landing(); cant ba accessed directly cause its a specialised class and  parent type ref doesn't have landing(),
        // we can access it indirectly by making parent act as child we can access the specialised class of the child
        ((PassengerPlane) parent).landing();
    }
}
