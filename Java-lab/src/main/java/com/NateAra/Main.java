package com.NateAra;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println();

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];

            if (numMap.containsKey(com)) {
                return new int[] {numMap.get(com), i};
            }

            numMap.put(nums[i], i);
        }
        return null;
    }

}