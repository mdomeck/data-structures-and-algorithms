package dataStructures.stacksandqueues;

public class Node {

    public int value; // why does this need to be public
    Node next;
    Node front;

    public Node(int value) {
        this.value = value;
        this.next = null;
        this.front = null;
    }

    @Override
    public String toString() {
        return "NodeQueue{" +
                "value=" + value +
                ", next=" + next +
                ", front=" + front +
                '}';
    }
}
