package com.NateAra;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        System.out.println();

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int u = i + 1; u < nums.length; u++) {
                if (nums[i] + nums[u] == target) {
                    return new int[] {i, u};
                }
            }
        }
        return null;
    }

}