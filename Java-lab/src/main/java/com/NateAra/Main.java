package com.NateAra;


public class Main {
    public static void main(String[] args) {

        System.out.println(remove("Nate"));

    }

    public static String remove(String str) {
        return new StringBuilder(str).deleteCharAt(str.length() - 1).deleteCharAt(0).toString();
    }

}