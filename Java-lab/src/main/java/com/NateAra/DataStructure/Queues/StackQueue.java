package com.NateAra.DataStructure.Queues;

public class StackQueue {

    private int[] items;
    private int count;

    public StackQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
        count++;
    }

    @Override
    public String toString() {
        return stack1.toString() + "\n" + stack2.toString();
    }
}
