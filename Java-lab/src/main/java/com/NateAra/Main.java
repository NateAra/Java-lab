package com.NateAra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] items = {5, 3, 2, 1, 4};

        System.out.println(search(items, 3));

    }

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

}