package com.NateAra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ar = {3, 3};

        System.out.println(Arrays.toString(twoSum(ar, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}