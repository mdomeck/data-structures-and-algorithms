package dataStructures.graph;


import java.util.*;

public class Graph {

    ArrayList<GraphNode> vertexes;

   public Graph(){
       this.vertexes = new ArrayList<>();
   }

    public void addEdge(GraphNode nodeOne, GraphNode nodeTwo) {
        Edge edge1 = new Edge(nodeOne, nodeTwo);
        nodeOne.getEdges().add(edge1);

        Edge edge2 = new Edge(nodeTwo, nodeOne);
        nodeTwo.getEdges().add(edge2);
    }

    public void addNode(String value) {
        GraphNode<String> newNode = new GraphNode<String>(value);
        vertexes.add(newNode);
    }

    public void getNodes(){

    }

    public void getNeighbors(){

    }
    
    public void sizeWithNodes(){

    }

    public String toString() {
        String returnString = "Graph :\n";

        for (GraphNode node : vertexes) {
            String neighbors = String.format("      %s : [", node.getValue());
            ArrayList<Edge> edges = node.getEdges();
            for(Edge edge : edges){
                neighbors += edge.getDestination() + " ";
            }
            neighbors += "]\n";
            returnString += neighbors;
        }
        return returnString;
    }

    public ArrayList<GraphNode> getVertexes(){
       return vertexes;
    }

    public void setVertexes(ArrayList<GraphNode> vertexes){
       this.vertexes = vertexes;
    }

}
