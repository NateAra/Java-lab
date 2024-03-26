package com.NateAra.DataStructure.Part2.BinaryTrees;

public class BinaryTree {
    private NodeBinaryTree root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int value) {
        var newNode = new NodeBinaryTree(value);

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

    private NodeBinaryTree insertRecursive(NodeBinaryTree current, int value) {
        if (current == null) {
            return new NodeBinaryTree(value);
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

    private boolean findUsingRecursive(NodeBinaryTree current, int value) {
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

    public void preOrderTraversal() {
        traversePreOrder(root);
    }

    private void traversePreOrder(NodeBinaryTree root) {
        if (root == null) return;

        System.out.println(root.value);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void inOrderTraversal() {
        traverseInOrder(root);
    }

    private void traverseInOrder(NodeBinaryTree root) {
        if (root == null) return;

        traverseInOrder(root.left);
        System.out.println(root.value);
        traverseInOrder(root.right);
    }
    
    public void postOrderTraversal() {
        traversePostOrder(root);
    }

    private void traversePostOrder(NodeBinaryTree root) {
        if (root == null) return;

        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.println(root.value);
    }

    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(NodeBinaryTree root) {
        if (root == null) return -1;
        if (root.left == null & root.right == null) return 0;

        return 1 + Math.max(heightRecursive(root.left), heightRecursive(root.right));
    }

    public int min() {
        return minUsingRecursiveForBinarySearchTree(root);
    }

    private int minUsingRecursiveForBinarySearchTree(NodeBinaryTree root) {

        if (isLeaf(root)) {
            return root.value;
        }

        int leftMin = root.left != null ? minUsingRecursiveForBinarySearchTree(root.left) : Integer.MAX_VALUE;
        int rightMin = root.right != null ? minUsingRecursiveForBinarySearchTree(root.right) : Integer.MAX_VALUE;

        return Math.min(root.value, Math.min(leftMin, rightMin));
    }

    private boolean isLeaf(NodeBinaryTree node) {
        return node.left == null && node.right == null;
    }
}
