package com.NateAra;


public class Main {
    public static void main(String[] args) {

        int[] items = {1, 2, 3, 4, 5};

        System.out.println(searchInsert(items, 3));

    }

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}