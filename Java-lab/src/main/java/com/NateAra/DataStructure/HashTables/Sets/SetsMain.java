package com.NateAra.DataStructure.HashTables.Sets;

public class SetsMain {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5,};

        System.out.println(Arrays.toString(removeRepeatingNum(arr)));
    }
    
    public static int[] removeRepeatingNum(int[] array) {
        Set<Integer> num = new HashSet<>();
        for (int i : array) {
            num.add(i);
        }
        return num.stream().mapToInt(Integer::intValue).toArray();
    }
}
