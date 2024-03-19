package com.NateAra.DataStructure.HashTables;

public class HashTableMain {
    public static void main(String[] args) {

        MyHashTable table = new MyHashTable();
        table.put(22, "Nate");
        table.put(11, "Johny");
        System.out.println(table.get(11));
    }

}
