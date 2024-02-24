package com.NateAra;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {2, 5, 2, 3, 3};


        System.out.println(checkForFactor(2, 3));

    }

    public static boolean checkForFactor(int base, int factor) {
        return base % factor == 0;
    }

}