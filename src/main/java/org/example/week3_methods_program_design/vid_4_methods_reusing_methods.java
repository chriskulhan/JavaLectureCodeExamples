/*From Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/Squares.java

*/

package org.example.week3_methods_program_design;

import static input.InputUtils.doubleInput;

public class vid_4_methods_reusing_methods {
    public static void main(String[] args) {

        double number = doubleInput("Please enter a number and I'll square it");
        square(number);

    }    // This is the end of the Main method.

    // This method takes one argument, a number
    // It calculates the square of that number (by multiplying it by itself)
    // and prints the number and its square value
    public static void square(double n) {

        double sq = n * n;   // The square of a number is that number multiplied by itself
        System.out.println("The square of " + n + " is " + sq);
        //input:output:
        // Please enter a number and I'll square it
        //2
        //The square of 2.0 is 4.0
    }    // The end of the squares method

} // End of the Squares class
