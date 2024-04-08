package org.example.week_6_files_and_exceptions;

import org.w3c.dom.ls.LSOutput;

import static input.InputUtils.intInput;

public class vid_10_a_no_do_user_input_while_loop {
    public static void main(String[] args) {
        int userInput = 0;
        while (userInput < 1 || userInput > 10) {
            userInput = intInput("Please enter a number between 1 and 10");
        }
        System.out.println("Thanks, the number you entered is " + userInput);
        //output:
        //Please enter a number between 1 and 10
        //0
        //Please enter a number between 1 and 10
        //11
        //Please enter a number between 1 and 10
        //-1
        //Please enter a number between 1 and 10
        //10
        //Thanks, the number you entered is 10
    }
}
