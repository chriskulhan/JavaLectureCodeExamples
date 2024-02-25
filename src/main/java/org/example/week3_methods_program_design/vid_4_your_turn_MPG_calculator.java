/*Write a program to calculate the MPG for a car journey.
(MPG = Miles per gallon, calculate by dividing number of miles by number of gallons of gas used)
Write a method that has two parameters:
a number of miles driven, and
a number of gallons of gas used on a car journey
Your method should calculate and return the MPG for the car journey
Your main method should
Ask the user for the miles and gas used
Call your method
Use the returned data to display the MPG
 */

package org.example.week3_methods_program_design;

import static input.InputUtils.doubleInput;

public class vid_4_your_turn_MPG_calculator {
    public static void main(String[] args) {
        //the main method is used to interact with the user

        double milesDriven = doubleInput("How many miles have you driven on your trip?");
        double gallonsGasConsumed = doubleInput("How many gallons of gas has your car used so far?");
        double MPG =  milesPerGallon(milesDriven, gallonsGasConsumed);
        //milesDriven will correspond to miles below, gallonsGasConsumed will correspond to gallons below:
        System.out.println("Your car's MPG rating for your trip so far is " + MPG + " miles per gallon.");

    }

    public static double milesPerGallon(double miles, double gallons) {
        //this part does the "work" of the method using the user input data
        //miles per gallon can be found by dividing miles by gallons:
        double MPG =  miles / gallons;
        return MPG;
    }
    //input:output:
    //How many miles have you driven on your trip?
    //34
    //How many gallons of gas has your car used so far?
    //2
    //Your car's MPG rating for your trip so far is 17.0 miles per gallon.
}
