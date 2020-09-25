package dataStructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {



    @Test public void pushStackTest(){
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("This should return value", 3, stack.top.value);
    }

   @Test public void addMultipleValuesToStackTest(){
//        Stack stack = new Stack();
//        stack.push(3);
//        stack.push(5);
//        stack.push(7);
//        assertEquals("This should return multiple values",  );
    }

    @Test public void popTest(){
        Stack stack = new Stack();
        stack.push(3);
        assertEquals("This returns 3", 3, stack.pop());
        assertThrows(NullPointerException.class, () ->stack.pop());

    }

    @Test public void emptyStackAfterMultiplePops(){

    }

    @Test public void peekNextItemOnStack(){

    }

    @Test public void isEmptyStackTest() {
        Stack stack = new Stack();
        assertNull("This should be empty", stack.top);
    }

    @Test public void emptyStackException(){
//        Stack stack = new Stack();
//        stack.push(3);
//        assertEquals("This returns 3", 3, stack.pop());
//        assertThrows(NullPointerException.class, () ->stack.pop());
    }

    @Test public void enqueueIntoQueue(){

    }
    @Test public void enqueueMultipleValues(){

    }
    @Test public void dequeueOutExpectedValue(){

    }

    @Test public void peekIntoQueueExpectedValue(){

    }

    @Test public void emptyQueueAfterMultipleDequeues(){

    }

    @Test public void instantiateEmptyQueue(){

    }

    @Test public void emptyQueueException(){

    }
}
