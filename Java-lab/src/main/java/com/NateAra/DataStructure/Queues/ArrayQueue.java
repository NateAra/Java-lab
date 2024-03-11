package com.NateAra.DataStructure.Queues;

import java.util.Arrays;

// ToDo
// enqueue
// dequeue
// peek
// isEmpty
// isFull
public class ArrayQueue {

    private final int[] items;
    private int count;
    private int first;

    public ArrayQueue() {
        this.items = new int[5];
        this.count = 0;
        this.first = 0;
    }

    public void add(int item) {
        if (isFull()) throw new IllegalArgumentException("Queue is Full");

        items[count] = item;
        count++;
    }



    public int peek() {
        return items[first];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == 5;
    }

    public String print() {
        return Arrays.toString(Arrays.copyOf(items, count));
    }
}
