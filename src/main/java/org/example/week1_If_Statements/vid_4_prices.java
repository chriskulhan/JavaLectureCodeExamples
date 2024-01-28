/*
notes from video 4

-Total sale price for quantity of a product:
**type in name of product
**price for one item
**quantity of product to sell

--will calculate the total price and display it.

 */

package org.example.week1_If_Statements;

import static input.InputUtils.*;

public class vid_4_prices {
    public static void main(String[] args) {
        //use int and double inputs

        //Ask for the product name:
        String productName = stringInput("What is the name of the product?");
        //new file, so need to import InputUtils again (once done, will be usable for all remaining)

        //ask for positive double variable for price:
        double price = positiveDoubleInput("What does " + productName + " cost?");

        //ask for positive int with quantity:
        int quantity = positiveIntInput("How many " + productName + " to sell?");

        //figure out the total price:
        double totalPrice = price * quantity;

        //print out all outputs:
        System.out.println(quantity + " of " + productName + " at $" +
                price + " each costs $" + totalPrice);
        //output: 8 of flower at $0.3 each costs $2.4

        //rewrite output as a format string:
        //.2f will give 2 decimal places:

        System.out.printf("%d of %s at $%.2f each costs $%.2f", quantity, productName, price, totalPrice);
        //output: 8 of flower at $0.30 each costs $2.40

        //cannot use a dollar sign before the costs input
        //cannot use a decimal with quantity
        //cannot currently negative cost because added positive to price and quantity.
    }
}
