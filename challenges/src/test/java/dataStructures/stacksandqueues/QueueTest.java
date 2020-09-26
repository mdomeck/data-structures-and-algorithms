package dataStructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class QueueTest {

    @Test
    public void enqueueIntoQueue() {
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(6);
        assertEquals("this queue is front ", 6, queue.front);
        assertEquals("this queue is next", 4, queue.back);
    }

    @Test
    public void enqueueMultipleValues() {

    }

    @Test
    public void dequeueOutExpectedValue() {

    }

    @Test
    public void peekIntoQueueExpectedValue() {

    }

    @Test
    public void emptyQueueAfterMultipleDequeues() {

    }

    @Test
    public void instantiateEmptyQueue() {
        Queue queue = new Queue();

        assertNull("this queue is empty", queue.back);
    }

    @Test
    public void emptyQueueException() {

    }
}
