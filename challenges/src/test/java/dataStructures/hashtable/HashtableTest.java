package dataStructures.hashtable;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashtableTest {


    @Test
    public void testNewHashTable() {
        Hashtable testHash = new Hashtable();
        assertNotNull(testHash);
        assertEquals(47, testHash.buckets.size(),"buckets list should start default size");
    }

    @Test
    public void testHashTableSize3() {
        Hashtable hashtable = new Hashtable(3);
        assertNotNull(hashtable);
        assertEquals(3, hashtable.buckets.size(), "buckets list should start at given size");
    }

    @Test
    public void testHashWithinSize() {
        Hashtable hashtable = new Hashtable(3);
        int a = hashtable.hash("a");
        assertTrue(0 <= a && a < hashtable.buckets.size(), "index should be between 0 and size");
        int b = hashtable.hash("b");
        assertTrue(0 <= b && b < hashtable.buckets.size(), "index should be between 0 and size");
        int c = hashtable.hash("c");
        assertTrue(0 <= c && c < hashtable.buckets.size(), "index should be between 0 and size");
    }

    @Test
    public void testAddException() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        assertThrows(Exception.class, () -> hashtable.add("a", 1), "should throw exception");
    }

    @Test
    public void testAdd() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        hashtable.add("b", 2);
        hashtable.add("c", 3);

        assertEquals(1, hashtable.buckets.get(hashtable.hash("a")).get(0).value, "value should be stored in bucket at hashed position");
        assertEquals(2, hashtable.buckets.get(hashtable.hash("b")).get(0).value, "value should be stored in bucket at hashed position");
        assertEquals(3, hashtable.buckets.get(hashtable.hash("c")).get(0).value, "value should be stored in bucket at hashed position");
    }

    @Test
    public void testAddCollision() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        hashtable.add("d", 2);

        assertEquals(2, hashtable.buckets.get(hashtable.hash("a")).size(), "bucket should be size 2");
        assertEquals(1, hashtable.buckets.get(hashtable.hash("a")).get(0).value, "value should be stored in first bucket at hashed position");
        assertEquals(2, hashtable.buckets.get(hashtable.hash("a")).get(1).value, "value should be stored in second bucket at hashed position");
    }

    @Test
    public void testContainsException() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        assertFalse(hashtable.contains("d"));
    }

    @Test
    public void testContains() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        hashtable.add("b", 2);
        hashtable.add("c", 3);
        assertTrue(hashtable.contains("a"));
        assertTrue(hashtable.contains("b"));
        assertTrue(hashtable.contains("c"));
    }
    @Test
    public void testGetException() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        hashtable.add("b", 2);
        hashtable.add("c", 3);
        assertThrows(Exception.class, ()-> hashtable.get("d"), "should throw exception when key is not present");
    }

    @Test
    public void testGet() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        hashtable.add("b", 2);
        hashtable.add("c", 3);
        assertEquals(1, hashtable.get("a"));
        assertEquals(2, hashtable.get("b"));
        assertEquals(3, hashtable.get("c"));
    }

    @Test
    public void testGetCollision() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        hashtable.add("d", 2);
        assertEquals(1, hashtable.get("a"));
        assertEquals(2, hashtable.get("d"));
    }

}
