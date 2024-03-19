package com.NateAra.DataStructure.Part1.LinkLists;

public class LinkMain {
    public static void main(String[] args) {
        var num = new MyLinkedList();
        num.addLast(10);
        num.addLast(20);
        num.addLast(30);
        num.addLast(40);
        num.addLast(50);


        System.out.println(num.getKthFromTheEnd(1));
        num.printList();
    }
}
