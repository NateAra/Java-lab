package com.NateAra.DataStructure.HashTables.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5,};

        System.out.println(removeRepeatingNum(arr));
    }

    public static String removeRepeatingNum(int[] array) {
        Set<Integer> num = new HashSet<>();
        for (int i : array) {
            num.add(i);
        }
        return Arrays.toString(num.stream().mapToInt(Integer::intValue).toArray());
    }

    public static String firstRepeatedChar(String str) {
        Set<Character> bag = new HashSet<>();
        for (char i : str.toCharArray()) {
            if (bag.contains(i)) {
                return "The first repeating character is: " + i;
            }
            bag.add(i);
        }
        return "No repeating Character";
    }
}
