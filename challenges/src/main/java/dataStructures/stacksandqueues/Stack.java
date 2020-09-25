package dataStructures.stacksandqueues;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Stack {

    Node top;

    public Stack() {
        this.top = null;
    }

    public void push(int value) {
        Node newTop = new Node(value);
        if (top != null) {
            newTop.next = top;
        }
        top = newTop;
    }

    public int pop() {
        try {
            int topValue = top.value;
            Node oldTop = top;
            top = top.next;
            oldTop.next = null;
            return topValue;
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw new NullPointerException();
        }
    }

}
