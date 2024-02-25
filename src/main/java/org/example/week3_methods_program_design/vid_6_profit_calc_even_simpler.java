package org.example.week3_methods_program_design;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class vid_6_profit_calc_even_simpler {
    public static void main(String[] args) {

        // Calculate operating cost and profit for a lemonade stand.
        // The lemonade stand sells lemonade, and cookies too.

        // To calculate profit, need to know how much was spent on lemonade supplies, what one cup of
        // lemonade sold for, and the number of cups sold.

        // Calculate profit

        double lemonadeProfit = calculateProfitForProductEvenSimpler("lemonade");
        System.out.println("Lemonade profit = $" + lemonadeProfit);

        // Do same calculation for cookies

        // To calculate profit, need to know how much was spent on cookie supplies, what one cookie
        // sold for, and the number of cookies sold.
        double cookieProfit = calculateProfitForProductEvenSimpler("cookie");
        System.out.println("Cookie profit = $" + cookieProfit);

        //calculate the same for coffee:
        double coffeeProfit = calculateProfitForProductEvenSimpler("coffee");
        System.out.println("Coffee profit = $" + coffeeProfit);

    }

    //another way to write the computation part of the method in shorter form:
    public static double calculateProfitForProductEvenSimpler(String productName) {
        //copied from above to attempt to simplify it:
        double suppliesCost = doubleInput("How much did you spend on " + productName + " supplies?");
        double salePrice = doubleInput("What did you sell one " + productName + " for?");
        int numberSold = intInput("How many " + productName + "s did you sell?");

        // Calculate profit
        double profit = (numberSold * salePrice) - suppliesCost;
        return profit;
        //input:output:
        // How much did you spend on lemonade supplies?
        //23
        //What did you sell one lemonade for?
        //4
        //How many lemonades did you sell?
        //45
        //Lemonade profit = $157.0
        //How much did you spend on cookie supplies?
        //12
        //What did you sell one cookie for?
        //3
        //How many cookies did you sell?
        //23
        //Cookie profit = $57.0
        // How much did you spend on coffee supplies?
        //9
        //What did you sell one coffee for?
        //2
        //How many coffees did you sell?
        //34
        //Coffee profit = $59.0

    }
}