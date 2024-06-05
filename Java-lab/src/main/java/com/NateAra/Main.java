package com.NateAra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] ar = {3, 3};

        System.out.println(Arrays.toString(twoSum(ar, 6)));
    }

    //Solution using map
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (numMap.containsKey(comp)) {
                return new int[]{numMap.get(comp), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }

}