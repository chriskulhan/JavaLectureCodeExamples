package org.example.week_6_files_and_exceptions;

import static input.InputUtils.intInput;

public class vid_10_b_do_while_user_input_validation_wrap_up {
//from Clara's code: (https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week6_files_exceptions/UserEntersData_Do.java_)

    public static void main(String[] args) {

        // Example: you want the user to enter a number between 1 and 10
        // do-while version

        int userInput;
        do {
            userInput = intInput("Please enter a number between 1 and 10");
        } while (userInput < 1 || userInput > 10);

        System.out.println("Thanks, the number you entered is " + userInput);
        //output:
        //Please enter a number between 1 and 10
        //11
        //Please enter a number between 1 and 10
        //0
        //Please enter a number between 1 and 10
        //-80
        //Please enter a number between 1 and 10
        //1
        //Thanks, the number you entered is 1
        //
        //Process finished with exit code 0
    }
}


