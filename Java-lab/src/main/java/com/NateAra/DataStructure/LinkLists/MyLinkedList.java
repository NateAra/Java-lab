package com.NateAra.DataStructure.LinkLists;

//  ToDo
//  addFirst
//  addLast
//  removeFirst
//  removeLast
//  contains
//  indexOf
//  size
//  Convert linkedList to array

import java.util.NoSuchElementException;

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

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }

        first = first.next;
    }

    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
            return;
        }

        var current = first;
        while (current.next != last) {
            current = current.next;
        }
        current.next = null;
        last = current;
    }

    public boolean contains(int value) {
        var current = first;

        while (current != null) {
            if (current.getValue() == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int indexOf(int value) {
        var current = first;
        int index = 0;

        while (current != null) {
            if (current.getValue() == value) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // This is not optimal if I have a big linkedList
    public int sizeOfMyLinkedList() {
        int size = 0;
        var current = first;

        while (current != null) {
            size++;
            current = current.next;
        }
        return size;
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
    }

    private boolean isEmpty() {
        return first == null;
    }

}
