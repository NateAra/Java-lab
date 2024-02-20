package com.NateAra;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println();

    }

    public void moveZeroes(int[] nums) {
        int place = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[place++] = num;
            }
        }

        while (place < nums.length) {
            nums[place++] = 0;
        }
    }

}