package com.NateAra;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        System.out.println(highAndLow("5 4 3 2 1"));

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints).average().orElse(0) < yourPoints;
    }

}