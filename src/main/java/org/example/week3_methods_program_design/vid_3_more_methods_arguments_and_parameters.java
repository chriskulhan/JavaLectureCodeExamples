
/* ***Designing with methods:*** (slide 11)
Use methods to…
-Eliminate repetitive code (example: .toUpperCase())
-Organize program into sub-tasks (helps to organize info and when debugging)
-A method should have one specific task it does, at a certain level of detail
-You should be able to describe the purpose of your method in 1 or 2 sentences
-A method may call other methods

***Coding with methods*** (slide 12)
-Is easier to test
-Your lab code is in methods, so a test can check the method(s) you work on
-This principle applies to other projects too
-Is easier to understand
-Several small methods are easier to understand individually; than one giant block of code
-Is easier to maintain and debug
-Can focus on one, or just a few, methods - instead of the entire program

 */

//this program will convert miles to km
//Clara's code from https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/MilesToKm.java
//named in Clara's code: MilesToKM

package org.example.week3_methods_program_design;

import static input.InputUtils.doubleInput;

public class vid_3_more_methods_arguments_and_parameters {
    //This is the main method - the first code to run
    public static void main(String[] args) {

        double miles = doubleInput("Please enter number of miles:");
        double km = milesToKM(miles);
        //when you first type a method, it doesn't exist, so the type will be red, you can have
        //Intellij create the method for you, buy right-clicking and selecting that option (or shift-alt-enter <on a mac>)
        //then push "tab" and Intellij will suggest the type of parameter including the type
        System.out.println(miles + " miles is equal to " + km + " kilometers.");

    }    // This is the end of the main method.

    // This method takes one argument, a number of miles
    // It calculates the equivalent in kilometers, and returns that value
    public static double milesToKM(double miles) {
        //because the public static "double" part of this method doesn't say "void" it needs to return something

        double km = miles * 1.6;   // One mile is 1.6 kilometers
        //km warning
        return km;
        //input:output:
        //Please enter number of miles:
        //12
        //12.0 miles is equal to 19.200000000000003 kilometers.

        //alternate (replace double km = miles * 1.6;
        //        return km;)


        //return miles * 1.6;
        //will still work

        //make sure the types (int, double, etc.) match up

    }    // The end of the milesToKM method

}
