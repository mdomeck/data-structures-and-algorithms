package dataStructures.graph;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class GraphTest {


    @Test
    public void makeGraphNode(){
        Graph.GraphNode<Integer> graphNode = new Graph.GraphNode<>();
        graphNode.setValue(4);
        System.out.println(graphNode.getValue());
        assertEquals("4", graphNode.getValue().toString());
    }

    @Test
    public void makeGraphEmpty(){
        Graph.GraphNode<Integer> graphNode = new Graph.GraphNode<>();
        Graph graph = new Graph();
        System.out.println(graph);
        assertEquals("Graph{vertexes=[]}", graph.toString());
    }

    @Test
    public void makeGraphOneNode(){
        Graph.GraphNode<Integer> graphNode = new Graph.GraphNode<>();
        graphNode.setValue(4);
        Graph graph = new Graph();
        graph.getVertexes().add(graphNode);
        assertEquals("Graph{vertexes=[GraphNode{value=4, edges=[]}]}", graph.toString());
    }

    @Test
    public void makeEdges(){
        Graph.GraphNode<Integer> graphNodeOne = new Graph.GraphNode<>();
        graphNodeOne.setValue(4);
        Graph.GraphNode<Integer> graphNodeTwo = new Graph.GraphNode<>();
        graphNodeOne.setValue(15);
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.addEdge(graphNodeOne, graphNodeTwo, 19);
        assertEquals("Graph{vertexes=[GraphNode{value=15, edges=[Edge{origin=15, destination=null}]}, GraphNode{value=null, edges=[Edge{origin=null, destination=15}]}]}", graph.toString());
    }

    @Test
    public void getNodes(){
        Graph.GraphNode<Integer> graphNodeOne = new Graph.GraphNode<>();
        graphNodeOne.setValue(4);
        Graph.GraphNode<Integer> graphNodeTwo = new Graph.GraphNode<>();
        graphNodeTwo.setValue(15);
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.addEdge(graphNodeOne, graphNodeTwo, 19);
        Object[] verticesArray = graph.getVertexes().toArray();
        System.out.println(Arrays.toString(verticesArray));
        assertEquals(2, graph.getVertexes().size(), "2 vertices graph");
    }

    @Test
    public void getNeighbors(){
        Graph.GraphNode<Integer> graphNodeOne = new Graph.GraphNode<>();
        Graph.GraphNode<Integer> graphNodeTwo = new Graph.GraphNode<>();
        Graph.GraphNode<Integer> graphNodeThree = new Graph.GraphNode<>();
        graphNodeOne.setValue(4);
        graphNodeTwo.setValue(15);
        graphNodeThree.setValue(30);
        Graph graph = new Graph();
        graph.getVertexes().add(graphNodeOne);
        graph.getVertexes().add(graphNodeTwo);
        graph.getVertexes().add(graphNodeThree);
        graph.addEdge(graphNodeOne, graphNodeTwo, 19);
        graph.addEdge(graphNodeOne, graphNodeThree, 60);
        assertEquals("[Neighbor{weight=15, destination=19}, Neighbor{weight=30, destination=60}]", graph.getNeighbors(graphNodeOne).toString());
        assertEquals(3, graph.getVertexes().size(), "graph has 2 vertices");
    }

}
