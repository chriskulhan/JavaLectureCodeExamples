//Create a variable called secretNumber, and set the value to any number between 1 and 10
//Write a loop that asks the user to guess a number that the computer is thinking of.
// Print a success message if they guess correctly. Ask the user to try again if they get it wrong.
// The user can have as many guesses as they need
//
//Extra challenge – tell the user if they need to guess higher or lower

package org.example.week2_loops_and_arrays;

import static input.InputUtils.intInput;

public class vid_3_your_turn_while_loop {
    public static void main(String[] args) {

        int secretNumber = 8;
        int numberGuess = intInput("Guess my number");

        while (numberGuess != secretNumber) {
            System.out.println("Incorrect, try again");

            if (numberGuess < secretNumber){
                System.out.println("That's wrong, guess higher.");
            }

            if (numberGuess > secretNumber){
                System.out.println("That's wrong, guess lower.");
            }
            numberGuess = intInput("Guess my number");
        }
        System.out.println("You guessed correctly!");

        //output:
        // Guess my number
        //3
        //Incorrect, try again
        //Guess my number
        //5
        //Incorrect, try again
        //Guess my number
        //8
        //You guessed correctly!

        //added if/higher/lower statements:
        //output:
        // Guess my number
        //4
        //Incorrect, try again
        //That's wrong, guess higher.
        //Guess my number
        //5
        //Incorrect, try again
        //That's wrong, guess higher.
        //Guess my number
        //6
        //Incorrect, try again
        //That's wrong, guess higher.
        //Guess my number
        //9
        //Incorrect, try again
        //That's wrong, guess lower.
        //Guess my number
        //8
        //You guessed correctly!

    }
}