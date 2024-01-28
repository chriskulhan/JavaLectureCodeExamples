package org.example.week1_If_Statements;

import static input.InputUtils.intInput;

public class vid_4_guess_number {
    public static void main(String[] args) {
        int secretNumber = 6;

        int guess = intInput("Guess the number I am thinking of:");
        //checking to see if guess ^^ is equal to variable secret number

        if(guess == secretNumber) {
            //conditional code is in curly braces
            System.out.println("You guessed correctly!!!");
            //input: 6
            //output: You guessed correctly!!!

            //input: 4
            //output: <nothing> because not equal to 6

            //add else later**
        } else {
            System.out.println("Sorry, I was thinking of " + secretNumber);
            //input: 6
            //output:You guessed correctly!!!
            //The end!

            //input: 5
            //output: Sorry, I was thinking of 6
            //The end!
        }
        //add another line of code. This will run no matter what the condition is.
        System.out.println("The end!");
        //input: 3
        //output: The end!

        //input: 6
        //output: You guessed correctly!!!
        //The end!
    }
}
