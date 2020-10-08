package dataStructures.tree;

import dataStructures.utilities.StackGeneric;

public class Gtree<T>{


    GtreeNode root = null;

    public Gtree(){}

    public Gtree(T root) {

        this.root = new GtreeNode(root);
    }

    // Veej sent helper code
    public T getRoot() {

        return (T) root.getValue();
    }

    public void setRoot(T root) {
        this.root = new GtreeNode(root);
    }

    Gqueue rootQueue;
    // use breadth traversal to add to the tree
    public void add(T newVal){
        if (this.root == null) {
            this.root = new GtreeNode(newVal);
            return;
        }
        rootQueue = new Gqueue();
        GtreeNode newNode = new GtreeNode(newVal);
        this._walk(this.root, newNode);
        //while loop is checking the queue and dequeing and then find the spot where there is null and assign the newNode to that spot
    }
    private void _walk(GtreeNode<T> newRoot, GtreeNode<T> newNode){
        if (newRoot.left != null){ rootQueue.enqueue(newRoot.left);}
        else {
            newRoot.left = newNode;
            return;
        }
        if (newRoot.right != null){rootQueue.enqueue(newRoot.right);}
        else {
            newRoot.right = newNode;
            return;
        }
        GtreeNode<T> temp = rootQueue.dequeue();
        _walk(temp, newNode);
        return;


}
