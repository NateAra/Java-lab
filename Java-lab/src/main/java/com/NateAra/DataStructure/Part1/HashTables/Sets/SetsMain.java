package com.NateAra.DataStructure.Part1.HashTables.Sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsMain {
    public static void main(String[] args) {
        String word = "Banana";

        System.out.println(firstRepeatedChar(word));
    }

    public static String removeRepeatingNum(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        return Arrays.toString(set.stream().mapToInt(Integer::intValue).toArray());
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
