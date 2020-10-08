package dataStructures.tree;


public class GtreeNode<T> {

    T value;
    GtreeNode left;
    GtreeNode right;

    public GtreeNode(T value){
        this.value = value;
    }

    public GtreeNode() {
        this.value = null;
    }

    public T getValue() {
        return value;
    }

    public GtreeNode getLeft() {
        return left;
    }

    public GtreeNode getRight() {
        return right;
    }
}
