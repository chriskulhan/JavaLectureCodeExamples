//https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/tires/Tires3.java

package org.example.week3_methods_program_design;
import static input.InputUtils.*;

public class vid_8_tires3_claras_code {
    public static void main(String[] args) {

        int numberOfTiresToCompare = positiveIntInput("Please enter the number of tires to compare");

        for (int t = 0; t < numberOfTiresToCompare; t++ ) {
            String report = getTireInfo();
            System.out.println(report);
        }
    }

    public static String getTireInfo() {
        String tireName = stringInput("Enter name of tire");
        double price = doubleInput("Enter price for " + tireName);
        double miles = doubleInput("Enter warranty miles for " + tireName);
        double pricePerMile = price / miles;
        return "The " + tireName + " tire costs " + pricePerMile + " dollars per miles.";
    }
}

