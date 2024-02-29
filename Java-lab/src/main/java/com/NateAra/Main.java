package com.NateAra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println();

    }

    public static String findNeedle(Object[] haystack) {
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }

}