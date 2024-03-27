package com.NateAra.DataStructure.Part2.BinaryTrees;

public class MainBinaryTree {
    public static void main(String[] args) {
        BinaryTree bin = new BinaryTree();
        bin.insert(4);
        bin.insert(9);
        bin.insert(1);
        bin.insert(12);
        bin.insert(8);
        bin.insert(2);
        bin.insert(6);
        System.out.println(bin.min());
        System.out.println(bin.minBST());
    }
}
