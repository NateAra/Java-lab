package com.NateAra.DataStructure.Queues;


import java.util.ArrayDeque;
import java.util.Queue;

public class QueMain {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue.peek());
        System.out.println(queue.isEmpty());
    }
}
