package com.NateAra;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        int[] ar = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(ar, 9)));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> r = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if (r.containsKey(com)) {
                return new int[] {r.get(com), i};
            }
            r.put(nums[i], i);
        }
        return null;
    }

}