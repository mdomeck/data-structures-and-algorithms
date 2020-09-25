package dataStructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertNull;

public class QueueTest {

    @Test
    public void enqueueIntoQueue() {
        Queue queue = new Queue();
        assertNull("this queue is empty", queue.top);
        assertNull("this queue is empty", queue.back);
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

    }

    @Test
    public void emptyQueueException() {

    }
}
