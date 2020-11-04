package dataStructures.stacksandqueues;

public class Stack {

    public Node<Integer> top;

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
        return top == null;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}


