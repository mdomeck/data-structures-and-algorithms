package dataStructures.tree;

import challenges.BinarySearch;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTeat {

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
    public void addToEmptyTreeTest() {
        BinarySearchTree tree = new BinarySearchTree();
        assertNotNull("tree is empty", tree);
    }

    @Test public void addLeftChildTest() throws Exception {
        BinarySearchTree tree = new BinarySearchTree(new Node(4));
        System.out.println(tree.inOrder(tree.getRoot(), new ArrayList<Integer>()));
        tree.add(2, tree.getRoot());
        System.out.println(tree.inOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("the lesser should come before the root", "[2, 4]", (tree.inOrder(tree.getRoot(), new ArrayList<Integer>()).toString()));
    }

    @Test public void addRightChildTest() throws Exception {
        BinarySearchTree tree = new BinarySearchTree(new Node(4));
        System.out.println(tree.inOrder(tree.getRoot(), new ArrayList<Integer>()));
        tree.add(6, tree.getRoot());
        System.out.println(tree.inOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertEquals("the lesser should come after the root", "[4, 6]", (tree.inOrder(tree.getRoot(), new ArrayList<Integer>()).toString()));
    }

    @Test public void addSameChildTest(){
        BinarySearchTree tree = new BinarySearchTree(new Node(4));
        System.out.println(tree.inOrder(tree.getRoot(), new ArrayList<Integer>()));
        assertThrows("should throw and exception if value is already in tree",
                Exception.class,
                () -> tree.add(4, tree.getRoot()));
    }

    @Test public void ContainsTest() throws Exception{
        BinarySearchTree tree = new BinarySearchTree();
        assertFalse("should not find value in empty tree", tree.contains(3, tree.getRoot()));
        tree.add(4, tree.getRoot());
        assertTrue("should find value in root node", tree.contains(4, tree.getRoot()));
        tree.add(2, tree.getRoot());
        tree.add(6, tree.getRoot());
        assertTrue("should find value of left node", tree.contains(2, tree.getRoot()));
        assertTrue("should find value of right node", tree.contains(6, tree.getRoot()));
        assertFalse("should not find value if its not in tree", tree.contains(5, tree.getRoot()));



    }


}
