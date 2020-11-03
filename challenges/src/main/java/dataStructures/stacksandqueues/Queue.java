package dataStructures.stacksandqueues;


public class Queue<T> {

    public Node front;
    public Node back;


    public Queue() {
        this.front = null;
        this.back = null;
    }

    public void enqueue(T value) {
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

    public T dequeue() {
        try {
            if (front == null) {
        return null;
            }

            System.out.println("in try below if");
        } catch (NullPointerException e) {
            System.out.println("the queue is empty " + e);
            throw new NullPointerException();
        }
                Node temp = front;
                front = front.next;

                return (T) temp.value;
    }

    public T peek() {
        try {
            return (T) front.value;
        } catch (NullPointerException e) {
            System.out.println("the queue is empty ");
            throw new NullPointerException();
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", back=" + back +
                '}';
    }
}

