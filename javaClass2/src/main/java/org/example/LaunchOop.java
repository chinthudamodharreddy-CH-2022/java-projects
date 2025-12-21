package org.example;

class Dog{
    String name;
    int age;
    String color;
    int weight;

    void bark(){
        System.out.println("DOG BARKS");
    }

    void eat(){
        System.out.println("DOG EATS");
    }

    void runs(){
        System.out.println("dog runs");
    }



    void sleep(){
        System.out.println("dog sleeps");
    }
}
public class LaunchOop {
    public static void main(String[] args) {
        Dog dog= new Dog();

        dog.bark();
        dog.sleep();
    }
}
