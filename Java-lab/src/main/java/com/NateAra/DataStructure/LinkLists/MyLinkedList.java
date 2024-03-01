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
//  Reversing LinkedList
// Kth Node from the end

import java.util.NoSuchElementException;

public class MyLinkedList {

    private ListNode first;
    private ListNode last;

    private int size;

    public void addLast(int value) {
        var newNode = new ListNode(value);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public void addFirst(int value) {
        var newNode = new ListNode(value);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }
        first = first.next;
        size--;
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
        size--;
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

    // This is more preferable
    public int size() {
        return size;
    }

    public int[] convertLinkedListToArray() {
        if (isEmpty()) throw new NoSuchElementException();

        int[] result = new int[size()];
        var current = first;

        for (int i = 0; i < result.length; i++) {
            result[i] = current.getValue();
            current = current.next;
        }
        return result;
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
