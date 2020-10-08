package dataStructures.tree;

import dataStructures.utilities.StackGeneric;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FizzBuzzTreeTest {

    @Test
    public void fizzingBuzzingTest(){
        StackGeneric.gNode<String> gNode1 = new StackGeneric.gNode<>("3");
        StackGeneric.gNode<String> gNode2 = new StackGeneric.gNode<>("5");
        StackGeneric.gNode<String> gNode3 = new StackGeneric.gNode<>("7");
        StackGeneric.gNode<String> gNode4 = new StackGeneric.gNode<>("15");
        assertEquals("This should be Fizz", "fizz", FizzBuzzTree.fizzingBuzzingFunction(gNode1.getValue()));
        assertEquals("This should be Buzz", "buzz", FizzBuzzTree.fizzingBuzzingFunction(gNode2.getValue()));
        assertEquals("This should be 7", "7", FizzBuzzTree.fizzingBuzzingFunction(gNode3.getValue()));
        assertEquals("This should be FizzBuzz", "fizzbuzz", FizzBuzzTree.fizzingBuzzingFunction(gNode4.getValue()));

    }

    @Test
    public void fizzBuzzTreeTestException(){
        Gtree tree = new Gtree();
        assertThrows("It is an empty tree", Exception.class, ()->FizzBuzzTree.fizzBuzzTree(tree));
    }


    @Test
    public void fizzBuzzTreeTestOneRoot() throws Exception {
        Gtree tree = new Gtree();
        tree.add("500");
        assertEquals("root=GtreeNode{value=buzz}", FizzBuzzTree.fizzBuzzTree(tree).toString());
    }

    @Test
    public void fizzBuzzTreeTestThreeNodes() throws Exception {
        Gtree tree = new Gtree();
        tree.add("500");
        tree.add("15");
        tree.add("3");
        assertEquals("root=GtreeNode{value=buzz, left=GtreeNode{value=fizzbuzz, left=null, right=null}, right=GtreeNode{value=fizz, left=null, right=null}}", FizzBuzzTree.fizzBuzzTree(tree).toString());
    }


    @Test
    public void fizzBuzzTreeTestSixNodes() throws Exception {
        Gtree tree = new Gtree();
        tree.add("500");
        tree.add("15");
        tree.add("3");
        tree.add("1");
        tree.add("6");
        tree.add("7");
        assertEquals("root=GtreeNode{value=buzz, left=GtreeNode{value=fizzbuzz, left=GtreeNode{value=1, left=null, right=null}, right=GtreeNode{value=fizz, left=null, right=null}}, right=GtreeNode{value=fizz, left=GtreeNode{value=7, left=null, right=null}, right=null}}", FizzBuzzTree.fizzBuzzTree(tree).toString());
    }

}
