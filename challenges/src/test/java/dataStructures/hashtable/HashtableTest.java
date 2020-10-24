package dataStructures.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class HashtableTest {

    @Test
    public void testNewHashTable(){
        Hashtable hashtable = new Hashtable();
        Assert.assertNotNull(hashtable);
        Assert.assertEquals("buckets list should start empty",0, hashtable.buckets.size());
    }

    @Test
    public void testHashWithinSize(){
        Hashtable hashtable = new Hashtable();
        int a = hashtable.hash("a");
        Assert.assertTrue("index should be between 0 and size", 0 <= a && a < hashtable.size);
    }


}
