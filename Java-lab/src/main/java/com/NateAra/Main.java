package com.NateAra;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {

        int[] items = {1, 2, 3, 4};

        System.out.println();

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        return (int) Arrays.stream(classPoints).average().orElse(0) > yourPoints;
    }

}