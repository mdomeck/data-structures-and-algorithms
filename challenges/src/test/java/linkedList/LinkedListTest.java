package linkedList;

import linkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListTest {
    @Test
    public void testLinkList() {
       LinkedList test = new LinkedList();
        test.insert(10);
        test.insert((7));
        System.out.println(test);

        assertNotNull(new LinkedList());
        assertEquals("abc", "7 4 null", test.toString());
        assertTrue("expect true", test.includes(4));

    }

}
