package org.example.oops;

class Animal{
    public void eat(){
        System.out.println("animal eats to survive");
    }

    public void sleep(){
        System.out.println("animals eats and sleeps");
    }

    public void Persist(Animal animal){
        animal.eat();
        animal.sleep();
    }

}

class Lion extends Animal {
    public void eat(){
        System.out.println("lion hunts and eats");
    }

    public void sleep(){
        //calling the super class method of sleep(). if I want to call the parent class method in the child class.
        super.sleep();
        System.out.println("lion hunts and sleeps");
    }
}

class Deer extends Animal {
    public void eat(){
        System.out.println("deer eats less");
    }

    public void sleep(){
        System.out.println("deer sleeps more");
    }
}

class Monkey extends Animal{
    public void eat(){
        System.out.println("monkey eats banana");
    }

    public void sleep(){
        System.out.println("monkey sleeps on trees");
    }
}
public class OopsPoly1 {
    public static void main(String[] args) {
        Animal lion = new Lion();
//        lion.eat();
//        lion.sleep();

        Deer deer = new Deer();
//        deer.eat();
//        deer.sleep();

        Monkey monkey = new Monkey();
//        monkey.eat();
//        monkey.sleep();

//        Animal animal;
//        animal = monkey;
//        animal.eat();
//        animal.sleep();

        //polymorphism: created a method that decides and runs the methods based on the object/input during the run time.
        //Animal being parent class it has the ability to hold the child class methods.
        Animal animal = new Animal();
        animal.Persist(lion);


    }
}
