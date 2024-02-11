//Modify the guess-the-number game
//Instead of a number stored in the program, your program should generate a random number for the user to guess
//How to create a random integer between 0 and 9:
//took code from vid_3_your_turn_while_loop

package org.example.week2_loops_and_arrays;

import java.util.Random;
import static input.InputUtils.intInput;

public class vid_3_your_turn_add_random_number_generator {
    public static void main(String[] args) {

                //int secretNumber = 8;

                Random random = new Random();

                //if you want a random number between 0 and 9:
                int secretNumber = random.nextInt(10);

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

            }
        }
//output:Guess my number
//4
//Incorrect, try again
//That's wrong, guess lower.
//Guess my number
//3
//Incorrect, try again
//That's wrong, guess lower.
//Guess my number
//2
//You guessed correctly!

//try again: output:Guess my number
//9
//Incorrect, try again
//That's wrong, guess lower.
//Guess my number
//1
//Incorrect, try again
//That's wrong, guess higher.
//Guess my number
//5
//Incorrect, try again
//That's wrong, guess higher.
//Guess my number
//7
//Incorrect, try again
//That's wrong, guess higher.
//Guess my number
//7
//Incorrect, try again
//That's wrong, guess higher.
//Guess my number
//8
//You guessed correctly!
