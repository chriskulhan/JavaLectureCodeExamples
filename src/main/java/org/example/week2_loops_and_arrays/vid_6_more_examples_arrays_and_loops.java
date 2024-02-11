//Remember the bus expense program?
//Let's create an array with the names of the days
//And use it in the loop to ask questions like
// "On Monday, what did you spend on bus fares?"

package org.example.week2_loops_and_arrays;

import static input.InputUtils.doubleInput;

public class vid_6_more_examples_arrays_and_loops {
    public static void main(String[] args) {

        //an array with the names of each day of the week, used to create questions for the user
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0; // will add each day's expense to this variable to calculate the week's total

        for (int day = 0; day < dayNames.length; day++){ //loop 7 times, once for each day of the week
            String dayName = dayNames[day];
            double dayExpense = doubleInput("On " + dayName + ", what did you spend on bus fares?");

            total = total + dayExpense; //add the day's expense to the total
        }
        System.out.println("Total spent on bus fare for the week = $" + total);
        //alternative so the dollar amount has 2 decimals: System.out.printf("Total for the week = $%.2f", total);

        //output:
        // On Monday, what did you spend on bus fares?
        //2.50
        //On Tuesday, what did you spend on bus fares?
        //5
        //On Wednesday, what did you spend on bus fares?
        //3
        //On Thursday, what did you spend on bus fares?
        //2
        //On Friday, what did you spend on bus fares?
        //9.00
        //On Saturday, what did you spend on bus fares?
        //3.45
        //On Sunday, what did you spend on bus fares?
        //0
        //Total spent on bus fare for the week = $24.95
    }
}
