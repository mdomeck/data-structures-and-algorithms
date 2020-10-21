# Merge Sort

###Pseudocode

 ```
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

```
    
      
 ### Trace
 
 [8, 4, 23, 42, 16, 15]

 This image maps the steps as the array splits and then merges into a sorted array. It moved down the left side first and then comes back up and goes down the right. Super fun dance is made!

 ![Merge Sort Steps](assets/merge-sort-whiteboard.png)

### Merge Sort

Set n to the length of the array

if n is greater than 1

set mid = n/2
set left = first half of array
set right = second half array

run Mergesort(left) to sort the left array recursively this will continue to sort until one value remains in each array
run Mergesort(right) to sort the right array recursively this will contine to sort until one value remains in each array
Mergesort(left, right, arr) to merge the sorted left's and right's together and return sorted array
 
 
### Merge
 
declare the helper function that will return sorted array
declaring i as 0, it's a counter
declaring j as 0, it's a counter
declaring k as 0, its a counter

while i is less that the length of the left array and j is less than the length of the right array

if the int at left array's value at index position of 1 is less than or equal to the right array. Then the value of array at position k is equal to the value at the index position of left at 1. Then it increments 1

Otherwise the value of array at position k is equal to the value of he right array at position j. Then it increments

increments k

if i is equal to the length of the left move the remainder of the right array into array in position. Otherwise move the remainder of the left array into aray in position.

      
### Efficency
 
Time: O(n log n)
It will be less space you won't have to itterate over them again so more efficient on speed. Without a nested for loop you won't be at n squared.

Space: O(log n)
Will have as many spaces as what you are itterating over n + however many values are in the array.
   