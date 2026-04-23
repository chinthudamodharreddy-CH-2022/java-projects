package org.example.generics;

import java.util.ArrayList;
import java.util.List;

class Human{
    int age;
    public void disp(){
        System.out.println("humans are clever");
    }
//
//    public Human(int age){
//        this.age = age;
//    }
//
//    @Override
//    public String toString() {
//        return "Human{" +
//                "age=" + age +
//                '}';
//    }
}

class Student extends Human{

}

class Employee {

}

public class LaunchGen3 {
    public static void main(String[] args) {

        Object obj = new Object();
        Human human = new Human();

        obj = human;
//        System.out.println(obj);

//        ArrayList<Human> humArrayList = new ArrayList<>();
//        ArrayList<Student> stuArrayList = new ArrayList<>();
//
//        humArrayList = stuArrayList;

        //WILD CARD
        ArrayList<?> humList = new ArrayList<>();
        ArrayList<Student> stuList = new ArrayList<>();
        ArrayList<Employee> empList = new ArrayList<>();

        humList = stuList;
        humList = empList;

        //UPPER BOUND - that particular "humanList" collection will either work with Human type or either with child types Human.
        ArrayList<? extends Human> humnList = new ArrayList<>();
        ArrayList<Student> studList = new ArrayList<>();
        ArrayList<Employee> emplList = new ArrayList<>();

        humnList = studList;
//        humList = emplList;

        //Lower Bound - that particular "humanList" collection will either work with Human type or either with parent type.
        //currently there is bo parent for Human, but Object is parent of all, we can store the object collection in humanList.
//        ArrayList<? super Human> humanList = new ArrayList<>();
//        ArrayList<Student> studentList = new ArrayList<>();
//        ArrayList<Employee> employeeList = new ArrayList<>();
//        ArrayList<Object> objectArrayList = new ArrayList<>();


//        humanList = studentList;
//        humanList = employeeList;
//        humanList = objectArrayList;

        ArrayList<Human> humanList = new ArrayList<>();
        humanList.add(new Human());
        humanList.add(new Human());

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student());
        studentList.add(new Student());

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee());
        employeeList.add(new Employee());

        alien(employeeList); //input will be accepted based on the input type if its not valid error is thrown refer below.
        alien(studentList);
        alien(humanList);

    }

    //when the input type of the collections is "Human(Parent)" they alien will take only take list of type Humans.
//    public static void alien(List<Human> list)

    //when the input type of the collections is "?" they alien input type is unknown and it will accept collection of any input type.
//    public static void alien(List<?> list)

    //when the input type of the collections is "? extends Human(Parent)" they alien will take only take list of type Humans and
    //the child types of the humans.
    public static void alien(List<? extends Human> list)
//    public static void alien(List<? super Human> list) //this accepts only Human type collection or it's parent type collection. obj collection will be acccepted here
    {
        for(Human u :list){
            System.out.println(u);
        }
    }

}
