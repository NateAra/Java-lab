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

    public ArrayQueue() {
        this.items = new int[5];
        this.count = 0;
    }

    public void add(int item) {
        if (isFull()) throw new IllegalArgumentException("Queue is Full");

        items[count] = item;
        count++;
    }



    public int peek() {
        return items[first];
    }

    public String print() {
        return Arrays.toString(Arrays.copyOf(items, count));
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == 5;
    }

}
