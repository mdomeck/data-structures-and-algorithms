package dataStructures.tree;


public class BinarySearchTree extends BinaryTree {


    public BinarySearchTree(Node root) {
        super(root);
    }

    public void add(int value, Node current) {
        if (current == null) {
            this.setRoot(new Node(value));
            return;
        }
        // if less than current, checks for a left node
        if (value < current.getValue()) {
            if (current.getLeft() == null) {
                current.setLeft(new Node(value));
                return;
            } else {
                add(value, current.getLeft());
                return;
            }
        }
        // if greater than current, checks for a right node
        if (value > current.getValue()) {
            if (current.getRight() == null) {
                current.setRight(new Node(value));
                return;
            } else {
                add(value, current.getRight());
                return;
            }
        }
    }


}
