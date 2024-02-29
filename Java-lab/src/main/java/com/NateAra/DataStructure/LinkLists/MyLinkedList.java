package com.NateAra.DataStructure.LinkLists;

//    ToDo
//    addFirst
//    addLast
//    deleteFirst
//    deleteLast
//    contains
//    indexOf

public class MyLinkedList {

    private ListNode first;
    private ListNode last;

    public void addLast(int value) {
        var newNode = new ListNode(value);
        
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

}
