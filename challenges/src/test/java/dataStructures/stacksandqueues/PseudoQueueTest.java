package dataStructures.stacksandqueues;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PseudoQueueTest {

   @Test
   public void pseudoQueueTestInAndOut() throws Exception {
        PseudoQueue s1 = new PseudoQueue();
        s1.enqueue(7);
        s1.enqueue(2);
        s1.enqueue(5);
        System.out.println(s1.toString());
       assertEquals(5, s1.deQueue());
    }

    @Test public void pseudoQueueEnqueueTest() {
        PseudoQueue s1 = new PseudoQueue();
        s1.enqueue(5);
        assertEquals(5, s1.getS1().peek());
    }

    @Test public void pseudoQueueDequeueTest() throws Exception {
        PseudoQueue s1 = new PseudoQueue();
        s1.enqueue(7);
        s1.enqueue(2);
        s1.enqueue(5);
        System.out.println(s1.toString());
        assertTrue(s1.deQueue() == 5);
    }

    @Test
    public void emptyPseudoQueueException() {
        PseudoQueue s1 = new PseudoQueue();
        assertTrue(s1.getS1().isEmpty(), "This should be empty");
    }

}
