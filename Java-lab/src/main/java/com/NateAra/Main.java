package com.NateAra;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] items = {1, 2, 3, 4, 6};

        System.out.println(searchInsert(items, 5));

    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

}