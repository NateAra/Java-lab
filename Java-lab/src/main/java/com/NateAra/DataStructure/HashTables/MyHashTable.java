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

    public void put(int key, String value) {
        var index = hash(key);

        var bucket = entries[index];

        if (bucket == null) {
            bucket = new LinkedList<>();
        }

        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        var entry = new Entry(key, value);
        bucket.addLast(entry);
    }

    private int hash(int key) {
        return key % entries.length;
    }

}
