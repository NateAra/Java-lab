package com.NateAra;

public class Main {
    public static void main(String[] args) {

        System.out.println(disemvowel("natE"));

    }

    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aAeEiIoOuU]", "");
    }

}