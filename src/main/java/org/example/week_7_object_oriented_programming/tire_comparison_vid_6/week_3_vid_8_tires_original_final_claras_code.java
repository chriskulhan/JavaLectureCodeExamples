//https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/tires/TiresFinal.java
package org.example.week_7_object_oriented_programming.tire_comparison_vid_6;

import static input.InputUtils.*;

public class week_3_vid_8_tires_original_final_claras_code {
    public static void main(String[] args) {

        System.out.println("Welcome to the Tire Price Comparison Calculator");

        int numberOfTiresToCompare = positiveIntInput("Please enter the number of tires to compare");
        String[] tireReports = new String[numberOfTiresToCompare];

        for (int t = 0; t < numberOfTiresToCompare; t++) {
            String report = getTireInfo();
            tireReports[t] = report;
        }

        printReportTable(tireReports);

    }

    private static String getTireInfo() {
        String name = stringInput("What is the name of the Tire?");
        double price = positiveDoubleInput("Enter the price of " + name);
        int mileWarranty = positiveIntInput("Enter the number of miles warranty");

        double dollarsPerMile = price / mileWarranty;
        double dollarsPer1000Miles = dollarsPerMile * 1000;

        return String.format("%s costs $%.2f, has a %d mile warranty, costs $%.3f per 1000 miles",
                name, price, mileWarranty, dollarsPer1000Miles);
    }

    private static void printReportTable(String[] tireReports) {
        for (int t = 0; t < tireReports.length; t++) {
            System.out.println(tireReports[t]);
        }
    }
}

//output:Welcome to the Tire Price Comparison Calculator
//Please enter the number of tires to compare
//2
//What is the name of the Tire?
//goody
//Enter the price of goody
//23
//Enter the number of miles warranty
//34000
//What is the name of the Tire?
//bingo
//Enter the price of bingo
//34
//Enter the number of miles warranty
//45000
//goody costs $23.00, has a 34000 mile warranty, costs $0.676 per 1000 miles
//bingo costs $34.00, has a 45000 mile warranty, costs $0.756 per 1000 miles