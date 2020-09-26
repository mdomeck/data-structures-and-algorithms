package dataStructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void enqueueIntoQueue() {
        Queue queue = new Queue();
        queue.enqueue(4);
        assertEquals("this queue is front ", 4, queue.front.value);
    }

    @Test
    public void enqueueMultipleValues() {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        assertEquals("this queue is front ", 4, queue.front.value);
        assertEquals("this queue is back", 8, queue.back.value);
    }

    @Test
    public void dequeueOutExpectedValue() {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(6);
        assertEquals("this queue is front ", 4, queue.front.value);
        queue.dequeue();
        assertEquals("this is the new front ",6, queue.front.value);
        assertThrows(NullPointerException.class, () -> queue.dequeue());
    }

    @Test
    public void peekIntoQueueExpectedValue() {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        assertEquals("peeking at the front ", 4, queue.peek());
        assertEquals("this queue is front ", 4, queue.front.value);
    }

    @Test
    public void emptyQueueAfterMultipleDequeues() {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        queue.dequeue();
        queue.dequeue();
        assertThrows(NullPointerException.class, () -> queue.dequeue());
    }

    @Test
    public void instantiateEmptyQueue() {
        Queue queue = new Queue();
        assertNull("this queue is empty", queue.front);
    }

    @Test
    public void emptyQueueException() {
        Queue queue = new Queue();
        assertTrue("This should be empty", queue.isEmpty());
    }
}
