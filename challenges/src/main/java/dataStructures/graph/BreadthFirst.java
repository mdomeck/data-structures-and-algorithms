package dataStructures.graph;

import dataStructures.graph.Graph;
import dataStructures.stacksandqueues.Queue;
import java.util.*;

public class BreadthFirst extends Graph{

    public LinkedList breadthFirstTraversal(Graph.GraphNode node) {
        LinkedList returnSet = new LinkedList();
        Queue<Graph.GraphNode> qGraph = new Queue<>();
        qGraph.enqueue(node);

        while (!qGraph.isEmpty()){
            Graph.GraphNode currNode = qGraph.dequeue();
            returnSet.add(currNode);
       // System.out.println(qGraph.toString());

            if(!currNode.getEdges().isEmpty()){
                Set<Graph.Edge> neighborhood = currNode.getEdges();
                for (Graph.Edge neighbor : neighborhood){
                    if(returnSet.add(neighbor.getDestination())){
                        qGraph.enqueue(neighbor.getDestination());
                    }
                }
            }
        }
        System.out.println(returnSet);
    return returnSet;
    }


}
