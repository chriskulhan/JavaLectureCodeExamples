package org.example.week2_loops_and_arrays;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class vid_3_while_loop_SalesTaxWhileLoop_fromClara {
        public static void main(String[] args) {

            //want the loop to run at least once
            boolean moreCalculations = true;
            double price;
            //replicates adding on sales tax
            double salesTax = 1.07;

            //This loop repeats as long as the user wants to do more calculations

            while (moreCalculations) {

                price = doubleInput("Type in a price");
                double priceInclTax = price * salesTax;
                System.out.println("The price plus sales tax is " + priceInclTax);

                // To decide if the loop should repeat, ask the user if they want to continue.
                // Notice that the moreCalculations variable is used in the while loop condition.
                moreCalculations = yesNoInput("Do you want to continue?");
            }

            System.out.println("Thanks for using the program - goodbye!");
            //output:
            // Type in a price
            //2.34
            //The price plus sales tax is 2.5038
            //Do you want to continue? Y/N?
            //y
            //Type in a price
            //45
            //The price plus sales tax is 48.150000000000006
            //Do you want to continue? Y/N?
            //n
            //Thanks for using the program - goodbye!
        }

    }
