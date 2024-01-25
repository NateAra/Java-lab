package com.NateAra.DataStructure.LinkLists;

//    ToDo
//    addFirst
//    addLast
//    deleteFirst
//    deleteLast
//    contains
//    indexOf

public class MyLinkedList {
    private Node first;
    private Node last;

    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    @Override
    public String toString() {
        // Check if the list is empty
        if (first == null) {
            return "[]";
        }

        StringBuilder result = new StringBuilder();
        Node current = first;

        // Loop through each node, appending its value to the result string
        while (current != null) {
            result.append(current.getValue());
            current = current.getNext();

            // If there is another node, append a comma for formatting
            if (current != null) {
                result.append(", ");
            }
        }

        return result.toString();
    }

}
