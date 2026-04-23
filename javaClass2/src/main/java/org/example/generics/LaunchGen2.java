package org.example.generics;

class Generics<T>{
    private T ref;

    public Generics(T ref){
        this.ref = ref;
    }

    public void display(){
        System.out.println("the type of ref is :" + ref.getClass().getName());
    }

    public T getRef() {
        return ref;
    }
}

public class LaunchGen2 {

    public static void main(String[] args) {
        //here we are passing values of type String to the Generics class and Generics is given ref of Type T,
        //but we can pass
//        Generics<String> gen = new Generics<>("java");
//        gen.display();
//        System.out.println(gen.getRef());

        Generics gen = new Generics(44);
        gen.display();
        System.out.println(gen.getRef());
    }



}


