package dataStructures.graph;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.junit.Test;

import java.util.ArrayList;

public class GraphTest {

@Test
public void graphTest(){
    Graph testGraph = new Graph();
    testGraph.addNode("Seattle");
    testGraph.addNode("New York");
    testGraph.addNode("California");
    testGraph.addNode("Ohio");

    testGraph.addEdge(testGraph.vertexes.get(0), testGraph.vertexes.get(1));
    testGraph.addEdge(testGraph.vertexes.get(2), testGraph.vertexes.get(3));

    ArrayList<GraphNode> nodes = testGraph.getVertexes();
    ArrayList<Edge> edges = nodes.get(0).getEdges();

    //String place = edges.get(0).getDestination().toString();
    //System.out.println("the end result " + place);
    System.out.println("whole graph " + testGraph.toString());
    testGraph.toString();
}

}
