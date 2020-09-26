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
            back = temp;
            //System.out.println("if front is null " + temp);
        } else {
            back.next = temp;
            back = temp;
            //System.out.println("if body is not null " + back);
        }

    }

    public void dequeue() {
        try {
            if (front != null) {

//            } else {

                Node temp = front;
                front = front.next;
                System.out.println("front.next " + front.next);
                System.out.println("dequeue " + temp);
            }

            System.out.println("in try below if");
        } catch (NullPointerException e) {
            System.out.println("the queue is empty " + e);
            throw new NullPointerException();
        }
    }

    public int peek() {
        try {
            return front.value;
        } catch (NullPointerException e) {
            System.out.println("the queue is empty ");
            throw new NullPointerException();
        }
    }

    public boolean isEmpty() {
        return front == null;
    }
}

