package com.NateAra;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] items = {3,0,1};

        System.out.println();

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode nextTemp = head.next;
            head.next = prev;
            prev = head;
            head = nextTemp;
        }
        return prev;
    }

}