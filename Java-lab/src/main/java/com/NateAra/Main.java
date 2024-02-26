package com.NateAra;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Object[] array1 = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};


        System.out.println(findNeedle(array1));

    }

    public static String findNeedle(Object[] haystack) {
        // Your code here
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }

}