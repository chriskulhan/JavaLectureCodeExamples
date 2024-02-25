/*Reducing repetition with methods (slide 26)
-It's common to do the same task (or a very similar task) more than once
-To save re-writing code over and over, we can put this code in a method
-If it's a task that's the same process, but uses different values of variables, then these variables can be arguments to the method

 */
//example code below from Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/Lemonade.java
//can methods be used to improve the program? Hint: what if the lemonade stand sells another product?


//initial Lemonade program: (works, but complex)
//***What if the lemonade stand sells things besides lemonade? How to make this scalable?
//package org.example.week3_methods_program_design;
//
//import static input.InputUtils.doubleInput;
//import static input.InputUtils.intInput;
//
//public class vid_6_methods_reducing_repetition_with_methods {
//    public static void main(String[] args) {
//
//        // Calculate operating cost and profit for a lemonade stand.
//        // The lemonade stand sells lemonade, and cookies too.
//
//        // To calculate profit, need to know how much was spent on lemonade supplies, what one cup of
//        // lemonade sold for, and the number of cups sold.
//        System.out.println("How much did you spend on lemonade supplies?");
//        double lemonadeSuppliesCost = doubleInput();
//        System.out.println("What did you sell one cup of lemonade for?");
//        double lemonadeSalePrice = doubleInput();
//        System.out.println("How many cups of lemonade did you sell");
//        int lemonadeCupsSold = intInput();
//
//        // Calculate profit
//
//        double lemonadeProfit = ( lemonadeCupsSold * lemonadeSalePrice ) - lemonadeSuppliesCost;
//
//        System.out.println("Lemonade profit = $" + lemonadeProfit);
//
//        // Do same calculation for cookies
//
//        // To calculate profit, need to know how much was spent on cookie supplies, what one cookie
//        // sold for, and the number of cookies sold.
//        System.out.println("How much did you spend on cookie supplies?");
//        double cookieSuppliesCost = doubleInput();
//        System.out.println("What did you sell one cookie for?");
//        double cookieSalePrice = doubleInput();
//        System.out.println("How many cookies did you sell?");
//        int cookiesSold = intInput();
//
//        // Calculate profit
//        double cookieProfit = ( cookiesSold * cookieSalePrice ) - cookieSuppliesCost;
//
//        System.out.println("Cookie profit = $" + cookieProfit);
//
//    }
//}

//rework the above method to use another method to return computations from any item, not specific items:

package org.example.week3_methods_program_design;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class vid_6_methods_reducing_repetition_with_methods {
    public static void main(String[] args) {

        // Calculate operating cost and profit for a lemonade stand.
        // The lemonade stand sells lemonade, and cookies too.

        // To calculate profit, need to know how much was spent on lemonade supplies, what one cup of
        // lemonade sold for, and the number of cups sold.

        // Calculate profit

        double lemonadeProfit = calculateProfitForProduct("lemonade");
        System.out.println("Lemonade profit = $" + lemonadeProfit);

        // Do same calculation for cookies

        // To calculate profit, need to know how much was spent on cookie supplies, what one cookie
        // sold for, and the number of cookies sold.
        double cookieProfit = calculateProfitForProduct("cookie");
        System.out.println("Cookie profit = $" + cookieProfit);

    }
    //what input does a new method (that could utilize any product kind) need?
    public static double calculateProfitForProduct (String productName) {
        //copied from above to attempt to simplify it:
        System.out.println("How much did you spend on " + productName + " supplies?");
        double suppliesCost = doubleInput();
        System.out.println("What did you sell one " + productName + " for?");
        double salePrice = doubleInput();
        System.out.println("How many " + productName + "s did you sell?");
        int numberSold = intInput();

        // Calculate profit
        double profit = ( numberSold * salePrice ) - suppliesCost;
        return profit;
        //input:output:
        //How much did you spend on lemonade supplies?
        //23
        //What did you sell one lemonade for?
        //3
        //How many lemonades did you sell?
        //45
        //Lemonade profit = $112.0
        //How much did you spend on cookie supplies?
        //23
        //What did you sell one cookie for?
        //2
        //How many cookies did you sell?
        //34
        //Cookie profit = $45.0

    }
}
