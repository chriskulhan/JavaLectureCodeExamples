/* notes from video 3
-stringInput-
String name = stringInput("What is your name?");

-intInput -
**asks question and also does some validation. Will ask follow-up questions without crashing:
int candyBars = intInput("How many candy bars?");

-positiveIntInput -
**checks if input is positive:
int people = positiveIntInput("How many people?");

-doubleInput -
**returns positive double values
double price = doubleInput("What is the price of the item?");

-positiveDoubleInput-
**returns positive double values
double length = positiveDoubleInput("How long is the string?");

-yesNoInput-
** y or n, or yes or no (including upper and lowercase):
boolean ok = yesNoInput("OK to continue?");

-Question is optional, so could just write:
String data = stringInput()
instead of:
System.out.println("What is your name?");

 */

//question: Ask for the number of classes you have this semester
//(tip: Option+Enter (mac) will automatically import intInput method)

package org.example.week1_If_Statements;

import static input.InputUtils.*;

public class InputUtilsNotesIfStatements {
    public static void main(String[] args) {

        String userName = stringInput("Please enter your name: ");
        //input: chris
        System.out.println("Welcome, " + userName);
        //output: chris

        //to get integer or double inputs:
        int numberOfClasses = intInput("How many classes are you taking this semester?");
        //input: 5
        System.out.println("You are taking " + numberOfClasses + " class(es) this semester.");
        //output: You are taking 5 classes.

        //to get a positive int input:
        int timesBikeToCampus = positiveIntInput("How many times per week do you plan to bike to campus?");
        System.out.println("You plan to bike to campus " + timesBikeToCampus + " times per week.");
        //input: -1
        //output: Error - please enter a positive integer number.
        //How many times per week do you plan to bike to campus?

        //input: 0.4
        //output: Error - please enter a positive integer number.
        //How many times per week do you plan to bike to campus?

        //input: 8
        //output:You plan to bike to campus 8 times per week.

//    How to have the program select a singular output for one (class) or plural for more than one (classes):
//
//    **Add an if statement**:
//    Check if <variable> == 1
        int hoursSpentOnCampus = positiveIntInput("How many hours do you plan to be on campus per week?");

        //Here is where the if statement is used:
        String units = "hours";

        if (hoursSpentOnCampus == 1) {
            units = "hour";
        }
            System.out.println("You plan to be on campus " + hoursSpentOnCampus + " " + units + " per week.");
            //input: 1
            //output: You plan to be on campus 1 hour per week.

            //input: 2
            //output: You plan to be on campus 2 hours per week.

            //input: 0
            //output: You plan to be on campus 0 hours per week.

            // string formatting:
        System.out.printf("You plan to be on campus %d %s per week.", hoursSpentOnCampus, units);
            //input (to: How many hours to do you plan to be on campus per week?)
            // 3
            //output: You plan to be on campus 3 hours per week.
            //same output as println(), and printf()
        }
    }