package org.example.oops;

abstract class Phone{
    abstract void connect();
}

//we are extending an abstract class and providing the impl. if we are using the the class only once then instead of class,
//we can create and use anonymous class.

class MyPhone extends Phone{
    @Override
    void connect() {
        System.out.println("connect to the dialing number");
    }
}
public class AbstractAnonymousDemo {
    public static void main(String[] args) {
        //useCase: when we want to have a impl for an abstract class, and we want to use it only once, we can use anonymous class.
        Phone obj = new Phone(){
            //in the anonymous class we are over-riding the method and giving body. and calling it.
            public void connect() {
                System.out.println("connect to the dialled number");
            }
        };
        obj.connect();
    }
}
