package linkedList;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListTest {
    @Test
    public void testLinkList() {
       LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        System.out.println(test);



        assertNotNull(new LinkedList());
        assertEquals("abc", "{2} -> {7} -> {4} -> NULL", test.toString());
        assertTrue("expect true", test.includes(4));
        assertFalse("expect false", test.includes(10));

    }

}
