package dataStructures.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    @Test
    public void emptyTreeTest(){
        Tree tree = new Tree();
        assertNotNull("tree should be instantiated", tree);
        assertNull("root should be empty", tree.getRoot());
    }

    @Test
    public void singleRootNodeTest(){
        Tree tree = new Tree(new Node(1));
        assertNotNull("tree should be instantiated", tree);
        assertEquals("root should have a single value", 1, tree.getRoot().getValue());
    }



}
