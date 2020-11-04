package dataStructures.stacksandqueues;

public class Node<T> {

    public T value; // why does this need to be public
    public Node next;

    public Node(T value) {
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
