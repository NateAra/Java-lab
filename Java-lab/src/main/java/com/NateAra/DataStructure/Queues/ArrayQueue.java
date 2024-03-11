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

    public ArrayQueue(int length) {
        this.items = new int[length];
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
        first = (first + 1) % items.length;
        count--;
    }

    public int peek() {
        return items[first];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
