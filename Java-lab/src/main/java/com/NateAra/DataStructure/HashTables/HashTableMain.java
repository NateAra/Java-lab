package com.NateAra.DataStructure.HashTables;

import java.util.HashMap;
import java.util.Map;

public class HashTableMain {
    public static void main(String[] args) {
        String n = "a green apple";
        findFirstNonRepeatingCharSimpler(n);
    }

    public static void findFirstNonRepeatingChar(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (var ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                var count = map.get(ch);
                map.put(ch, count + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (var ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.println("The first non-repeating character is: " + ch);
                return;
            }
        }
        System.out.println("No non-repeating chars");
    }

    public static void findFirstNonRepeatingCharSimpler(String str) {

        Map<Character, Integer> ma = new HashMap<>();
        var chars = str.toCharArray();

        for (var ch : chars) {
            var count = ma.containsKey(ch) ? ma.get(ch) : 0;
            ma.put(ch, count + 1);
        }

        for (var ch : chars) {
            if (ma.get(ch) == 1) {
                System.out.println("The first non-repeating character is: " + ch);
                return;
            }
        }
        System.out.println("No non-repeating chars");
    }
}
