package dataStructures.graph;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DepthFirst extends Graph {

    Set<GraphNode> visited = new HashSet<>();

    public ArrayList<String> depthFirstPreOrder(GraphNode nodeToStart) {
        visited.clear();
        ArrayList<String> depthFirst = new ArrayList<>();
        depthFirstPreOrderHelper(nodeToStart, depthFirst);
        return depthFirst;
    }

    private ArrayList<String> depthFirstPreOrderHelper(GraphNode nodeToCheck, ArrayList<String> visitedInThisOrder){
        visited.add(nodeToCheck);
        visitedInThisOrder.add((String)nodeToCheck.getValue());

        for (Edge edge : (HashSet<Edge>) nodeToCheck.getEdges()){
            if(!visited.contains(edge.getDestination())) {
                depthFirstPreOrderHelper(edge.getDestination(), visitedInThisOrder);
            }
        }
        return visitedInThisOrder;
    }


}
