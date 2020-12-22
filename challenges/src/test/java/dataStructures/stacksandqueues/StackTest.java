package dataStructures.stacksandqueues;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {


    @Test
    public void pushStackTest() {
        Stack stack = new Stack();
        stack.push(3);
        assertEquals(3, (int) stack.top.value, "This should return value");
    }

    @Test
    public void addMultipleValuesToStackTest() {
        Stack stack = new Stack();
        stack.push(3);
        assertEquals(3, (int) stack.top.value, "This should return value");
        stack.push(5);
        assertEquals(5, (int) stack.top.value, "This should return value");
        assertEquals(3, (int) stack.top.next.value, "This should return value");
        stack.push(7);
        assertEquals(7, (int) stack.top.value, "This should return value");
    }

    @Test
    public void popTest() {
        Stack stack = new Stack();
        stack.push(3);
        assertEquals(3, stack.pop(), "This returns 3");
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
        assertEquals(5, stack.peek(), "this is the top");
        assertEquals(5, (int) stack.top.value, "this is still the top");
    }

    @Test
    public void isEmptyStackTest() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty(), "This should be empty");
    }

    @Test
    public void emptyStackException() {
        Stack stack = new Stack();
        stack.push(3);
        assertEquals(3, stack.pop(), "This returns 3");
        assertThrows(NullPointerException.class, () -> stack.pop());
    }


}
