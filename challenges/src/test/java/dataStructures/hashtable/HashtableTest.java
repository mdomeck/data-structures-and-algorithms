package dataStructures.hashtable;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Hashtable;

public class HashtableTest {


    @Test
    public void testNewHashTable() throws Exception {
        ArrayList[] test = new ArrayList[20];
        Hashtable testHash = new Hashtable(test);
        testHash.add("a", "apples");



        Assert.assertNotNull(testHash);
        //Assert.assertEquals("buckets list should start empty",0, testHash.size());
    }

//    @Test
//    public void testNewHashTable(){
//        Hashtable hashtable = new Hashtable();
//        Assert.assertNotNull(hashtable);
//        Assert.assertEquals("buckets list should start empty",0, hashtable.buckets.size());
//    }

//    @Test
//    public void testHashWithinSize(){
//        Hashtable hashtable = new Hashtable();
//        int a = hashtable.hash("a");
//        Assert.assertTrue("index should be between 0 and size", 0 <= a && a < hashtable.size);
//    }


}
