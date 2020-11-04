package dataStructures.graph;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DepthFirstTest {


    @Test
    public void depthFirstTestHappy() {
        Graph.GraphNode<String> graphNodeOne = new Graph.GraphNode<>();
        Graph.GraphNode<String> graphNodeTwo = new Graph.GraphNode<>();
        Graph.GraphNode<String> graphNodeThree = new Graph.GraphNode<>();
        graphNodeOne.setValue("1");
        graphNodeTwo.setValue("14");
        graphNodeThree.setValue("23");
        DepthFirst graph = new DepthFirst();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.getVertexes().add(graphNodeThree);
        graph.addEdge(graphNodeOne, graphNodeTwo, 82);
        graph.addEdge(graphNodeTwo, graphNodeThree, 99);
        ArrayList<String> results = graph.depthFirstPreOrder(graphNodeOne);
        System.out.println(results);
        assertEquals("This is a thing.", "[1, 14, 23]", results.toString());
    }
}
