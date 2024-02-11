//A heating utility company allows customers to spread the cost of bills through the year by
// charging them an average payment every month.
//The utility company averages all of the last year's bills, and uses that to estimate
// the average payment for next year
//So, if last year's bills were as shown in the table opposite, the total is $1450;
// so the average is $120.83

//Ask the user for each month's bill for last year
//Store this data in an array
//Store January's bill in element 0, February's in element 1…
//Then, add up all of the bills and figure out the average - next year's average payment
//Also, display the user's data in a table of months and bill amount, so they can check
// it for accuracy
//Tip: use another array with the names of the months to help ask for data/display data.
// Can copy/paste this:
//
//String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };

package org.example.week2_loops_and_arrays;

import static input.InputUtils.doubleInput;

public class vid_6_find_average_heating_bill {
    public static void main(String[] args) {
        String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };

        double total = 0;

        for (int month = 0; month < months.length; month++){
            String monthName = months[month];
            double monthExpense = doubleInput("For " + monthName  + ", what did you spend on heating?");

            total = total + monthExpense; //add the day's expense to the total

        }
        double averagePerMonth = (total/months.length);
        System.out.println("Total spent on heating for the year = $" + total);
        System.out.printf("The average you should pay for heating per month is $%.2f", averagePerMonth);
        //output:
        // For January, what did you spend on heating?
        //2
        //For February, what did you spend on heating?
        //3
        //For March, what did you spend on heating?
        //2
        //For April, what did you spend on heating?
        //3
        //For May, what did you spend on heating?
        //2
        //For June, what did you spend on heating?
        //3
        //For July, what did you spend on heating?
        //2
        //For August, what did you spend on heating?
        //3
        //For September, what did you spend on heating?
        //2
        //For October, what did you spend on heating?
        //2
        //For November, what did you spend on heating?
        //3
        //For December, what did you spend on heating?
        //2
        //Total spent on heating for the year = $29.0
        //The average you should pay for heating per month is $2.42
    }

}
