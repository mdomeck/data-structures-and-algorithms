package dataStructures.tree;

import dataStructures.utilities.StackGeneric;

public class Gtree<T>{


    StackGeneric.gNode root = null;

    public Gtree(){}

    public Gtree(T root) {

        this.root = new StackGeneric.gNode(root);
    }


    public T getRoot() {
        return (T) root.getValue();
    }

    public void setRoot(T root) {
        this.root = (StackGeneric.gNode) root;
    }

    Gqueue rootQueue;
    // use breadth traversal to add to the tree
    public void add(T newVal){
        if (this.root == null) {
            this.root = new StackGeneric.gNode(newVal);
            return;
        }
        rootQueue = new Gqueue();
        StackGeneric.gNode newNode = new StackGeneric.gNode(newVal);
        this._walk(this.root, newNode);
        //while loop is checking the queue and dequeing and then find the spot where there is null and assign the newNode to that spot
    }
    private void _walk(StackGeneric.gNode<T> newRoot, StackGeneric.gNode<T> newNode){
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
        NodeTree<T> temp = rootQueue.dequeue();
        _walk(temp, newNode);
        return;


}
