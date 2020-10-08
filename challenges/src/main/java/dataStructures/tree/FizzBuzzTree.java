package dataStructures.tree;

import dataStructures.utilities.StackGeneric;

public class FizzBuzzTree {


    public static Gtree<GtreeNode> fizzBuzzTree(Gtree oldTree) throws Exception {
        if(oldTree.root != null){
            Gtree gtree = new Gtree();
            gtree.root = recursiveFunctionWalk(oldTree.root);
            return gtree;
        } else {
            throw new Exception("Nothing here");
        }
    }

    private static GtreeNode recursiveFunctionWalk(GtreeNode currentNode){
        GtreeNode newNode;
        String newValue = FizzBuzzTree.fizzingBuzzingFunction((String) currentNode.getValue());
        newNode = new GtreeNode(newValue);
        if(currentNode.left != null){
            newNode.left = FizzBuzzTree.recursiveFunctionWalk(currentNode.left);
        }
        if(currentNode.right != null){
            newNode.right = FizzBuzzTree.recursiveFunctionWalk(currentNode.right);
        }
        return newNode;

    }



    public static String fizzingBuzzingFunction(String value) {
        if (Integer.parseInt(value) % 3 == 0 && Integer.parseInt(value) % 5 == 0) {
            return "fizzbuzz";
        }
        if (Integer.parseInt(value) % 3 == 0) {
            return "fizz";
        }
        if (Integer.parseInt(value) % 5 == 0) {
            return "buzz";
        } else {
            return value;
        }
    }


}


