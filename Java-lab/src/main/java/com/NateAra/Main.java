package com.NateAra;


public class Main {
    public static void main(String[] args) {

        int[] items = {1, 2, 3, 4, 5};

        System.out.println();

    }

    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

            if (prefix.isEmpty()) {
                return "";
            }
        }
        return prefix;
    }

}