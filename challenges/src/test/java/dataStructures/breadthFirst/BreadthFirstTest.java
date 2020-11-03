package dataStructures.breadthFirst;

import dataStructures.graph.Graph;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class BreadthFirstTest {

    @Test
    public void testBreadthFirst(){
        Graph.GraphNode<String> graphNodeA = new Graph.GraphNode<>();
        Graph.GraphNode<String> graphNodeB = new Graph.GraphNode<>();
        Graph.GraphNode<String> graphNodeC = new Graph.GraphNode<>();
//        Graph.GraphNode<String> graphNodeD = new Graph.GraphNode<>();
//        Graph.GraphNode<String> graphNodeE = new Graph.GraphNode<>();
//        Graph.GraphNode<String> graphNodeF = new Graph.GraphNode<>();
        graphNodeA.setValue("A");
        graphNodeB.setValue("B");
        graphNodeC.setValue("C");
//        graphNodeD.setValue("D");
//        graphNodeE.setValue("E");
//        graphNodeF.setValue("F");
        BreadthFirst graph = new BreadthFirst();
        graph.getVertexes().add(graphNodeA);
        graph.getVertexes().add(graphNodeB);
        graph.getVertexes().add(graphNodeC);
//        graph.getVertexes().add(graphNodeD);
//        graph.getVertexes().add(graphNodeE);
//        graph.getVertexes().add(graphNodeF);
        graph.addEdge(graphNodeA, graphNodeB, 0);
        graph.addEdge(graphNodeA, graphNodeC, 0);
        graph.addEdge(graphNodeC, graphNodeB, 0);
//        graph.addEdge(graphNodeC, graphNodeA, 0);
//        graph.addEdge(graphNodeC, graphNodeD, 0);
//        graph.addEdge(graphNodeA, graphNodeB, 0);
        HashSet<String> results = graph.breadthFirstTraversal(graphNodeA);
        assertEquals("results", "", results.toString());





//        graph.getVertexes().add(graphNodeOne);
//        graph.getVertexes().add(graphNodeTwo);
//        graph.getVertexes().add(graphNodeThree);
//        graph.addEdge(graphNodeOne, graphNodeTwo, 19);
//        graph.addEdge(graphNodeOne, graphNodeThree, 60);
//        assertEquals("some neighbors", "[Neighbor{weight=15, destination=19}, Neighbor{weight=30, destination=60}]", graph.getNeighbors(graphNodeOne).toString());
//        assertEquals("graph has 2 vertices", 3, graph.getVertexes().size());

    }
}
