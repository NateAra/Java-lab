package com.NateAra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] items = {1, 2, 3, 4, 5};

        System.out.println(search(items, 3));

    }

    public static int search(int[] nums, int target) {

        int index = Arrays.binarySearch(nums, target);

        if (index >= 0) {
            return index;
        }

        return -1;
    }

}