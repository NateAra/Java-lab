package com.NateAra.DataStructure.HashTables;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercises {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Nate");
        System.out.println(map);
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




}
