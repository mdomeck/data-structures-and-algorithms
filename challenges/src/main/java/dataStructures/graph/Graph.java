package dataStructures.graph;


import java.util.*;

public class Graph<T> {

    public Graph() {}

    private final Set<GraphNode> vertexes = new HashSet<>();
    public Set<GraphNode> getVertexes() {return vertexes; }
    

    public void add(T value) {
        GraphNode<T> node = new GraphNode();
        node.setValue(value);
        vertexes.add(node);
    }

    public static class GraphNode<T> {
        private T value;


        public Set<Edge> edges = new HashSet<>();

        public Set<Edge> getEdges() {
            return edges;
        }

        public void setEdges(Set<Edge> edges) {
            this.edges = edges;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "GraphNode{" + "value=" + value + ", edges=" + edges + '}';
        }

    }
    public static class Edge{

        private GraphNode origin;
        private GraphNode destination;
        private Integer weight;

        public Edge(GraphNode origin, GraphNode destination, int weight) {
            this.origin = origin;
            this.destination = destination;
            this.weight = weight;
        }

        public GraphNode getOrigin() { return origin; }
        public void setOrigin(GraphNode origin) { this.origin = origin; }

        public GraphNode getDestination() { return destination; }
        public void setDestination(GraphNode destination) { this.destination = destination; }

        public Integer getWeight() { return weight; }
        public void setWeight(Integer weight) { this.weight = weight; }

        @Override public String toString() {
            return "Edge{" + "origin=" + origin.getValue() + ", destination=" + destination.getValue() + '}';
        }
    }

    public void addEdge(GraphNode origin, GraphNode destination, int weight){
        Edge edgeOne = new Edge(origin, destination, weight);
        Edge edgeTwo = new Edge(destination, origin, weight);
        origin.getEdges().add(edgeOne);
        destination.getEdges().add(edgeTwo);
    }

    private class Neighbor<T> {

        private Integer weight;
        private T destination;

        public Neighbor(Integer weight, T destination) {
            this.weight = weight;
            this.destination = destination;
        }

        public Integer getWeight() { return weight; }
        public void setWeight(Integer weight) { this.weight = weight; }

        public T getDestination() { return destination; }
        public void setDestination(T destination) { this.destination = destination; }

        @Override
        public String toString() {
            return "Neighbor{" +  "weight=" + weight + ", destination=" + destination + '}';
        }
    }


    public ArrayList<Neighbor> getNeighbors(GraphNode node) {
        ArrayList<Edge> neighbors = new ArrayList<>(node.getEdges());
        ArrayList<Neighbor> destinations = new ArrayList<>();
        for (int i = 0; i < neighbors.size(); i++) {
            Neighbor thisNeighbor = new Neighbor((Integer) neighbors.get(i).getDestination().getValue(), neighbors.get(i).getWeight());
            destinations.add(thisNeighbor);
        }
     return destinations;
}

    @Override
    public String toString() {
        return "Graph{" + "vertexes=" + vertexes + '}';
    }

}
