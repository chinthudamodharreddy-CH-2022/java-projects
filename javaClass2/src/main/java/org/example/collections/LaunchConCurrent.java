package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchConCurrent {
    public static void main(String[] args) {
        CopyOnWriteArrayList list = new CopyOnWriteArrayList();
        list.add(10);
        list.add(50);
        list.add(70);
        list.add(30);
        list.add(10);

        System.out.println(list);

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            list.add(44); //FAILS SAFELY --> no exception.
        }

        ListIterator litr = list.listIterator();
        while (litr.hasNext()){
            System.out.println(litr.next());
        }

        ListIterator litr2 = list.listIterator(list.size());
        while (litr.hasPrevious()){
            System.out.println(litr2.previous());
        }
    }
}
