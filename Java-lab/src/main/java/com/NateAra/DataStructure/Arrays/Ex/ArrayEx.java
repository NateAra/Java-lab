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

    public void removeAt(int index) {

        if (index < 0 || index >=  count) {
            throw new IllegalArgumentException("Out of bound");
        }

        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (item == items[i]) {
                return i;
            }
        }
        return -1;
    }

    public void largestItem() {
        if (count == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int lagest = items[0];
        for (int i = 1; i < count; i++){
            if (items[i] > lagest) {
                lagest = items[i];
            }
        }
        System.out.println(lagest);
    }

    public void largestItemUsingStream() {
        int largestNum = Arrays.stream(items).max().getAsInt();
        System.out.println(largestNum);
    }

}
