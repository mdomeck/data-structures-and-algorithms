# Hashtables
Implement a Hashtable

## Challenge
Implement a Hashtable with methods `add`, `get`, `contains`, and `hash`


## Approach & Efficiency
A list of lists that each store nodes containing key value pairs.
Time Efficiency: O(1)
Space Efficiency: O(1)

## API
- add: takes in both the key and value. This method should hash the key, and add the key and value pair
 to the table, handling collisions as needed.
- get: takes in the key and returns the value from the table.
- contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
- hash: takes in an arbitrary key and returns an index in the collection.