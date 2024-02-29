package com.NateAra.DataStructure.LinkLists;

public class LinkMain {
    public static void main(String[] args) {
        var num = new MyLinkedList();
        num.addLast(2);
        num.addLast(4);
        num.addLast(6);


        System.out.println(num.indexOf(6));
    }
}
