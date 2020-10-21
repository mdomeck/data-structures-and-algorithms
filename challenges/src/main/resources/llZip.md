# Linked List Zipped
<!-- Short summary or background information -->
Write a function called zipLists which takes two linked lists as arguments.
Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.

zipLists(list1, list2)
Arg list1
head -> [1] -> [3] -> [2] -> X	
Arg list2
head -> [5] -> [9] -> [4] -> X	
Output
head -> [1] -> [5] -> [3] -> [9] -> [2] -> [4] -> X
 
## Challenge
<!-- Description of the challenge -->
Alternate between linked lists to create new Linked list of all values in both.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
O(n);
Take head of first linked list, put into separate linked list. Linked list call .next method on head of first list.
Go to head of second list, put into next position. Use insert method on new linked list.
Alternate between both.

## Solution
<!-- Embedded whiteboard image -->
![LL Zip](assets/llZip.png)