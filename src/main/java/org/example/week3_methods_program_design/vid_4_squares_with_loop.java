/* From Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/Squares3.java
*/

package org.example.week3_methods_program_design;

public class vid_4_squares_with_loop {
    //This is the Main method - the first code to run
    public static void main(String[] args) {

        System.out.println("Here are the squares of the numbers 1 to 10");

        for (int x = 1 ; x <= 10 ; x++ ) {
            double xSquared = square(x);
            System.out.println("The square of " + x + " is " + xSquared);
        }

    }    // This is the end of the Main method.


    // This method takes one argument, a number
    // It calculates the square of that number (by multiplying it by itself)
    // and then returns the square value.
    public static double square(double n) {

        double sq = n * n;   // The square of a number is that number multiplied by itself
        return sq;

    }    // The end of the squares method
}

