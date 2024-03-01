package com.NateAra.DataStructure.LinkLists;

import java.util.Arrays;

public class LinkMain {
    public static void main(String[] args) {
        var num = new MyLinkedList();
        num.addLast(2);
        num.addLast(4);
        num.addLast(6);
        num.addLast(1);
        num.addFirst(0);
        num.reverse();

        num.printList();
    }
}
