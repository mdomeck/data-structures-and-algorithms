package dataStructures.graph;


import java.util.*;

public class Graph {

    ArrayList<GraphNode> vertexes;

   public Graph(){
       this.vertexes = new ArrayList<>();
   }

    public void addEdge(GraphNode nodeOne, GraphNode nodeTwo, int weight) {
        Edge edge1 = new Edge(nodeOne, nodeTwo);
        nodeOne.getEdges().add(edge1);

        Edge edge2 = new Edge(nodeTwo, nodeOne);
        nodeTwo.getEdges().add(edge2);
    }

    public GraphNode addNode(String value) {
        GraphNode<String> newNode = new GraphNode<>(value);
        vertexes.add(newNode);
        return newNode;
    }

    public void getNodes(){

    }

    public LinkedHashMap getNeighbors(GraphNode home){
                LinkedHashMap neighbors = new LinkedHashMap();
                ArrayList<Edge> neighborhood = home.getEdges();

                for(Edge neighbor : neighborhood){
                    neighbors.put(neighbor.getDestination(), neighbor.getWeight());
                }
                return neighbors;
   }

    public int size(){
        return vertexes.size();
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
