/*
Vector (slide 21)
-Vectors are very similar to ArrayList, and use an array to store data internally

-But Vector is thread-safe (aka synchronized) **safer but slower
    -Threads in a program are tasks that can run at the same time. What if two threads tried to add an item to a List?
    -Vector makes sure that two different parts of the program don't modify a Vector at once
    -But this makes it slower than ArrayList
    -Unless you are writing a program with more than one thread, use ArrayList
    -When we write GUI code, we'll use Vector

Vector works the same as Array List and Linked List in coding (except the initial name)

 */

package org.example.week4_lists;

public class vid_1_vector {
}
