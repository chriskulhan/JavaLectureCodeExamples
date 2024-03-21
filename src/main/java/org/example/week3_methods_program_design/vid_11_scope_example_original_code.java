/*

 * Divide and conquer: break a complex problem into smaller parts
    - programming is problem-solving
    - often the problems we need to solve are complex:
        - example: "Build a new social media website" or "build a new class registrations system"
    - breaking problems into smaller parts is essential

*Re-use code
    - can call a method more than once, as needed

*Scope of variables (there is another video that talks about this)
    -limits the parts of a program where you can access data
        **this is good because it prevents other parts of your program from
           accidentally modifying your data.
        **allows us to re-use variable names more easily

 */

package org.example.week3_methods_program_design;

import static input.InputUtils.positiveIntInput;

public class vid_11_scope_example_original_code {
    public static void main(String[] args) {

        //Write a program that asks user for their credit load this semester
        //Print a message that tells them if they are:
        //*full time (12 or more credits)
        //*part-time (less than 12 credits or equal to or greater than 6 credits
        //*less than part-time: (less than 6 credits)

        int numberOfCredits = positiveIntInput("Enter the number of credits you are taking " +
                "this semester");

        String status;

        if (numberOfCredits >= 12) {
            status = "full-time";
        } else if (numberOfCredits >= 6) {
            status = "part-time";
        } else {
            status = "Less than part-time";
        }

        System.out.println("Your status is " + status);

        //input/output:
        // 6
        //Your status is part-time
        // 13
        //Your status is full-time
        // 3
        //Your status is Less than part-time


    }
}
