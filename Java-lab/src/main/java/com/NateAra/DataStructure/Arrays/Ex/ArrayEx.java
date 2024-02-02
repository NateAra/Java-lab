package com.NateAra.DataStructure.Arrays.Ex;

/* ToDo
* insert
* removeAt
* indexOf
* getItem
* print
* largestItem
* findCommonItems
* reverse
* insertAt
* */

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
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
