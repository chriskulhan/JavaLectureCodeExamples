package org.example.week2_loops_and_arrays;

import java.text.NumberFormat;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class vid_3_while_loop_SalesTax_tidier_ClarasCode {
    public static void main(String[] args) {

            boolean moreCalculations = true;
            double price;
            double salesTax = 1.07;

            while (moreCalculations) {

                price = doubleInput("Type in a price");
                double priceInclTax = price * salesTax;

                //Create a NumberFormat object - this takes numbers, and formats them to a particular format
                //in this case, as a currency value. If your computer's location is set to the US, then
                //it will display with a dollar sign, a period separating the dollars and cents, and 2 decimal places.
                //If you happen to be in Europe, you'll see a Euro sign, and a comma separating the Euros and cents.

                NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
                //needed to import NumberFormat class
                String formattedPrice = currencyFormatter.format(priceInclTax);

                System.out.println("The price plus sales tax is " + formattedPrice);

                moreCalculations = yesNoInput("Do you want to continue? ");
            }

            System.out.println("Thanks for using the program - goodbye!");
            //output:
        // Type in a price
        //2.34
        //The price plus sales tax is $2.50
        //Do you want to continue?  Y/N?
        //y
        //Type in a price
        //8.90
        //The price plus sales tax is $9.52
        //Do you want to continue?  Y/N?
        //n
        //Thanks for using the program - goodbye!
        }
    }
