//if a while condition is complex, it might be easier to write a while(true) loop thn use if
//statements in the loop to test the conditions and then break when you need to get out of the loop.

package org.example.week2_loops_and_arrays;

import static input.InputUtils.stringInput;

//how to get random numbers: (import random number library)
import java.util.Random;

public class vid_3_break_WhileLoopBreakExampleRandomNumber_fromClaraCode {
    public static void main(String[] args) {

        //will require the Random utility to be imported above:
        Random randomNumberGenerator = new Random();

        while (true) {

            System.out.println("Would you like a random number?");
            System.out.println("Enter any key for a random number, or Q to quit");

            String userInput = stringInput();

            if (userInput.equalsIgnoreCase("Q")) {
                break;   //immediately stops the loop, jump to next statement after the loop
            }

            // If we get to this line, the loop didn't break
            // Generate and display a random number

            int randomNumber = randomNumberGenerator.nextInt();
            // .nextInt() with no argument generate a random number from all the possible integer values

            System.out.println("Your random number is " + randomNumber);

        }

        System.out.println("Thanks for using the program - bye!");

    }

}


