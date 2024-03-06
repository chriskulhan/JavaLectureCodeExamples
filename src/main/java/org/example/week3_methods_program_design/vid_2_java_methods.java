/*Java methods;

Very much like functions in Python
You may have written code like this
Remember function definitions, arguments and parameters, return values
Code in a function doesn't run until it is called

 */

package org.example.week3_methods_program_design;

import static input.InputUtils.stringInput;

public class vid_2_java_methods {
    //Clara's code she called it HelloMethods in the examples (2545) on github:
    // main method: (runs first)

        //This is the main method - the first code to run
        public static void main(String[] args) {

            String name = stringInput("Please enter your name");
            String greeting = makeGreeting(name);
            // name is the argument ^^there, it's what will become "(String n)" below in the
            //other place where makeGreeting is.
            System.out.println(greeting);

        }    // This is the end of the main method.


        // A new method that we've created.
        // This method takes one argument, a String.
        // It will create a new String made from the word "Hello"
        // plus the String argument, plus an exclamation point !
        // It will then return that new greeting String.
        public static String makeGreeting(String n) {
            // first String is output type, (String n) is the input
            //when makeGreeting has a () down here it's called a parameter ^^^
            String greeting = "Hello " + n + " is this working?";
            //this type (String) must match the type above
            return greeting;
            //input/output:
            //Please enter your name
            //chris
            //Hello chris is this working?

        }    // The end of the makeGreeting method

    }   // End of the vid_2_java_methods class

//input/output:
//Please enter your name
//chris
//Hello chris!




