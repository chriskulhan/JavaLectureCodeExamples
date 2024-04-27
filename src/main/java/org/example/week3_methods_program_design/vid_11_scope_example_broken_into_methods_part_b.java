//figuring out how to call the method from the Main method when the name doesn't match
    // spoiler: only the DATA moves between the two in the 'parentheses portals' (my shorthand)
    //  that's why the words in the parentheses don't have to match. They are only ports to "throw"
    // data from and "catch" data, and the names don't have to perfectly match up.


package org.example.week3_methods_program_design;

import static input.InputUtils.positiveIntInput;

public class vid_11_scope_example_broken_into_methods_part_b { //start of class definition
        public static void main(String[] args) {

        //Write a program that asks user for their credit load this semester
        //Print a message that tells them if they are:
        //*full time (12 or more credits)
        //*part-time (less than 12 credits or equal to or greater than 6 credits
        //*less than part-time: (less than 6 credits)

//1a. getting input from the user:  (User interface part 1)

            //ask the user for data:
        int numberOfCredits = positiveIntInput("Enter the number of credits you are taking " +
                "this semester");

        String status;

//2. making a decision: (deciding/calculate status)

        //cut this and put it into a new method AFTER the end of the Main method:
//        if (numberOfCredits >= 12) {
//            status = "full-time";
//        } else if (numberOfCredits >= 6) {
//            status = "part-time";
//        } else {
//            status = "Less than part-time";
//        }

//            calculateStudentStatus(12);
            //can just put a number in the space just above ^^^

            //moving the info that the user input here:
            calculateStudentStatus(numberOfCredits);
            //change the #12 to 'numberOfCredits' from above so the user input is moved into this method
            //  + called 'calculateStudentStatus'
            // the only thing that moves from the calculateStudentStatus 'method call' just above ^^^ to the
            // calculateStudentStatus 'method' (below) is the *VALUE* that the user inputs. That's why the word
            // don't have to match !!! (whew, now i get it)

//1b. stating the data to the user:  (User interface part 2)
//        System.out.println("Your status is " + status);

    } //end of Main method code

        //todo create new method to figure out student status
//    public static ??return type?? calculateStudentStatus (???) {

        //think about what data does the method receive? (input):
        //input is defined as parameters, arguments

        //think about what data the method will generate (output)
        //need to define the output type in the method signature
        // just above^^^ that place is '(???)' and called the 'argument(s)'
        //use a return statement to output the actual data

        public static void /*void - come back to this*/calculateStudentStatus (int credits) {

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

        //add a print statement:
            System.out.println(status);
    }

    } //end of class definition -no code after this

//input/output:
//Enter the number of credits you are taking this semester
//13
//full-time

//Enter the number of credits you are taking this semester
//5
//Less than part-time

//Enter the number of credits you are taking this semester
//6
//part-time


