package org.example.week1_If_Statements;

import static input.InputUtils.intInput;

public class vid_4_apollo_quiz {
    public static void main(String[] args) {
        System.out.println("Quiz Time!");
        System.out.println("What year did the Apollo 11 spaceship land on the moon?");

        //hint: it was 1969

        int answer = intInput();

        //the != operator tests if the two values are NOT equal
        //this condition test if answer is NOT equal to 1969
        if ( answer != 1969 ) {
            System.out.println("Wrong Answer - it was 1969.");
            //input: 1969
            //output: <nothing>

            //input: 1971
            //output: Wrong Answer - it was 1969.
        }
    }
}
