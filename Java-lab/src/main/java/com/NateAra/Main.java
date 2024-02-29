package com.NateAra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println();

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> re = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (re.containsKey(com)) {
                return new int[] {re.get(com), i};
            }
            re.put(nums[i], i);
        }
        return null;
    }

}