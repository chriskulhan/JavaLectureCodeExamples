package org.example.week3_methods_program_design;

import static input.InputUtils.positiveIntInput;

public class vid_11_scope_example_broken_into_methods_part_a { //start of class definition
    public static void main(String[] args) {

        //Write a program that asks user for their credit load this semester
        //Print a message that tells them if they are:
        //*full time (12 or more credits)
        //*part-time (less than 12 credits or equal to or greater than 6 credits
        //*less than part-time: (less than 6 credits)

//1a. getting input from the user:  (User interface part a)

        int numberOfCredits = positiveIntInput("Enter the number of credits you are taking " +
                "this semester");

        String status;

//2. making a decision: (deciding status)

        //cut this and put it into a new method AFTER the end of the main method:
//        if (numberOfCredits >= 12) {
//            status = "full-time";
//        } else if (numberOfCredits >= 6) {
//            status = "part-time";
//        } else {
//            status = "Less than part-time";
//        }

//1b. stating the data to the user:  (User interface part b)
        System.out.println("Your status is " + status);

    } //end of main method code

    //todo create new method to figure out student status
//    public static ??return type?? calculateStudentStatus (???) {

    //think about what data does the method receive? (input):
        //input is defined as parameters, arguments

    //think about what data the method will generate (output)
        //need to define the output type in the method signature
            // just above^^^ that place is '(???)' and called the 'argument(s)'
            //use a return statement to output the actual data

    public static ??return type?? calculateStudentStatus (int credits) {

        //we don't want to define the credits value inside this method, we want this method to receive
        //the number of credits and then outputs a statement
        //this is done by labeling "int credits" in the argument in the above method ^^^
        //when this method is called, whatever calls this method will be required to provide some value
            //that will be interpreted as the number of credits

        String status;

        //renamed from 'numberOfCredits' to 'credits':
        //there is no assignment statement below:
        if (credits >= 12) {
            status = "full-time";
        } else if (credits >= 6) {
            status = "part-time";
        } else {
            status = "Less than part-time";
        }
    }

} //end of class definition -no code after this
