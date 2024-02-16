package com.NateAra;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {



    }

    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}