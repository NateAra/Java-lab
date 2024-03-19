package com.NateAra.DataStructure.HashTables;

public class HashTableMain {
    public static void main(String[] args) {

        MyHashTable table = new MyHashTable();
        table.put(2, "Nate");
        table.put(1, "Johny");
        table.put(6, "Bob");
        table.put(16, "luna");
        System.out.println(table);
        System.out.println(table.remove(6));
        System.out.println(table);
    }

}
