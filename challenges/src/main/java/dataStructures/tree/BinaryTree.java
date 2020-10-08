package dataStructures.tree;

import challenges.BinarySearch;
import dataStructures.utilities.StackGeneric;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree extends Tree {




    public BinaryTree(Node root) {
        super(root);
    }

    public BinaryTree(){
        super();
    }

    public ArrayList<Integer> preOrder(Node current, ArrayList<Integer> outputArray) {
        outputArray.add(current.getValue());
        if (current.left != null) {
            preOrder(current.left, outputArray);
        }
        if (current.right != null) {
            preOrder(current.right, outputArray);
        }
        return outputArray;
    }

    public ArrayList<Integer> inOrder(Node current, ArrayList<Integer> outputArray) {
        if (current.left != null) {
            inOrder(current.left, outputArray);
        }
        outputArray.add(current.getValue());

        if (current.right != null) {
            inOrder(current.right, outputArray);
        }
        return outputArray;
    }

    public ArrayList<Integer> postOrder(Node current, ArrayList<Integer> outputArray) {
        if (current.left != null) {
            postOrder(current.left, outputArray);
        }
        if (current.right != null) {
            postOrder(current.right, outputArray);
        }
        outputArray.add(current.getValue());

        return outputArray;
    }

    public int findMaxValue() throws Exception{

        if (root == null) {
            throw new Exception();
        }
        int max = findMaxHelper(this.root, root.value);

        return max;
    }

    private int findMaxHelper(Node current, int max){

        if (current.value > max){
            max = current.value;
        }
        if (current.left != null) {
            max = findMaxHelper(current.left, max);
        }
        if (current.right != null) {
            max = findMaxHelper(current.right, max);
        }
        return max;
    }

    public String breathFirstTraversal(){
        ArrayList<Integer> output = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if (getRoot() == null) {
            return "null";
        }
        queue.add(getRoot());
        while(!queue.isEmpty()){
            Node current = queue.remove();
            output.add(current.getValue());
            if(current.getLeft() != null){
                queue.add(current.getLeft());
            }
            if(current.getRight() != null){
                queue.add(current.getRight());
            }
        }
        return output.toString();

    }


}
