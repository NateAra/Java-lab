package com.NateAra.DataStructure.Queues;



public class QueMain {
    public static void main(String[] args) {

        ArrayQueue arr = new ArrayQueue();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.dequeue();
        arr.dequeue();
        arr.add(60);
        arr.add(70);
        System.out.println(arr);
        System.out.println(arr.peek());
    }
}
