package dataStructures.stacksandqueues;

public class Node {

    public int value; // why does this need to be public
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
