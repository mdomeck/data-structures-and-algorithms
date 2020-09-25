package dataStructures.stacksandqueues;

public class Queue {

    public NodeQueue frontOfLine;
    public NodeQueue back;

    public Queue() {
        this.frontOfLine= null;
        this.back = null;
    }

    public void enqueue(int value) {
        NodeQueue nodeQueue = new NodeQueue(value);
        if (frontOfLine != null) {
             this.frontOfLine.next = nodeQueue;

        }

    }
}
