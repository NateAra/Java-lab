package com.NateAra.DataStructure.LinkLists;

public class SinglyLinkedList {

    private ListNode head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void addFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.setNext(head);
        head = newNode;
    }

    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
