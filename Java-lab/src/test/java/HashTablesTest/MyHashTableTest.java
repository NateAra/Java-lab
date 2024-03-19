package HashTablesTest;

import com.NateAra.DataStructure.HashTables.MyHashTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyHashTableTest {

    private final MyHashTable hashTable = new MyHashTable();

    @Test
    void putAndGet() {
        hashTable.put(1, "One");
        hashTable.put(2, "Two");
        hashTable.put(3, "Three");

        assertEquals("One", hashTable.get(1));
        assertEquals("Two", hashTable.get(2));
        assertEquals("Three", hashTable.get(3));
    }
}
