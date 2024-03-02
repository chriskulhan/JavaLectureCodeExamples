//https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/tires/Tires1.java

package org.example.week3_methods_program_design;

import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;

public class vid_8_tires1_claras_code {
    public static void main(String[] args) {
        String tireName = stringInput("Enter name of tire");
        double price = doubleInput("Enter price for " + tireName);
        double miles = doubleInput("Enter warranty miles for " + tireName);
        double pricePerMile = price / miles;
        System.out.println("The " + tireName + " tire costs " + pricePerMile + " dollars per miles.");
    }
}

