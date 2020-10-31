package dataStructures.graph;

public class Edge {

    private GraphNode origin;
    private GraphNode destination;


    public Edge(GraphNode origin, GraphNode destination) {
        this.origin = origin;
        this.destination = destination;
    }


    public GraphNode getOrigin() {
        return origin;
    }

    public void setOrigin(GraphNode origin) {
        this.origin = origin;
    }

    public GraphNode getDestination() {
        return destination;
    }

    public void setDestination(GraphNode destination) {
        this.destination = destination;
    }
}
