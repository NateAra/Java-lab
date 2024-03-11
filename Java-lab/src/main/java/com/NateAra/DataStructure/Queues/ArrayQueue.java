package com.NateAra.DataStructure.Queues;

import java.util.Arrays;
import java.util.NoSuchElementException;

// ToDo
// enqueue
// dequeue
// peek
// isEmpty
// isFull
public class ArrayQueue {

    private final int[] items;
    private int first;
    private int last;
    private int count;

    public ArrayQueue() {
        this.items = new int[5];
    }

    public void add(int item) {
        if (isFull()) throw new IllegalStateException("Queue is Full");

        items[last] = item;
        last = (last + 1) % items.length;
        count++;
    }

    public void dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue is Empty");

        items[first] = 0;
        first++;
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
