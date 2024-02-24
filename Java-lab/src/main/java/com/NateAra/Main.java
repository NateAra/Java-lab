package com.NateAra;


import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {2, 5, 2, 3, 3};


        System.out.println(find_average(array1));

    }

    public static double find_average(int[] array){
        return Arrays.stream(array).average().orElse(0);
    }

}