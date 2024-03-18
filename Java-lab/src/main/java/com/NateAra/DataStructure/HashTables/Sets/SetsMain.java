package com.NateAra.DataStructure.HashTables.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsMain {
    public static void main(String[] args) {
        String word = "Banana";

        System.out.println(firstRepeatedChar(word));
    }

    public static String removeRepeatingNum(int[] array) {
        Set<Integer> num = new HashSet<>();
        for (int i : array) {
            num.add(i);
        }
        return Arrays.toString(num.stream().mapToInt(Integer::intValue).toArray());
    }

    public static String firstRepeatedChar(String str) {
        Set<Character> set = new HashSet<>();
        for (char i : str.toCharArray()) {
            if (set.contains(i)) {
                return "The first repeating character is: " + i;
            }
            set.add(i);
        }
        return "No repeating Character";
    }
}
