package dataStructures.stacksandqueues;

public class Queue {

    public Node front;
    public Node back;

    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(int value) {
        Node temp = new Node(value);
        if (front == null) {
            front = temp;
            System.out.println("if body is null" + temp);
        } else {
            back.next = temp;
            back = temp;
            System.out.println("if body is not null" + back.next);
        }

    }

    public void dequeue() {
        try {
            if (front != null) {
                front = front.next;
            }

        } catch (NullPointerException e) {
            System.out.println("the queue is empty");
        }
    }

    public int peek(){
        try {
            return front.value;
        } catch (NullPointerException e) {
            System.out.println("the queue is empty");
            throw new NullPointerException();
        }
    }

    public boolean isEmpty(){
        return front == null;
    }
}

