//nesting loops (one inside another)

package org.example.week2_loops_and_arrays;

import static input.InputUtils.positiveIntInput;

public class vid_2_square_of_stars_clara_code {

    public static void main(String[] args) {

        // Display a square of *

//        //The outer loop prints one row per loop repeat
//        for (int x = 0 ; x < 5 ; x++ ) {
//
//            //Inner for loop. For each row, print a star 5 times
//            for (int y = 0 ; y < 5; y++) {
//                //Notice System.out.print - not println. This doesn't add the newline
//                //at the end of the output, so all the stars are on the same line
//
//                //print (without ln) will print one right after each other)
//                System.out.print("*");
//            }
//
//            //And then move to the next line
//            System.out.println();
//            //output:
//            //*****
//            //*****
//            //*****
//            //*****
//            //*****
        //Challenge questions:
        //Can you modify the previous program to display a square of any size?
        //  The user should be able to enter the square size
        //Hint: use a variable to represent the square size
        //Can you modify it to display a square of any character of the user's choice?
        // Display a square of *

        //The outer loop prints one row per loop repeat

        int widthOfSquare = positiveIntInput("How many stars wide would you like your shape?");
        int lengthOfSquare = positiveIntInput("How many stars long would you like your shape?");

        for (int x = 0; x < lengthOfSquare; x++) {

            //Inner for loop. For each row, print a star 5 times
            for (int y = 0; y < widthOfSquare; y++) {
                //Notice System.out.print - not println. This doesn't add the newline
                //at the end of the output, so all the stars are on the same line

                //print (without ln) will print one right after each other)
                System.out.print("*");
            }

            //And then move to the next line
            System.out.println();

            //question/input/output:
            //How many stars wide would you like your shape?
            //18
            //How many stars long would you like your shape?
            //4
            //******************
            //******************
            //******************
            //******************

        }
    }
}