package com.NateAra.DataStructure.Arrays;

import java.util.Arrays;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        this.items = new int[length];
        this.count = 0;
    }

    public void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException("Out of bound!!");
        }

        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
    }
}
