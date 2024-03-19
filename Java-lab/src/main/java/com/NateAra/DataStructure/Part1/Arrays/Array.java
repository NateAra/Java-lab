package com.NateAra.DataStructure.Part1.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

            System.arraycopy(items, 0, newItems, 0, count);
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

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    public int[] getItems() {
        return Arrays.copyOf(items, count);
    }

    public void largestItem() {
        int max = Arrays.stream(items).max().getAsInt();
        System.out.println(max);
    }

    public void findCommonItems(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i : arr1) {
            set1.add(i);
        }

        for (int i : arr2) {
            set2.add(i);
        }

        set1.retainAll(set2);
        System.out.println(set1);
    }

    public void reverse(int[] items) {
        int[] newArr = new int[items.length];
        int index = 0;

        for (int i = items.length - 1; i >= 0 ; i--) {
            newArr[index] = items[i];
            index++;
        }
        System.out.println(Arrays.toString(newArr));
    }

    public void insertAt(int item, int index) {
//        if (index < 0 || index >= count) {
//            throw new IllegalArgumentException("Out of bound!!");
//        }
//
//        if (count == items.length) {
//            int[] newItems = new int[count * 2];
//
//            System.arraycopy(items, 0, newItems, 0, count);
//            items = newItems;
//        }
//
//        for (int i = count - 1; i >= index; i--) {
//            items[i + 1] = items[i];
//        }

        items[index] = item;
//        count++;
    }
}
