package com.NateAra.DataStructure.Queues;

public class StackQueue {

    private int[] items;
    private int count;

    public StackQueue() {
        this.items = new int[5];
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
