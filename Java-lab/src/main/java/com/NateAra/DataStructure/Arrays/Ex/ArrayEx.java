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
            int[] newitem = new int[count * 2];

            System.arraycopy(items, 0, newitem, 0, count);
            items = newitem;
        }
        items[count++] = item;
    }
}
