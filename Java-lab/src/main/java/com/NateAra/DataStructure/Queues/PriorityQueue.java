package com.NateAra.DataStructure.Queues;

import java.util.Arrays;

public class PriorityQueue {

    private int[] items;
    private int count;

    public PriorityQueue() {
        this.items = new int[5];
        this.count = 0;
    }

    public void add(int item) {
        if (count == items.length) {
            int[] newArray = new int[count * 2];
            System.arraycopy(items, 0, newArray, 0, count);
            items = newArray;
        }

        int i;

        for (i = count - 1; i >= 0; i--) {
            if (item < items[i]) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }
        items[i + 1] = item;
        count++;
    }

    @Override
    public String toString() {
        int[] newArray = new int[count];
        System.arraycopy(items, 0, newArray, 0, count);
        return Arrays.toString(newArray);
    }
}
