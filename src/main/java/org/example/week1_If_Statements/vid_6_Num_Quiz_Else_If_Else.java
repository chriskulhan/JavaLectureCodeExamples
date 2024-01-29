package org.example.week1_If_Statements;

import static input.InputUtils.intInput;

public class vid_6_Num_Quiz_Else_If_Else {
    public static void main(String[] args) {

        int secretNumber = 6;

        int guess = intInput("Guess the number I'm thinking of:");

        if(guess == secretNumber) {
            System.out.println("You guessed correctly!");
        } else if ( guess - secretNumber == 1) {
            System.out.println("Your guess is 1 too high!");
        } else if ( secretNumber - guess == 1 ) {
            System.out.println("Your guess is 1 too low!");
        } else {
            System.out.println("No, I was thinking of " + secretNumber);
        }
    }
}
