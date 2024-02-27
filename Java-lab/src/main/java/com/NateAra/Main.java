package com.NateAra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(getCount("abracadabra"));

    }

    public static int getCount(String str) {
        int count = 0;

        for (char i : str.toCharArray()) {
            count += 'a' == i || 'e' == i ||'i' == i ||'o' == i ||'u' == i ? 1 : 0;
        }

        return count;
    }

}