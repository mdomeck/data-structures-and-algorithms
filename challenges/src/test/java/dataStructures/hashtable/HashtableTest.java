package dataStructures.hashtable;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {


    @Test
    public void testNewHashTable() {
        Hashtable testHash = new Hashtable();
        assertNotNull(testHash);
        assertEquals("buckets list should start default size", 47, testHash.buckets.size());
    }

    @Test
    public void testHashTableSize3() {
        Hashtable hashtable = new Hashtable(3);
        assertNotNull(hashtable);
        assertEquals("buckets list should start at given size", 3, hashtable.buckets.size());
    }

    @Test
    public void testHashWithinSize() {
        Hashtable hashtable = new Hashtable(3);
        int a = hashtable.hash("a");
        assertTrue("index should be between 0 and size", 0 <= a && a < hashtable.buckets.size());
        int b = hashtable.hash("b");
        assertTrue("index should be between 0 and size", 0 <= b && b < hashtable.buckets.size());
        int c = hashtable.hash("c");
        assertTrue("index should be between 0 and size", 0 <= c && c < hashtable.buckets.size());
    }

    @Test
    public void testAddException() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        assertThrows("should throw exception", Exception.class, () -> hashtable.add("a", 1));
    }

    @Test
    public void testAdd() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        hashtable.add("b", 2);
        hashtable.add("c", 3);

        assertEquals("value should be stored in bucket at hashed position", 1, hashtable.buckets.get(hashtable.hash("a")).get(0).value);
        assertEquals("value should be stored in bucket at hashed position", 2, hashtable.buckets.get(hashtable.hash("b")).get(0).value);
        assertEquals("value should be stored in bucket at hashed position", 3, hashtable.buckets.get(hashtable.hash("c")).get(0).value);
    }

    @Test
    public void testAddCollision() throws Exception {
        Hashtable hashtable = new Hashtable(3);
        hashtable.add("a", 1);
        hashtable.add("d", 2);

        assertEquals("bucket should be size 2", 2, hashtable.buckets.get(hashtable.hash("a")).size());
        assertEquals("value should be stored in first bucket at hashed position", 1, hashtable.buckets.get(hashtable.hash("a")).get(0).value);
        assertEquals("value should be stored in second bucket at hashed position", 2, hashtable.buckets.get(hashtable.hash("a")).get(1).value);
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
        assertThrows("should throw exception when key is not present", Exception.class, ()-> hashtable.get("d"));
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
