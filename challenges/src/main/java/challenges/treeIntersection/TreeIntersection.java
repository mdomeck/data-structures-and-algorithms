package challenges.treeIntersection;


import java.util.ArrayList;
import java.util.HashMap;


public class TreeIntersection {

    ArrayList<Integer> collisionList = new ArrayList<>();

    public static class Node {
        int value;
        Node left;
        Node right;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

    public static class Tree {
        Node root = null;

        public Tree() {}

        public Tree(Node root) {
            this.root = root;
        }

        public Node getRoot() {
            return root;
        }

        public void setRoot(Node root) {
            this.root = root;
        }
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

    public HashMap preOrderCreation(Tree tree) throws Exception{
        HashMap hashMap = new HashMap();
        if(tree.root == null ){
            throw new Exception("no root");
        }
        preOrderWalk(tree.root, hashMap);
        return hashMap;
    }

    public void preOrderWalk(Node node, HashMap hashMap){
        if(node.getLeft() != null){
            preOrderWalk(node.getLeft(), hashMap);
        }
        if(node.getRight() != null) {
            preOrderWalk(node.getRight(), hashMap);
        }
        if(hashMap.containsKey(node.getValue())){
            collisionList.add(node.getValue());
        }
        hashMap.put(node.getValue(), node.getValue());
    }


}

