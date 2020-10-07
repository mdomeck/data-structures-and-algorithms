package dataStructures.tree;

import challenges.BinarySearch;
import dataStructures.utilities.StackGeneric;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BinaryTreeTest {

    static Node makeTree() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);
        Node seven = new Node(7);
        four.setLeft(two);
        four.setRight(six);
        two.setLeft(one);
        two.setRight(three);
        six.setLeft(five);
        six.setRight(seven);

        return four;
    }

    @Test
    public void preOrder() {
        ArrayList<Integer> testArray = new ArrayList<>();
        BinaryTree tree = new BinaryTree(new Node(3));
        assertEquals("check that returns array list", testArray, tree.preOrder(tree.getRoot(), testArray));
    }

    @Test
    public void preOrderOutputTest() {
        Node rootNode = makeTree();

        BinaryTree tree = new BinaryTree(rootNode);

        System.out.println(tree.preOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("should be values of the nodes as the are passed", "[4, 2, 1, 3, 6, 5, 7]", tree.preOrder(tree.getRoot(), new ArrayList<Integer>()).toString());
    }

    @Test
    public void inOrderOutputTest() {
        Node rootNode = makeTree();

        BinaryTree tree = new BinaryTree(rootNode);

        System.out.println(tree.preOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("should be values of the node as the are passed", "[1, 2, 3, 4, 5, 6, 7]", tree.inOrder(tree.getRoot(), new ArrayList<Integer>()).toString());
    }

    @Test
    public void postOrderOutputTest() {
        Node rootNode = makeTree();

        BinaryTree tree = new BinaryTree(rootNode);

        System.out.println(tree.preOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("should be values of the nosed as the are passed", "[1, 3, 2, 5, 7, 6, 4]", tree.postOrder(tree.getRoot(), new ArrayList<Integer>()).toString());
    }


    @Test
    public void findMaxTest() throws Exception {
        Node rootNode = makeTree();

        BinaryTree tree = new BinaryTree(rootNode);
        System.out.println(tree.findMaxValue());
        assertEquals("returns max value", 7, tree.findMaxValue());
    }

    @Test
    public void findMaxEmptyTest() {
        BinaryTree tree = new BinaryTree(null);
        assertThrows(Exception.class, () -> tree.findMaxValue());
    }

    @Test
    public void breadthFirstNullTest(){
        BinaryTree tree = new BinaryTree();
        assertEquals("empty tree", "null", tree.breathFirstTraversal());
    }

    @Test
    public void breadthFirstTreeTest(){
        Node rootNode = makeTree();
        BinaryTree tree = new BinaryTree(rootNode);
        assertEquals("[4, 2, 6, 1, 3, 5, 7]", tree.breathFirstTraversal());
    }

    @Test
    public void fizzingBuzzingTest(){
        StackGeneric.gNode<String> gNode1 = new StackGeneric.gNode<>("3");
        StackGeneric.gNode<String> gNode2 = new StackGeneric.gNode<>("5");
        StackGeneric.gNode<String> gNode3 = new StackGeneric.gNode<>("7");
        StackGeneric.gNode<String> gNode4 = new StackGeneric.gNode<>("15");
        assertEquals("This should be Fizz", "fizz", BinaryTree.fizzingBuzzingFunction(gNode1.getValue()));
        assertEquals("This should be Buzz", "buzz", BinaryTree.fizzingBuzzingFunction(gNode2.getValue()));
        assertEquals("This should be 7", "7", BinaryTree.fizzingBuzzingFunction(gNode3.getValue()));
        assertEquals("This should be FizzBuzz", "fizzbuzz", BinaryTree.fizzingBuzzingFunction(gNode4.getValue()));

    }

    @Test
    public void fizzBuzzTreeTestException(){
        Gtree tree = new Gtree();
        assertThrows("It is an empty tree", Exception.class, ()->BinaryTree.fizzBuzzTree(tree));
    }


    @Test
    public void fizzBuzzTreeTestOneRoot(){
        Gtree tree = new Gtree();
        tree.add
    }
}
