package dataStructures.stacksandqueues;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QueueTest {

    @Test
    public void enqueueIntoQueue() {
        Queue queue = new Queue();
        queue.enqueue(4);
        assertEquals(4, queue.front.value, "this queue is front ");
    }

    @Test
    public void enqueueMultipleValues() {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        assertEquals(4, queue.front.value, "this queue is front ");
        assertEquals(8, queue.back.value, "this queue is back");
    }

    @Test
    public void dequeueOutExpectedValue() {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(6);
        assertEquals(4, queue.front.value, "this queue is front ");
        queue.dequeue();
        assertEquals(6, queue.front.value, "this is the new front ");
        assertThrows(NullPointerException.class, () -> queue.dequeue());
    }

    @Test
    public void peekIntoQueueExpectedValue() {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(6);
        queue.enqueue(8);
        assertEquals(4, queue.peek(), "peeking at the front ");
        assertEquals(4, queue.front.value, "this queue is front ");
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
        assertNull(queue.front, "this queue is empty");
    }

    @Test
    public void emptyQueueException() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty(), "This should be empty");
    }
}
