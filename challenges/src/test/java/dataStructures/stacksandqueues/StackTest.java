package dataStructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void isEmptyStackTest() {
        Stack stack = new Stack();
        assertNull("This should be empty", stack.top);
    }

    @Test public void addTopTest(){
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("This should return value", 3, stack.top.value);
    }

    @Test public void popTest(){
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("This returns 3", 3, stack.pop());
        assertThrows(NullPointerException.class, () ->stack.pop());
        
    }

}
