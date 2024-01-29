/*Your turn
Start with your miles to MCTC program
Once the user has typed in their response, display "you live more than 10 miles from MCTC" if they live more than 10 miles away
And, display "you live exactly 10 miles from MCTC" if they live exactly 10 miles away
And, display "you live less than 10 miles from MCTC" if they live less than 10 miles away

Use if – else if – else statements
 */

package org.example.week1_If_Statements;

import static input.InputUtils.positiveDoubleInput;

public class vid_6_miles_to_MCTC_additions {
    public static void main(String[] args) {
        double milesToMCTC = positiveDoubleInput("How many miles do you live from MCTC?");

        if ( milesToMCTC > 10 ) {
            System.out.println("You live more than 10 miles from MCTC!");

        } else if (milesToMCTC == 10) {
            System.out.println("You live exactly 10 miles away from MCTC!");

        } else {
            System.out.println("You live less than 10 miles from MCTC!");
            //input: 10
            //output: You live exactly 10 miles away from MCTC!

            //input: 3
            //output: You live less than 10 miles from MCTC!

            //input: 11
            //output: You live more than 10 miles from MCTC!
        }
    }
}

