package dataStructures.stacksandqueues;

public class Queue {

    public Node front = null;
    public Node next = null;

    public Queue() {
        this.front = null;
        this.next = null;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
//        Queue queue = new Queue();
        //System.out.println(newNode);
        if (front == null) {
            front = newNode;

            System.out.println("if body is null" + newNode);
        } else if (front != null) {
            next = newNode;
        } if (front != null && next != null) {
            next.next = newNode;


//            nodeQueue.next = queue.back;
            System.out.println("if body is not null" + newNode);
        }

    }
}
