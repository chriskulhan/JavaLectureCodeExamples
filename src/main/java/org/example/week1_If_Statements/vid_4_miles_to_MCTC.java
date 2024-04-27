/*Your turn
In the same project, create a new Java class and add a Main method, as before
In your Main method, ask the user for the distance between their house and MCTC, in miles
Use the positiveDoubleInput method
Your program should convert this distance to kilometers, and display the distance in kilometers
To convert miles to kilometers: multiply by 1.6

 */

package org.example.week1_If_Statements;

import static input.InputUtils.positiveDoubleInput;

public class vid_4_miles_to_MCTC {
    public static void main(String[] args) {
        double milesToMCTC = positiveDoubleInput("How many miles do you live from MCTC?");
        double convertMilesToKilometers = milesToMCTC * 1.6;

        //does the user live more than 10 miles away?
        //add to program an if statement: "You live more than 10 miles from MCTC!:
        if ( milesToMCTC > 10 ) {
            System.out.println("You live more than 10 miles from MCTC!");
            //add an else to display "You live less than 10 miles away"
        } else {
            System.out.println("You live less than or equal to 10 miles from MCTC!");
            //input: 10
            //output: You live less than or equal to 10 miles from MCTC!
            //You live 16.0 kilometers from MCTC.

            //input: 3
            //output: You live less than or equal to 10 miles from MCTC!
            //You live 4.800000000000001 kilometers from MCTC.
        }

        System.out.println("You live " + convertMilesToKilometers + " kilometers from MCTC.");
        //input: 3
        //output: You live 4.800000000000001 kilometers from MCTC.

        //how to get only 2 decimal places in the output?:
        //System.out.printf("%d of %s at $%.2f each costs $%.2f", quantity, productName, price, totalPrice);
        //System.out.printf("You live %d kilometers from MCTC", convertMilesToKilometers);

        //input: 11
        //output:You live more than 10 miles from MCTC!
        //You live 17.6 kilometers from MCTC.

        //input: 1
        //output: You live 1.6 kilometers from MCTC.

        //input: 9
        //output: You live 14.4 kilometers from MCTC.

    }
}

