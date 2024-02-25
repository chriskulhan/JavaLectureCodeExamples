/*Scope of a variable:
-Where does the variable exist??
-It only exists within each part.
--anything you declare in main only exists there
--anything you declare in the other methods only exist there, but you can send them to main using parameters
 */

/*Your Turn: (slide 19)
Re-write the Python program at the start of class in Java
In the main method, ask the user how many credits they have earned
Ask the user how many credits their program needs
Write a method called howManyCreditsToGraduate that takes two parameters - credits earned and credits needed
howManyCreditsToGraduate should calculate the number of credits needed and return it
The main method should print a message with the number of credits needed to graduate

 */

package org.example.week3_methods_program_design;

import static input.InputUtils.intInput;

public class vid_5_scope_and_your_turn_credits_to_graduate {
    public static void main(String[] args) {

    int selfReportedCreditsEarned = intInput ("How many credits have you earned");
    int selfReportedCreditsNeeded = intInput("How many credits do you need to graduate from your program?");
    int creditsYetToTake = howManyCreditsToGraduate(selfReportedCreditsEarned, selfReportedCreditsNeeded);
        System.out.println("You still need " + creditsYetToTake + " credits to finish your program.");
    }
public static int howManyCreditsToGraduate (int studentCreditsEarned, int studentCreditsNeeded){
    int creditsNeededToGraduate = studentCreditsNeeded - studentCreditsEarned;
    return creditsNeededToGraduate;
    //input:output:
    //How many credits have you earned
    //45
    //How many credits do you need to graduate from your program?
    //60
    //You still need 15 credits to finish your program.

}
}
