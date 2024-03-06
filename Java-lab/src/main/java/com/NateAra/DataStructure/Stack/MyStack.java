package com.NateAra.DataStructure.Stack;

// ToDo
// Push
// pop
// peek
// isEmpty

import java.util.Arrays;

public class MyStack {

    private int[] items;
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
        int[] newArray = new int[count - 1];
        System.arraycopy(items, 0, newArray, 0, count - 1);
        items = newArray;
        count--;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(items, count));
    }
}
