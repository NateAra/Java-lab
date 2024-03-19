package com.NateAra.DataStructure.Part1.Arrays.Ex;

public class ArrayExMain {
    public static void main(String[] args) {
        ArrayEx num = new ArrayEx(5);
        num.insert(0);
        num.insert(9);
        num.insert(5);
        num.insert(25);

        num.insertAt(3, 2);
        num.printItems();
    }
}
