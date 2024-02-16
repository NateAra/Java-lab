package com.NateAra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        System.out.println(remove("Nate"));

    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        return Arrays.stream(arrayOfSheeps).filter(x -> x != null).filter(x -> x).toArray().length;
    }

}