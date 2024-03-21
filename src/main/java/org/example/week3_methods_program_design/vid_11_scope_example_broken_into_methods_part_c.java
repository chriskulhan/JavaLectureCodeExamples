//breaking apart the *calculation* from the *deciding* what happens after knowing the numbers (into two methods):
//1. user will input the number of credits
//2. the output will be a status string

package org.example.week3_methods_program_design;

import static input.InputUtils.positiveIntInput;

public class vid_11_scope_example_broken_into_methods_part_c {
    //start of class definition
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
        //this variable 'numberOfCredits' only exists in the method block

        String status;

//2. making a decision: (deciding/calculate status)

        //cut this and put it into a new method AFTER the end of the main method:
//        if (numberOfCredits >= 12) {
//            status = "full-time";
//        } else if (numberOfCredits >= 6) {
//            status = "part-time";
//        } else {
//            status = "Less than part-time";
//        }

//            calculateStudentStatus(12);
        //can just put a number in the space just above ^^^

       //write an assignments statement: (once the return type in the calculateStudentStatus (below vvv) is changed to a string)
        //this will create an error that is resolved with place to save the data that's returned:

        String statusMessage = calculateStudentStatus(numberOfCredits);
        //change the #12 to 'numberOfCredits' from above so the user input is moved into this method
        //  + called 'calculateStudentStatus'
        // the only thing that moves from the calculateStudentStatus 'method call' just above ^^^ to the
        // calculateStudentStatus 'method' (below) is the *VALUE* that the user inputs. That's why the word
        // don't have to match !!! (whew, now i get it)

//1b. stating the data to the user:  (User interface part 2)
        System.out.println("Your status is " + statusMessage);

    } //end of main method code

    //todo create new method to figure out student status
//    public static ??return type?? calculateStudentStatus (???) {

    //think about what data does the method receive? (input):
    //input is defined as parameters, arguments

    //think about what data the method will generate (output)
    //need to define the output type in the method signature
    // just above^^^ that place is '(???)' and called the 'argument(s)'
    //use a return statement to output the actual data

    public static String calculateStudentStatus (int credits) {
        //changed the return type to 'String' (this is the output type)
        //inside the parentheses is where the user input data will be ported through

        //we don't want to define the credits value inside this method, we want this method to receive
        //the number of credits and then outputs a statement
        //this is done by labeling "int credits" in the argument in the above method ^^^
        //when this method is called, whatever calls this method will be required to provide some value
        //that will be interpreted as the number of credits

        String status;
        //this variable only exists here ^^^, because the scope is only in the method block (defined by curly braces)

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
//        System.out.println(status);
        return status; //return the String data to the place outside this method that has "calculateStudentStatus(xxxx)" (line 44)
        // then the *VALUE* that is returned in status (just above ^^^) will become the right hand side of the method call:
        //the method call on line 44 looks like this:
        // String statusMessage = calculateStudentStatus(numberOfCredits);
        //you can think of it like: String statusMessage = ***Whatever data was returned inside status*** and then the
        //method continues linearly again, so it will print (line 52) with the statusMessage = *the return value in status* or
        //one of the 3 options in the calculateStudentStatus method (full-time, part-time, or less than part-time)
    }

    //Make a new method to break apart the user input from the data output: How to do that:
        //1. define the type of data that is returned
        //2. return data of that type from the method



} //end of class definition -no code after this


//input/output:
//Enter the number of credits you are taking this semester
//7
//Your status is part-time

//Enter the number of credits you are taking this semester
//4
//Your status is Less than part-time

//Enter the number of credits you are taking this semester
//13
//Your status is full-time



