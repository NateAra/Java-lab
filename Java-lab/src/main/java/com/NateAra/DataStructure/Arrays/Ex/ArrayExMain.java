package com.NateAra.DataStructure.Arrays.Ex;

public class ArrayExMain {
    public static void main(String[] args) {
        ArrayEx num = new ArrayEx(5);
        num.insert(0);
        num.insert(9);
        num.insert(5);
        num.insert(25);

        num.removeAt(0);

        num.printItems();
        System.out.println(num.indexOf(2));

        num.largestItemUsingStream();
    }
}
