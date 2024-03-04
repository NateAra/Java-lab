package com.NateAra.DataStructure.LinkLists;

import java.util.Arrays;

public class LinkMain {
    public static void main(String[] args) {
        var num = new MyLinkedList();
        num.addLast(10);
        num.addLast(20);
        num.addLast(30);
        num.addLast(40);
        num.addLast(50);


        num.printList();
    }
}
