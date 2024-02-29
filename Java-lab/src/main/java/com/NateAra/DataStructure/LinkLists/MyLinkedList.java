package com.NateAra.DataStructure.LinkLists;

//    ToDo
//    addFirst
//    addLast
//    removeFirst
//    removeLast
//    contains
//    indexOf

public class MyLinkedList {

    private ListNode first;
    private ListNode last;

    public void addLast(int value) {
        var newNode = new ListNode(value);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void addFirst(int value) {
        var newNode = new ListNode(value);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public void printList() {
        ListNode current = first;

        if (current != null) {
            while (current != null) {
                System.out.print(current.getValue() + " -> ");
                current = current.getNext();
            }
        } else {
            System.out.println("List is empty!");
        }
        System.out.print("null");
    }

    private boolean isEmpty() {
        return first == null;
    }

}
