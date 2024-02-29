package com.NateAra.DataStructure.LinkLists;

public class ListNode {
    private final int value;
    protected ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }
}
