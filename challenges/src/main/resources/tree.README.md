# Trees
Creating Binary Tree Data Structures

## Challenge
Create a Node class that has properties for the value stored in the node, the let child node and the right child node.
Create a BinaryTree class with methods called preOrder, inOrder and postOrder. Returns an array of the values ordered appropriately. 
Exception thrown for same value
Bianary Search Tree for add that accepts a value and adds a new node with theat value in the corret location in the binary tree
Contains accepts a value and returns a boolean whether or not the value is in the tree at least once.

## Approach & Efficiency
Made a Node Class to carry the values and point at left and right Node children
Made Tree Class that points to its root node
Binary Tree class extends Tree and adds methods for searching the tree
Binary Search Tree has methods for add and contains
Testing to check all methods

## API
<!-- Description of each method publicly available in each of your trees -->
preOrder: adds values as it finds new nodes
inOrder: adds values once it knows there is no value to the left of it 
postOrder: adds children first
add recursively adds nodes to tree
contains returns boolean