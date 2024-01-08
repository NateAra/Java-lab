package com.NateAra.DataStructure.Arrays;

import java.util.Arrays;

public class Array {

    private final int[] array;
    private int count;

    public Array(int length) {
        this.array = new int[length];
        this.count = 0;
    }

    public void insert(int item) {
        array[count++] = item;
    }

    public void print() {
        System.out.println(Arrays.toString(array));
    }
}
