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
            int[] newArr = new int[count * 2];

            for (int i = 0; i < count; i++) {
                newArr[i] = items[i];
            }
            items = newArr;
        }
        items[count++] = item;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
    }
}
