# Graphs
Implement a Graph

## Challenge
Implement a Graph that should be represented as an adjacency list and include the following methods:
AddNode(), AddEdge(), GetNodes(), GetNeighbors(), Size()

## Approach & Efficiency
Using a hashset Sets to ensure each point of the graph and edges are unique. Each point has it's own
 value and keeps track of what other points it can reach. 

## API
- AddNode()
  - Adds a new node to the graph
  - Takes in the value of that node
  - Returns the added node
- AddEdge()
  - Adds a new edge between two nodes in the graph
  - Include the ability to have a “weight”
  - Takes in the two nodes to be connected by the edge
  - Both nodes should already be in the Graph
- GetNodes()
  - Returns all of the nodes in the graph as a collection (set, list, or similar)
- GetNeighbors()
  - Returns a collection of edges connected to the given node
  - Takes in a given node
  - Include the weight of the connection in the returned collection
- Size()
  - Returns the total number of nodes in the graph