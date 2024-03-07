/* LinkedList a chain of nodes (slide 14)

//Made of nodes linked together
    //Each node stores one list item
//Each node has a link to the node immediately before and after itself
//A LinkedList knows where the start and end node are, but can't access the middle nodes directly
//advantages of LinkedLists:
    //fast to read data from beginning to end or reverse,
// adding a new data piece: create a new node, get rid of end cap (which is index zero), create a new link

//How do you work with data in a Linked List? (slide 15)
   Suppose we need to test if dataC is in the LinkedList
    Start at the beginning, follow the links until we get to dataC; return true.
        If we get to the end without finding dataC, then return false
    Can also retrieve the nth node (counting from 0)
    Start at the beginning, count along the links n times
    Easy to fetch the first or last node

**How to add data to the middle in a LinkedList:
    cross from start to the place you want to add, break the link and then add the node and add new links to each.

**How do you remove an item from a LinkedList?
    **Same concept as above,
    -you have to move from the start or end to find the place the item is,
    -remove the links
    -relabel the each new node
    -make new links

***Advantages of LinkedLists: (slide 19)

-Fairly fast to search, slower for larger Lists
-Follow links along the nodes until the item is found, or get to end of list
-Fast to add items at the start or end
-Fast to remove items at the start or end
-Fairly fast to add items in the middle

**working with a LinkedList is the same as working with an ArrayList

 */

