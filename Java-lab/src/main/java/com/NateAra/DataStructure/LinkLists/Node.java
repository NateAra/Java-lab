package com.NateAra.DataStructure.LinkLists;

public class Node {

    public static void main(String[] args) {
        Node x = new Node(1);
        Node y = new Node(2);
        x.setNext(y);

        System.out.println(x.getNext().getData());
    }

    private int data;
    private Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
