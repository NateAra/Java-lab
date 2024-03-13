package com.NateAra.DataStructure.Queues;


public class QueMain {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();

        StackQueue stack = new StackQueue();
        stack.enqueue(10);
        stack.enqueue(20);
        stack.enqueue(30);
        stack.enqueue(40);
        stack.enqueue(50);
        stack.dequeue();
        stack.dequeue();
        System.out.println(stack);

    }
}
