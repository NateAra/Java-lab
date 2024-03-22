package com.NateAra.DataStructure.Part2.BinaryTrees;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bin = new BinaryTree();
        bin.insertUsingRecursive(5);
        bin.insertUsingRecursive(2);
        bin.insertUsingRecursive(4);
        bin.insertUsingRecursive(8);
        System.out.println(bin.find(1));
        System.out.println(bin.findWithRecursive(4));
    }
}
