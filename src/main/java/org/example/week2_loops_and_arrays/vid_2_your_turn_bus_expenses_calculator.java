//Write a program that calculates the total amount a user spent on bus fares every week
//Write a loop that repeats 7 times, once for every day of the week
//In the loop, use doubleInput to ask how much the user spent on bus fares on a day
//And, in the loop, add that amount to a total
//At the end of the loop, print the total

package org.example.week2_loops_and_arrays;

import static input.InputUtils.doubleInput;

public class vid_2_your_turn_bus_expenses_calculator {
    //this is wrong. I focused on the wrong variable and didn't ask how much PER DAY
//    public static void main(String[] args) {
//        double costPerDay = doubleInput ("How much do you spend on bus fare every day?");
//        int timesPerWeek = intInput ("How many times do you ride the bus per week?");
//
//        for (timesPerWeek = 0; timesPerWeek < 7; timesPerWeek ++);
//        double totalBusFare = timesPerWeek * costPerDay;
//        System.out.println("You spent" + totalBusFare + "in bus fare this week.");

    public static void main(String[] args) {

        int numberOfDays = 7;
        double total = 0;

        for (int day = 1; day <= numberOfDays; day++){
            double amountSpent = doubleInput("What did you spend " +
                    "on bus fare on day " + day+ "?");
            //add amount spent on one day onto the total:
            total = total + amountSpent; //or total +=amountSpent
        }
        System.out.println("Total spent on bus fare for the week = $" + total);
        //string formatting: System.out.printf("Total for the week = $%.2f", total);
        //questions/input/output:
        // What did you spend on bus fare on day 1?
        //1
        //What did you spend on bus fare on day 2?
        //2.3
        //What did you spend on bus fare on day 3?
        //4
        //What did you spend on bus fare on day 4?
        //
        //Error - please enter a number.
        //What did you spend on bus fare on day 4?
        //3
        //What did you spend on bus fare on day 5?
        //2
        //What did you spend on bus fare on day 6?
        //4.44
        //What did you spend on bus fare on day 7?
        //5.9
        //Total spent on bus fare for the week = $22.64

    }
}
//paused video at 11:27 while I do question 2 in homework:
