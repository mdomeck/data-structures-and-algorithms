package dataStructures.graph;

import dataStructures.graph.BreadthFirst;
import dataStructures.graph.Graph;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class BreadthFirstTest {

//    @Test
//    public void testBreadthFirst(){
//        Graph.GraphNode<Integer> graphNodeA = new Graph.GraphNode<>();
//        Graph.GraphNode<Integer> graphNodeB = new Graph.GraphNode<>();
//        Graph.GraphNode<Integer> graphNodeC = new Graph.GraphNode<>();
//        graphNodeA.setValue(1);
//        graphNodeB.setValue(2);
//        graphNodeC.setValue(3);
//        BreadthFirst graph = new BreadthFirst();
//        graph.getVertexes().add(graphNodeA);
//        graph.getVertexes().add(graphNodeB);
//        graph.getVertexes().add(graphNodeC);
//        graph.addEdge(graphNodeA, graphNodeB, 0);
//        graph.addEdge(graphNodeA, graphNodeC, 0);
//        graph.addEdge(graphNodeC, graphNodeB, 0);
//        LinkedList<Integer> results = graph.breadthFirstTraversal(graphNodeA);
//        assertEquals("results", "[GraphNode{value=A, edges=[Edge{origin=A, destination=B}, Edge{origin=A, destination=C}]}, GraphNode{value=B, edges=[Edge{origin=B, destination=C}, Edge{origin=B, destination=A}]}, GraphNode{value=C, edges=[Edge{origin=C, destination=B}, Edge{origin=C, destination=A}]}]", results.toString());
//
//    }
}
