package com.NateAra.DataStructure.HashTables.Sets;

public class SetsMain {


    public static int[] removeRepeatingNum(int[] array) {
        Set<Integer> num = new HashSet<>();
        for (int i : array) {
            num.add(i);
        }
        return num.stream().mapToInt(Integer::intValue).toArray();
    }
}
