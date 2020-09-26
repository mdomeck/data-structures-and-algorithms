package dataStructures.stacksandqueues;

public class Node {

    public int value; // why does this need to be public
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return "NodeQueue{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
