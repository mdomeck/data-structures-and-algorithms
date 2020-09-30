package dataStructures.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

   @Test
   public void pseudoQueueTestInAndOut() {
        PseudoQueue s1 = new PseudoQueue();
        s1.enqueue(7);
        s1.enqueue(2);
        s1.enqueue(5);
        System.out.println(s1.toString());
       assertEquals(7, s1.deQueue());
    }

    @Test public void pseudoQueueEnqueueTest() {
        PseudoQueue s1 = new PseudoQueue();
        s1.enqueue(5);
        assertEquals(5, s1.getS1().peek());
    }

    @Test public void pseudoQueueDequeueTest() {
        PseudoQueue s1 = new PseudoQueue();
        s1.enqueue(7);
        s1.enqueue(2);
        s1.enqueue(5);
        assertTrue(s1.deQueue() == 7);
        assertTrue(s1.deQueue() == 2);
        assertTrue(s1.deQueue() == 5);
    }

    @Test
    public void emptyPseudoQueueException() {
        PseudoQueue s1 = new PseudoQueue();
        assertTrue("This should be empty", s1.getS1().isEmpty());
    }

}
