package com.NateAra;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] items = {3,0,1};

        System.out.println(missingNumber(items));

    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

}