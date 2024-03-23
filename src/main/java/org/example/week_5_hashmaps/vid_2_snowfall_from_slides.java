package org.example.week_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class vid_2_snowfall_from_slides {
    public static void main(String[] args) {

        Map<String, Double> snowfall = new HashMap<>();

        //add things to hashmaps with: '.put'
        snowfall.put("January", 3.1);   // Add key = January with value = 31.
        snowfall.put("February", 10.8);   // Add key = February with value = 10.8
        snowfall.put("December", 3.1); //add key = December with value = 3.1
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        System.out.println(snowfall);

        snowfall.put("January", 4.6);  // Update January snow

        System.out.println(snowfall);

        double janSnowfall = snowfall.get("January");   // Get value for the key "January"

        System.out.println("In January, " + janSnowfall + " inches of snow fell");

        for(String month: snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.println("The snow in " + month + " was " + snow);
        }

        double total = 0;

        for (Double snow: snowfall.values()) {
            total += snow;
        }

        System.out.println("Total snowfall is " + total + " inches.");
        String newMonth = stringInput ("Enter Month:");
        double newSnow = positiveDoubleInput ("Enter snow for " + newMonth);

        boolean overwrite = true;

        if (snowfall.containsKey(newMonth)) {
            double snow = snowfall.get(newMonth);
            System.out.println( newMonth + " is already in the Hashmap");
            System.out.println("Snowfall for " + newMonth + "was " + snow + " inches.");
            overwrite = yesNoInput("Do you want to overwrite the old data?");
        }
        if (overwrite) {
            snowfall.put(newMonth, newSnow);
        } else {
            System.out.println("Hashmap was not modified");
        }

    } //end of psvm

} //end of main
