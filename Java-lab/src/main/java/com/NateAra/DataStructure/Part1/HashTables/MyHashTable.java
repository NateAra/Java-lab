package com.NateAra.DataStructure.Part1.HashTables;

import java.util.LinkedList;

public class MyHashTable {

    private static class Entry {
        private final int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);

        if (entries[index] == null) {
            entries[index] = new LinkedList<>();
        }

        for (var entry : entries[index]) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        var entry = new Entry(key, value);
        entries[index].addLast(entry);
    }

    public String get(int key) {
        var index = hash(key);

        if (entries[index] != null) {
            for (var entry : entries[index]) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }
        return "Found No Key";
    }

    public String remove(int key) {
        var index = hash(key);
        if (entries[index] != null) {
            for (var entry : entries[index]) {
                if (entry.key == key) {
                    entries[index].remove(entry);
                    return entry.value;
                }
            }
        }
        throw new IllegalStateException("No such element");
    }

    private int hash(int key) {
        return key % entries.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");

        for (int i = 0; i < entries.length; i++) {
            if (entries[i] == null) {
                sb.append("null");
            } else {
                sb.append("{");
                // Use a flag to avoid adding a comma before the first element
                boolean firstElement = true;
                for (Entry entry : entries[i]) {
                    if (!firstElement) {
                        sb.append(", ");
                    }
                    sb.append(entry.key).append("=").append(entry.value);
                    firstElement = false;
                }
                sb.append("}");
            }
            if (i < entries.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("}");
        return sb.toString();
    }
}
