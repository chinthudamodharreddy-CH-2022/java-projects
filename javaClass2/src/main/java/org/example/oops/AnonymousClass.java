package org.example.oops;

class AndriodCall{
    void call(){
        System.out.println("default ui which is bad");
    }
}

//creating a new class and overriding the existing call method to have a custom ui.
//there is a other way around that we can do this without creating a new class and over-riding it. it's called Anonymous class.
class MyAndriod extends AndriodCall{
    @Override
    void call() {
        System.out.println("custom ui which is good");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        AndriodCall obj = new AndriodCall(){
            // ANONYMOUS CLASS: this is the class without name and the methods are over-ridden as per our requirement.
            // We can create new methods here but the problem is we cant call them. when the object type does not know about the method.
            void call(){
                System.out.println("my own custom built ui");
            }

            void show(){
                System.out.println("show method of anonymous class, with the object reference to AndroidCall class");
            }
        };
        obj.call();
        //obj.show(); // we cannot access the show method cause, object of this anonymous class is of type AndroidCall, and it doesn't know about show method.

        new AndriodCall(){
            void call(){
                System.out.println("call from anonymous object");
            }

            void show(){
                System.out.println("show method from, anonymous object");
            }
        }.show(); //here we are able to call show method cause the object AndriodCall is of no type - it's an anonymous object.

        //MyAndriod myAndriod = new MyAndriod();
        //myAndriod.call();
    }
}
