package org.example.week2_loops_and_arrays;

import static input.InputUtils.doubleInput;

public class vid_7_constants_vs_variables {
        //from: vid_2_your_turn_bus_expenses_calculator
        public static void main(String[] args){

            //int numberOfDays = 7;
            //number of days in a week won't change, so put final in front of it:
            //now it's a constant
            final int NUMBER_OF_DAYS = 7;

            double total = 0;

            for (int day = 1; day <= NUMBER_OF_DAYS; day++) {
                double amountSpent = doubleInput("What did you spend " +
                        "on bus fare on day " + day + "?");
                //add amount spent on one day onto the total:
                total = total + amountSpent; //or total +=amountSpent
            }
            //System.out.println("Total spent on bus fare for the week = $" + total);
            System.out.printf("Total for the week = $%.2f", total);
        }
    }

    //** Constants in Java
//
//Use the keyword final to indicate a constant value
//
//  final int CENTS_IN_DOLLAR = 100;
//
//  final double PI = 3.14159;
//
//  final String APPLICATION_NAME = "Best Final Project Ever";
//
//  By convention, names of constants are uppercase
//  Separate words in constant name with  _ (underscore)
//  It's not mandatory, but it is good style
//
//Actually if you want the value of PI you would probably use the built-in constant PI from the Math library class
//
//final double PI = Math.PI;
//
//Math library also has other useful math functions in e.g. trigonometry, powers, logs, degrees/radians
//
//http://docs.oracle.com/javase/8/docs/api/java/lang/Math.html