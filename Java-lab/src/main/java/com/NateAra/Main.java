package com.NateAra;


import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };


        System.out.println();

    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;

        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i]) {
                count++;
            }
        }

        return count;
    }

}