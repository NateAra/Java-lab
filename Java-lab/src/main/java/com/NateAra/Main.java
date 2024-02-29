package com.NateAra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));

    }

    public static String highAndLow(String numbers) {
        String[] sNum = numbers.split(" ");

        int  large = Integer.parseInt(sNum[0]);
        int small = large;

        for (String s : sNum) {
            int num = Integer.parseInt(s);

            if (large < num) {
                large = num;
            }
            if (small > num) {
                small = num;
            }
        }

        return large + " " + small;
    }

}