package org.example.week2_loops_and_arrays;

import static input.InputUtils.intInput;

public class vid_3_ContinueExampleAddingNumbers_fromClarasCode {
    public static void main(String[] args) {

        // Ask user for 5 numbers between 1 and 100, and add them up. Ignore numbers outside this range

        //count of numbers entered starts here with 0:
        int numbersEntered = 0;

        //sum the numbers starts here with 0:
        int sumOfNumbers = 0;

        while ( numbersEntered < 5 ) {

            int number = intInput("Please enter a number between 0 and 100.");

            //check to see if the number is between 1 and 100, if it's not, continue will skip the rest of the loop
                //and go back up to the "please enter a number..."
            if (number < 0 || number > 100 ) {
                System.out.println("You must enter a number between 0 and 100");
                continue;     // Skip the rest of the loop. If the while condition is still true, the loop will continue.
            }

            //if the number is valid, it will be counted here:
            numbersEntered++;

            System.out.println("You have now entered " + numbersEntered + " number(s). The last valid number you entered was " + number);

            // You'll probably process the numbers somehow - let's add them up and figure out the average
            sumOfNumbers = sumOfNumbers + number;

        }

        System.out.println("Thanks for using the program. The total of all the numbers was " + sumOfNumbers);
        System.out.println("And the average of all 5 numbers was " + sumOfNumbers/5);

    }
}
