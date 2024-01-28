/*Your turn
In the same project, create a new Java class and add a main method, as before
In your main method, ask the user for the distance between their house and MCTC, in miles
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
        System.out.println("You live " + convertMilesToKilometers + " kilometers from MCTC.");
        //input: 3
        //output: You live 4.800000000000001 kilometers from MCTC.

        //how to get only 2 decimal places in the output?:
        //System.out.printf("%d of %s at $%.2f each costs $%.2f", quantity, productName, price, totalPrice);
        //System.out.printf("You live %d kilometers from MCTC", convertMilesToKilometers);
    }
}
//paused video 4 at ~ min 14.20, powerpoint slide 39
