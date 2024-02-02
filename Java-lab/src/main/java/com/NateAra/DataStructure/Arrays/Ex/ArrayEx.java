package com.NateAra.DataStructure.Arrays.Ex;

/* ToDo
* insert
* print
* removeAt
* indexOf
* getItem
* largestItem
* findCommonItems
* reverse
* insertAt
* */

import java.util.Arrays;

public class ArrayEx {
    private int[] items;
    private int count;

    public ArrayEx(int length) {
        this.items = new int[length];
        this.count = 0;
    }

    public void insert(int item) {
        if (count == items.length) {
            int[] newItems = new int[count * 2];

            System.arraycopy(items, 0, newItems, 0, count);
            items = newItems;
        }
        items[count++] = item;
    }

    public void printItems() {
        int[] actualItems = Arrays.copyOf(items, count);
        System.out.println(Arrays.toString(actualItems));
    }
}
