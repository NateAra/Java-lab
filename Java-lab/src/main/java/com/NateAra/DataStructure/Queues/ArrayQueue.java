package com.NateAra.DataStructure.Queues;

// ToDo
// enqueue
// dequeue
// peek
// isEmpty
// isFull
public class ArrayQueue {

    private int[] items;
    private int count;

    public ArrayQueue() {
        this.items = new int[5];
        this.count = 0;
    }

    public void add(int item) {
        items[count] = item;
        count++;
    }

}
