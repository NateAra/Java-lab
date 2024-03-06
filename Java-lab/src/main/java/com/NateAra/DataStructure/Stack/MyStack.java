package com.NateAra.DataStructure.Stack;

// ToDo
// Push
// pop
// peek
// isEmpty

import java.util.Arrays;

public class MyStack {

    private final int[] items;
    private int count;

    public MyStack() {
        this.items = new int[5];
        this.count = 0;
    }

    public void push(int item) {
        if (count == items.length) throw new StackOverflowError();
        items[count++] = item;
    }

    public void pop() {
        if (count == 0) throw new IllegalStateException();
        count--;
    }

    public int peek() {
        if (count == 0) throw new IllegalStateException("Stack is Empty");
        return items[count - 1];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(items, count));
    }
}
