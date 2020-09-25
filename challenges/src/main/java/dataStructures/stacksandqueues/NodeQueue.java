package dataStructures.stacksandqueues;

public class NodeQueue extends Node {

    public Node frontInLine;

    public NodeQueue(int value) {
        super(value);
        this.frontInLine = null;
    }

    @Override
    public String toString() {
        return "NodeQueue{" +
                "back=" + frontInLine +
                ", value=" + value +
                ", next=" + next +
                '}';
    }
}
