package dataStructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {


    @Test
    public void pushStackTest() {
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("This should return value", 3, (int) stack.top.value);
    }

    @Test
    public void addMultipleValuesToStackTest() {
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("This should return value", 3, (int) stack.top.value);
        stack.push(5);
        assertEquals("This should return value", 5, (int) stack.top.value);
        assertEquals("This should return value", 3, (int) stack.top.next.value);
        stack.push(7);
        assertEquals("This should return value", 7, (int) stack.top.value);
    }

    @Test
    public void popTest() {
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("This returns 3", 3, stack.pop());
    }

    @Test
    public void emptyStackAfterMultiplePops() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.pop();
        stack.pop();
        stack.pop();
        assertThrows(NullPointerException.class, () -> stack.pop());
    }

    @Test
    public void peekNextItemOnStack() {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(5);
        assertEquals("this is the top", 5, stack.peek());
        assertEquals("this is still the top", 5, (int) stack.top.value);
    }

    @Test
    public void isEmptyStackTest() {
        Stack stack = new Stack();
        assertTrue("This should be empty", stack.isEmpty());
    }

    @Test
    public void emptyStackException() {
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("This returns 3", 3, stack.pop());
        assertThrows(NullPointerException.class, () -> stack.pop());
    }


}
