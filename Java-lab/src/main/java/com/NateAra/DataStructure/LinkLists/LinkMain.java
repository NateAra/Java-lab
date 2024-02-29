package com.NateAra.DataStructure.LinkLists;

public class LinkMain {
    public static void main(String[] args) {
        var num = new MyLinkedList();
        num.addLast(1);
        num.addLast(2);
        num.addLast(3);
        num.addFirst(0);
        num.removeLast();
        num.printList();
    }
}
