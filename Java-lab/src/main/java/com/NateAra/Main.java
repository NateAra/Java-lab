package com.NateAra;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(strStr("butsad", "sad"));

    }

    public static int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            int j;
            for (j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }

}