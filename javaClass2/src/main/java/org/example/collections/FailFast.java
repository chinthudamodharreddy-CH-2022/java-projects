package org.example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFast {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(50);
        list.add(70);
        list.add(30);
        list.add(10);

        //System.out.println(list);

        //accessing the elements through for loop - not recommended for collections cause for loop is outside for collections and if you try
        //to add a value during iteration it adds the val and creates the infinite loop to avoid this we use iterator()
//        for(int i =0; i< list.size(); i++){
//            System.out.println(list.get(i));
//            list.add(44); //adds 44 after each iteration and creates infinite loop
//        }

        //accessing the values through Iterator() method of ArrayList collection
        //itr.hasNext() -> it will check fot the next value, also gives us the next value
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            list.add(44); //FAIL FAST : it fails the application by throwing the exception to stop the ill logical concurrent modification at least
        }
    }
}
