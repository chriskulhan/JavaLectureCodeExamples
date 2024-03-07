package org.example.week3_methods_program_design;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class vid_9_passing_objects_to_methods {
    /**
     * Created by clara on 2019-08-23.
     * https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/ModifyingArrayInMethod.java
     */

        /* Compare this to NotModifyingPrimitiveTypes and NotModifyingPrimitiveTypesBUG.
         *
         * Unlike these programs, an array is NOT copied when it is sent to a method.
         *
         * Instead, the location of the array in memory is copied, and that's sent to the method.
         * A location in memory is called a reference. Both main and getThreeFavoriteMovies have
         * a reference to the same array.
         *
         * So when the method works with the array, it looks at the memory address, and works with
         * the array it finds there.
         *
         * There is only one array. Both main and getThreeFavoriteMovies have a reference to this array.
         * So when getThreeFavoriteMovies modifies the array, then main can see these changes.
         *
         * */

        public static void main(String[] args) {
            String[] topThreeMovies = new String[3]; // Create an empty array
            getThreeFavoriteMovies(topThreeMovies);  // pass the empty array to getThreeFavoriteMovies method
            // main never modifies the topThreeMovies array.
            // But, because getThreeFavoriteMovies modifies the array, this prints the names the user entered
            System.out.println("Your top three favorite movies are " + Arrays.toString(topThreeMovies)); //
        }

        private static void getThreeFavoriteMovies(String[] movies) {
        /* Notice that this method doesn't return anything. The array movies is the same
        array as topThreeMovies in main. So when this method modifies movies, then because
        topThreeMovies the same array, the main method can access the movie data in it.

        In this program, the array movies is effectively the same array as topThreeMovies in the main method. */

            for (int x = 0 ; x < 3; x++) {
                String favoriteMovie = stringInput("Please enter one of your favorite movies");
                movies[x] = favoriteMovie;
            }
        }
    }

/* powerpoint slide 52:

Pass by value:
// Primitive values (int, double, boolean…) and Strings, and objects which wrap primitive types, are
    sent to methods using pass by value
//A copy of the value is made
//This copy is given to the method
//The copy may be modified
//The original value does not change if the copy is modified
//All primitive variables in scope are stored in a part of memory called the stack

slide 53: References:

-An array is an object
    -There are many other types of objects in Java that we'll meet later, and you'll also create your own types
-Objects are more complex than primitive types
-How big is an object?
-Could be any size, and its size could change
-So it's hard to organize them in memory
-So to organize objects, they are saved in a part of the memory called the heap, which has lots of room
-And so the code can find an object, a reference to that object is saved on the stack
-The reference tells the stack where to find the object in the heap
-Object references are values
-An object reference is a memory address - basically, a number


Stack vs. heap:
https://dzone.com/articles/java-memory-management

Passing references by value: (powerpoint 56)

-How are objects (like arrays) sent to methods?
-Making a copy of an object could be very slow
-Instead, the object's reference is sent
    -The object is not copied
    -The reference to the object is copied, and that is sent to the method (remember a reference is basically a number)
    -A reference to an object is the location of the actual object in the heap
    -So when the method accesses or modifies the object, it looks at its copy of the reference, and uses that to find
    the original object in the heap
    -So if the method modifies the object, the original object is modified
    -There is only one object (although there are two copies of its reference)

-This is why, in the previous programs, the array changes when it is modified in the method, and the int does not

An array is an object (slide 58)

-Coming up in the next classes: more objects
-File, Exception, LinkedList, ArrayList, HashMap, GUI components, objects you design and make….
-So you'll see more examples of passing reference by value being useful in your code
-Can make your code simpler when you need a method that modifies an object
-Tip: a method which modifies one of its arguments should reflect that in the method name, so it is clear what is happening
-doubleNumbersInArray(myArray)
-makeListUppercase(myListOfStrings)



 */

