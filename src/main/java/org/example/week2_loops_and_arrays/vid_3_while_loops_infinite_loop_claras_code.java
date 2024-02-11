package org.example.week2_loops_and_arrays;

public class vid_3_while_loops_infinite_loop_claras_code {
//code from Clara: InfiniteWhileLoop.java
    public static void main(String[] args) {

        // This is an infinite while loop - there's no way for the condition to become false,
        // so it will run forever.
        // This is a deliberate infinite while loop, but it's very possible to accidentally
        // write an infinite while loop.

        while (true) {
            //this is an error because the program sees this is an infinite loop

            System.out.println("This is an infinite while loop!");

        }
        //output:
        // This is an infinite while loop!
        //This is an infinite while loop!
        //
        //***needed to press stop to finish**
        //Process finished with exit code 130 (interrupted by signal 2:SIGINT)

        // If you accidentally write an infinite while loop
        // your program will run forever!
        // But no problem - press Control+C to stop it running,
        // or press the red square stop button at the left of the IntelliJ output console.
        // And then look at your code to see what happened.

        // Make sure you have a way for the condition to become false.
        // The condition usually has a variable in it, so somewhere in the loop body,
        // there should be a variable or variables that can change to make the condtion
        // false, and to stop the loop.

        // You can also use a break statement - see other examples.

    }

}

