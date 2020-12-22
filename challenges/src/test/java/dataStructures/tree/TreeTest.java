package dataStructures.tree;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {

    @Test
    public void emptyTreeTest(){
        Tree tree = new Tree();
        assertNotNull(tree, "tree should be instantiated");
        assertNull(tree.getRoot(), "root should be empty");
    }

    @Test
    public void singleRootNodeTest(){
        Tree tree = new Tree(new Node(1));
        assertNotNull(tree, "tree should be instantiated");
        assertEquals(1, tree.getRoot().getValue(), "root should have a single value");
    }



}
