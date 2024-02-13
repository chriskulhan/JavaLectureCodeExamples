package org.example.week2_loops_and_arrays;

import static input.InputUtils.stringInput;

public class vid_3_while_loop_password_claras_code {
    public static void main(String[] args) {

            String secretPassword = "kittens";

            System.out.println();
            //userPassword is created here:
            String userPassword = stringInput("Enter the password");

            //make new variable:
            int maxGuesses = 5;

            //Always use the .equals() method to check if two Strings have the exact same characters

            //Before we let the user in, we need to check that the password is correct
            //This loop will repeat while the password is NOT "kittens", our secretPassword

        //read as NOT userPassword equals secretPassword, or while the userPassword is different than the secret password
            while ( ! userPassword.equals(secretPassword) && maxGuesses > 1) {
                // The user got the password wrong. Print an error message
                System.out.println("Password incorrect, access denied!");
                // And ask user to try again.
                System.out.println("Try again");

                // UPDATED password:Replace userPassword with the user's next attempt.
                userPassword = stringInput("Enter the password");
                // If the user gets it wrong again, the loop will repeat.

                maxGuesses = maxGuesses - 1; //alternate: maxGuesses-- ;
            }
            if (maxGuesses > 1) {
                // if the loop condition is false, then the user got the password right.
                // Print 'access granted' method
                System.out.println("Correct password - access granted");
            }
            else {
                System.out.println("You have gotten the password wrong 5 times. You are locked out.");
                //the program will end with this if you get the password wrong:
                System.exit(0);
            }
            //correct try: output:
        // Enter the password
        //kittens
        //Correct password - access granted

            //incorrect try: output:
        // Enter the password
        //
        //Password incorrect, access denied!
        //Try again
        //Enter the password
        //
        //Password incorrect, access denied!
        //Try again
        //Enter the password
        //
        //Password incorrect, access denied!
        //Try again
        //Enter the password
        //
        //Password incorrect, access denied!
        //Try again
        //Enter the password
        //
        //You have gotten the password wrong 5 times. You are locked out.
        }
        //put your top secret program that will only run if the password is correct:
        //Todo top secret program here:
    }
