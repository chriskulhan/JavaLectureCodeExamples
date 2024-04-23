//from clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week7_first_classes/tires/TireComparison.java

package org.example.week_7_object_oriented_programming.tire_comparison_vid_6;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.*;

public class Tire_comparison {


    public static void main(String[] args) {

        System.out.println("Welcome to the Tire Price Comparison Calculator");

        List<Tire> tireReports = new ArrayList<>();

        do {
            Tire tire = getTireInfo(); //first Tire is the Tire object (main file),
            //second tire is what is passed in the method????? (unsure about this definition)
            tireReports.add(tire);
        } while (yesNoInput("More tires to add to comparison?"));

        printReportTable(tireReports);

    }

    private static Tire getTireInfo() {
        String name = stringInput("What is the name of the tire?");
        double price = positiveDoubleInput("Enter the price of " + name);
        int mileWarranty = positiveIntInput("Enter the number of miles warranty");

        return new Tire(name, price, mileWarranty);
    }

    private static void printReportTable(List<Tire> tireReports) {
        for (Tire tire: tireReports) {
            System.out.println(tire);
        }
    }
}
