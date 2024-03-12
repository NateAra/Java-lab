package com.NateAra.DataStructure.Queues;

import java.util.Stack;

public class StackQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    private int count;

    public StackQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
        count++;
    }

    public void dequeue() {

    }

    @Override
    public String toString() {
        return stack1.toString() + "\n" + stack2.toString();
    }
}
