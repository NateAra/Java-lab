package com.NateAra;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] items = {1, 2, 3, 4};

        System.out.println();

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int numTemp = target - nums[i];

            if (numMap.containsKey(numTemp)) {
                return new int[] {numMap.get(numTemp), i};
            }
            numMap.put(nums[i], i);
        }
        return null;
    }

}