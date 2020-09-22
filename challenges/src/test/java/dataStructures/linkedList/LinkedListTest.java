package dataStructures.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListTest {

    @Test public void testTesting(){
        assertTrue(true);
        System.out.println("Testing");
    }

    @Test public void testNewLinkList(){
        LinkedList test = new LinkedList();
        assertEquals("NULL", test.toString());
        System.out.println("Testing");
        System.out.println(test);
    }

    @Test public void testInsert(){
        LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        System.out.println(test);
        assertEquals("{2} -> {7} -> {4} -> NULL", test.toString());
    }

    @Test public void testIncludes(){
        LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        assertTrue(test.includes(2));
        assertFalse(test.includes (10));
        System.out.println(test);
    }

    @Test public void testInsertEnd(){
        LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        test.insertEnd(9);
        test.insertEnd(10);
        assertEquals("{2} -> {7} -> {4} -> {9} -> {10} -> NULL", test.toString());
        System.out.println(test);
    }

    @Test public void testInsertBefore(){
        LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        test.insertBefore(7, 10);
        assertEquals("{2} -> {10} -> {7} -> {4} -> NULL", test.toString());
        System.out.println(test);

    }

    @Test
    public void testInsertAfter() {
       LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        test.insertAfter(2, 22);
        assertEquals("{2} -> {22} -> {7} -> {4} -> NULL", test.toString());
        System.out.println(test);


    }

    @Test public void testFindKFromEndInTheMiddle(){
        LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        int actual = test.findKFromEnd(1);
        int expected = 7;
        assertEquals(expected, actual);
        System.out.println(test);
    }

    @Test public void testFindKFromEndWithOneNode(){
        LinkedList test = new LinkedList();
        test.insert(4);
        int actual = test.findKFromEnd(0);
        int expected = 4;
        assertEquals(expected, actual);
        System.out.println(test);
    }

    @Test public void testFindKFromEndGreaterThanLength(){
        LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        test.findKFromEnd(5);
        assertThrows("Value entered is greater than total linked list length", IndexOutOfBoundsException);
        System.out.println(test);
    }

    @Test public void testFindKFromEndNotPositiveInteger(){
        LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        test.findKFromEnd(-1);
        assertThrows("Value entered is greater than total linked list length", IndexOutOfBoundsException);
        System.out.println(test);
    }

    @Test public void testFindKFromAreSameLength(){
        LinkedList test = new LinkedList();
        test.insert(4);
        test.insert(7);
        test.insert(2);
        int actual = test.findKFromEnd(2);
        int expected = 2;
        assertEquals(expected, actual);
        System.out.println(test);

    }

}
