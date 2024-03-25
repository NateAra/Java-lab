package com.NateAra.DataStructure.Part2.BinaryTrees;

public class MainBinaryTree {
    public static void main(String[] args) {
        BinaryTree bin = new BinaryTree();
        bin.insert(5);
        bin.insert(7);
        bin.insert(3);
        bin.insert(8);
        bin.insert(2);
        bin.insert(6);
        System.out.println(bin.height());
    }
}
