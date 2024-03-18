package com.NateAra.DataStructure.HashTables;

import java.util.LinkedList;

public class MyHashTable {

    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    
}
