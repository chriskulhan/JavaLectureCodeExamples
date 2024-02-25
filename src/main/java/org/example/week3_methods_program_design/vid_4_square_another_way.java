/*
Clara's code:https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/Squares2.java
 -this is the way the labs expect you to code: (no printing within methods, and only one task per method)
 */

package org.example.week3_methods_program_design;

import static input.InputUtils.doubleInput;

public class vid_4_square_another_way {
    public static void main(String[] args) {

        double number = doubleInput("Please enter a number and I'll square it");
        double squaredNumber = square(number);
        System.out.println("The square of " + number + " is " + squaredNumber);


    }    // This is the end of the main method.


    // This method takes one argument, a number
    // It calculates the square of that number (by multiplying it by itself)
    // and then returns the square value.
    public static double square(double n) {

        double sq = n * n;   // The square of a number is that number multiplied by itself
        return sq;
        //input:output:
        //Please enter a number and I'll square it
        //4
        //The square of 4.0 is 16.0

    }    // The end of the squares method
}

/*notes: printing things from methods isn't advised because the methods should only do one thing at a time.
-makes the method more reusable.
 */