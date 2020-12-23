package dataStructures.graph;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetEdgeTest<T> extends Graph<T> {

    @Test
    public void directFlightTestHappy() {
        GetEdge graph = new GetEdge();
        Graph.GraphNode<String> pandora = new Graph.GraphNode<>();
        Graph.GraphNode<String> metroville = new Graph.GraphNode<>();
        Graph.GraphNode<String> arendelle = new Graph.GraphNode<>();
        Graph.GraphNode<String> monstropolis = new Graph.GraphNode<>();
        Graph.GraphNode<String> naboo = new Graph.GraphNode<>();
        Graph.GraphNode<String> narnia = new Graph.GraphNode<>();
        pandora.setValue("Pandora");
        metroville.setValue("Metroville");
        arendelle.setValue("Arendelle");
        monstropolis.setValue("Monstropolis");
        naboo.setValue("Naboo");
        narnia.setValue("Narnia");
        graph.addEdge(pandora, arendelle, 150);
        graph.addEdge(pandora, metroville, 82);
        graph.addEdge(arendelle, metroville, 99);
        graph.addEdge(arendelle, monstropolis, 42);
        graph.addEdge(monstropolis, metroville, 105);
        graph.addEdge(monstropolis, naboo, 73);
        graph.addEdge(metroville, naboo, 26);
        graph.addEdge(metroville, narnia, 250);
        graph.addEdge(narnia, naboo, 37);
        graph.getVertexes().add(pandora);
        graph.getVertexes().add(metroville);
        graph.getVertexes().add(arendelle);
        graph.getVertexes().add(monstropolis);
        graph.getVertexes().add(naboo);
        graph.getVertexes().add(narnia);

        System.out.println(graph);

        GetEdge.DirectFlight result = graph.takeATrip(new String[]{"Pandora", "Arendelle"});
        assertEquals("DirectFlight{available=true, price=150}", result.toString());
        GetEdge.DirectFlight result2 = graph.takeATrip(new String[]{"Pandora", "Arendelle", "Metroville"});
        assertEquals("DirectFlight{available=true, price=249}", result2.toString());
    }

    @Test
    public void directFlightTestBreak() {
        GetEdge graph = new GetEdge();
        Graph.GraphNode<String> pandora = new Graph.GraphNode<>();
        Graph.GraphNode<String> metroville = new Graph.GraphNode<>();
        Graph.GraphNode<String> arendelle = new Graph.GraphNode<>();
        Graph.GraphNode<String> monstropolis = new Graph.GraphNode<>();
        Graph.GraphNode<String> naboo = new Graph.GraphNode<>();
        Graph.GraphNode<String> narnia = new Graph.GraphNode<>();
        pandora.setValue("Pandora");
        metroville.setValue("Metroville");
        arendelle.setValue("Arendelle");
        monstropolis.setValue("Monstropolis");
        naboo.setValue("Naboo");
        narnia.setValue("Narnia");
        graph.addEdge(pandora, arendelle, 150);
        graph.addEdge(pandora, metroville, 82);
        graph.addEdge(arendelle, metroville, 99);
        graph.addEdge(arendelle, monstropolis, 42);
        graph.addEdge(monstropolis, metroville, 105);
        graph.addEdge(monstropolis, naboo, 73);
        graph.addEdge(metroville, naboo, 26);
        graph.addEdge(metroville, narnia, 250);
        graph.addEdge(narnia, naboo, 37);
        graph.getVertexes().add(pandora);
        graph.getVertexes().add(metroville);
        graph.getVertexes().add(arendelle);
        graph.getVertexes().add(monstropolis);
        graph.getVertexes().add(naboo);
        graph.getVertexes().add(narnia);

        System.out.println(graph);

     
        GetEdge.DirectFlight result3 = graph.takeATrip(new String[]{"Pandora", "Naboo"});
        assertEquals("DirectFlight{available=false, price=0}", result3.toString());
        GetEdge.DirectFlight result4 = graph.takeATrip(new String[]{"Pandora", "Arendelle", "Naboo"});
        assertEquals("DirectFlight{available=false, price=0}", result4.toString());
    }
}
