package org.example.generics;

import java.util.ArrayList;

public class LaunchGen1 {
    public static void main(String[] args) {
        int[] ar = new int[3];

        ArrayList al = new ArrayList();
        al.add("java");
        al.add("devops");
        al.add("c");
        al.add(4);

        //values in the collection, will be stored as object and object is parent of all, so here when we are saving the
        //parent object type into the string type we need to downcast the object into string type
        String data1 = (String) al.get(0);
        data1 = data1.toUpperCase();
        System.out.println(data1);

        String data2 = (String) al.get(1);
        data2 = data2.toUpperCase();
        System.out.println(data2);

        String data3 = (String) al.get(2);
        data3 = data3.toUpperCase();
        System.out.println(data3);

        String data4 = (String) al.get(3);
        data4 = data4.toUpperCase();
        System.out.println(data4);

        //Ensuring type safety in the collection
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("java");
        al1.add("devops");
        al1.add("c");
//        al1.add(44);

    }
}
