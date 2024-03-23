package com.NateAra.DataStructure.Part2.BinaryTrees;

public class BinaryTree {
    private BinaryTreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        var newNode = new BinaryTreeNode(value);

        if (root == null) {
            root = newNode;
            return;
        }

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;
            }
        }
    }

    public void insertUsingRecursive(int value) {
        root = insertRecursive(root, value);
    }

    public boolean find(int value) {
        var current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.left;
            } else if (value > current.value) {
                current = current.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean findWithRecursive(int value) {
        return findUsingRecursive(root, value);
    }

    private BinaryTreeNode insertRecursive(BinaryTreeNode current, int value) {
        if (current == null) {
            return new BinaryTreeNode(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    private boolean findUsingRecursive(BinaryTreeNode current, int value) {
        if (current == null) {
            return false;
        }
        if (current.value == value) {
            return true;
        }

        return value < current.value
                ? findUsingRecursive(current.left, value)
                : findUsingRecursive(current.right, value);
    }

    

    private void traversePreOrder(BinaryTreeNode root) {
        if (root == null) return;

        System.out.println(root.value);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }
}
