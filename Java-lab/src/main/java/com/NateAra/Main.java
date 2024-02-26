package com.NateAra;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Object[] array1 = {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"};


        System.out.println();

    }

    public static int getCount(String str) {
        int count = 0;

        for (char i : str.toCharArray()) {
            count += i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' ? 1 : 0;
        }

        return count;
    }

}