package org.example.oops;

//final class does not participate in inheritance, if you add final keyword for Human it throws error.

//final method does participate in inheritance but it can't be over-ridden. if we want parent implementation in child class then this method can be used.
final class Human{
    public final void cry(){
        System.out.println("Humans cry a lot");
    }
}

//when the parent class is final, we can only access the methods by creating object of it. we cant extend them as final class does not participate in inheritance.

//class Employee extends Human{
//    @Override
//    public void cry() {
//        System.out.println("employees cry for lot of things");
//    }
//}
public class OopsFinal {

    public static void main(String[] args) {
        //when the class is not final and the methods id final, we can inherit those methods
        //Human human = new Employee();
        //human.cry();

        //when the class is final, we can only access the methods by creating object of it.
        Human human1 = new Human();
        human1.cry();
    }
}
