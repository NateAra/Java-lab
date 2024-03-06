package com.NateAra.DataStructure.Stack;

// ToDo
// Push
// pop
// peek
// isEmpty


public class MyStack {

    private int[] items;
    private int count;

    public MyStack() {
        this.items = new int[5];
        this.count = 0;
    }

    public void push(int item) {
        if (count == items.length) {
            int[] newArray = new int[count * 2];
            System.arraycopy(items, 0, newArray, 0, count);
            items = newArray;
        }

}
