package org.example.collections;

import java.util.PriorityQueue;

public class PriorDeque {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(22);
        pq.add(10);
        pq.add(100);
        pq.add(5);
        pq.add(30);
        pq.add(60);

        System.out.println(pq);
    }
}
