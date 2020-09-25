package dataStructures.stacksandqueues;

import org.checkerframework.checker.nullness.qual.NonNull;

public class Stack {

    public Node top;

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
           // e.printStackTrace();
            System.out.println("the stack is empty");
            throw new NullPointerException();
        }
    }

    public int peek() {
        try {
            return top.value;
        } catch (NullPointerException e) {
            System.out.println("the stack is empty");
            throw new NullPointerException();
        }
    }

    public boolean isEmpty() {
//        if (top == null) {
//            System.out.println("the list is empty");
//            return true;
//        } else {
//            return false;
//        }
        return top == null;
    }

}


