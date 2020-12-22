package challenges.treeIntersection;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TreeIntersectionTest {

    TreeIntersection.Tree tree1 = new TreeIntersection.Tree();
    TreeIntersection.Tree tree2 = new TreeIntersection.Tree();
    TreeIntersection.Tree tree3 = new TreeIntersection.Tree();


    @BeforeEach
    public void makeTree1() {
        TreeIntersection.Node node = new TreeIntersection.Node();
        node.setValue(150);
        tree1.setRoot(node);
        TreeIntersection.Node node1 = new TreeIntersection.Node();
        node1.setValue(100);
        node.setLeft(node1);
        TreeIntersection.Node node2 = new TreeIntersection.Node();
        node2.setValue(250);
        node.setRight(node2);
        TreeIntersection.Node node3 = new TreeIntersection.Node();
        node3.setValue(75);
        node1.setLeft(node3);
        TreeIntersection.Node node4 = new TreeIntersection.Node();
        node4.setValue(160);
        node1.setRight(node4);
        TreeIntersection.Node node5 = new TreeIntersection.Node();
        node5.setValue(125);
        node4.setLeft(node5);
        TreeIntersection.Node node6 = new TreeIntersection.Node();
        node6.setValue(175);
        node4.setRight(node6);
        TreeIntersection.Node node7 = new TreeIntersection.Node();
        node7.setValue(200);
        node2.setLeft(node7);
        TreeIntersection.Node node8 = new TreeIntersection.Node();
        node8.setValue(350);
        node2.setRight(node8);
        TreeIntersection.Node node9 = new TreeIntersection.Node();
        node9.setValue(300);
        node8.setLeft(node9);
        TreeIntersection.Node node10 = new TreeIntersection.Node();
        node10.setValue(500);
        node8.setRight(node10);
    }

    @BeforeEach
    public void makeTree2() {
        TreeIntersection.Node node = new TreeIntersection.Node();
        node.setValue(42);
        tree2.setRoot(node);
        TreeIntersection.Node node1 = new TreeIntersection.Node();
        node1.setValue(100);
        node.setLeft(node1);
        TreeIntersection.Node node2 = new TreeIntersection.Node();
        node2.setValue(600);
        node.setRight(node2);
        TreeIntersection.Node node3 = new TreeIntersection.Node();
        node3.setValue(15);
        node1.setLeft(node3);
        TreeIntersection.Node node4 = new TreeIntersection.Node();
        node4.setValue(160);
        node1.setRight(node4);
        TreeIntersection.Node node5 = new TreeIntersection.Node();
        node5.setValue(125);
        node4.setLeft(node5);
        TreeIntersection.Node node6 = new TreeIntersection.Node();
        node6.setValue(175);
        node4.setRight(node6);
        TreeIntersection.Node node7 = new TreeIntersection.Node();
        node7.setValue(200);
        node2.setLeft(node7);
        TreeIntersection.Node node8 = new TreeIntersection.Node();
        node8.setValue(350);
        node2.setRight(node8);
        TreeIntersection.Node node9 = new TreeIntersection.Node();
        node9.setValue(4);
        node8.setLeft(node9);
        TreeIntersection.Node node10 = new TreeIntersection.Node();
        node10.setValue(500);
        node8.setRight(node10);

    }

    @Test
    public void treeCreationTest() {
        TreeIntersection functionTree = new TreeIntersection();
        ArrayList<Integer> treeOutput1 = new ArrayList<>();
        ArrayList<Integer> treeOutput2 = new ArrayList<>();
        assertEquals("Tree 1",
                "[150, 100, 75, 160, 125, 175, 250, 200, 350, 300, 500]",
                functionTree.preOrder(tree1.root, treeOutput1).toString()
        );
        assertEquals("Tree 2",
                "[42, 100, 15, 160, 125, 175, 600, 200, 350, 4, 500]",
                functionTree.preOrder(tree2.root, treeOutput2).toString()
        );
    }

    @Test
    public void treeHashCreationTest() throws Exception {
        TreeIntersection functionTree = new TreeIntersection();
        HashMap tree1Hash = functionTree.preOrderCreation(tree1);
        assertEquals("here is the hash",
                "{160=160, 100=100, 500=500, 150=150, 200=200, 250=250, 75=75, 300=300, 125=125, 350=350, 175=175}",
                tree1Hash.toString()
        );
    }

    @Test
    public void treeCollisionTest() throws Exception {
        TreeIntersection functionTree = new TreeIntersection();
        HashMap tree1Hash = functionTree.preOrderCreation(tree1);
        functionTree.preOrderWalk(tree2.root, tree1Hash);
        assertEquals("returned collisions",
                "[125, 175, 160, 100, 200, 500, 350]",
                functionTree.collisionList.toString()
        );

    }

    @Test
    public void emptyTreeException() throws Exception {
        TreeIntersection functionTree = new TreeIntersection();
        assertThrows(Exception.class, ()-> functionTree.preOrderCreation(tree3), "no root");
    }

}
