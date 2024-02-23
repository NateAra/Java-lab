package com.NateAra;




public class Main {
    public static void main(String[] args) {

        int[] items = {1, 2, 3, 4};

        System.out.println(isLove(2, 4));

    }

    public static boolean isLove(final int flower1, final int flower2) {
        boolean isEven = flower1 % 2 == 0;
        boolean isOdd = flower2 % 2 ==0;
        return isEven != isOdd;
    }

}