package org.example.oops;

class Student{

    String name;
    int age;

    public Student(){
        System.out.println("zero args constructor of student is called");
    }

    public Student(String name, Integer age) {
        System.out.println("parameterised constructor of student is called to assign values during object creation");
        System.out.println(this.name = name);
        System.out.println(this.age = age);

    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }

}
public class exp {
    public static void main(String[] args) {
        Student std = new Student("dhamu",25);
        std.display();
    }
}
