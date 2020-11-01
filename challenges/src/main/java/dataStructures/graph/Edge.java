package dataStructures.graph;

public class Edge<T> {

    private GraphNode origin;
    private GraphNode destination;
    private T weight;

    public Edge(GraphNode origin, GraphNode destination) {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "weight=" + weight +
                '}';
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

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }
}
