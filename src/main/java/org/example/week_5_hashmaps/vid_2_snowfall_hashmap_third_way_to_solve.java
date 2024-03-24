package org.example.week_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class vid_2_snowfall_hashmap_third_way_to_solve {
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

        for (String month : snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.println("The snow in " + month + " was " + snow);
        }

        //*****************
        //set this double to loop the total onto
        double total = 0;

        //for double snow in snowfall values
        for (Double snow : snowfall.values()) {
            //add each snowfall amount in turn to the above variable 'total'^^
            total += snow;
        }

        System.out.println("Total snowfall is " + total + " inches.");

        //*****************

        String newMonth = stringInput("Enter Month:");
        double newSnow = positiveDoubleInput("Enter snow for " + newMonth);

        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July!");
        } else {
            System.out.println("There was no snow in July.");
        }

//        boolean overwrite = true;

        //double (lowercase) is a primitive type and *has* to be a number and MUST have a number
        //primitive types aren't allowed to be null.

        //Double (uppercase) is the *object* type:
        Double snow = snowfall.get(newMonth);

        //if the data is not in the hashmap
        if (snow != null) {
            //ask if should overwrite?

            System.out.println("Snowfall for " + newMonth + "was " + snow + " inches.");
            boolean overwrite = yesNoInput("Do you want to overwrite the old data?");

            if (overwrite) {
                snowfall.put(newMonth, newSnow);
            } else {
                System.out.println("Hashmap was not modified");
            }
        } else {
            snowfall.put(newMonth, newSnow);
        }
    }//end of psvm

//alternative block of code: (rearranged from just above where you ask if the snow is not there, then add it first)
        //is snow NOT there?
//        if (snow == null) {
//            snowfall.put(newMonth, newSnow);
//        } else {
//            System.out.println("Snowfall for " + newMonth + "was " + snow + " inches.");
//            boolean overwrite = yesNoInput("Do you want to overwrite the old data?");
//
//            if (overwrite) {
//                snowfall.put(newMonth, newSnow);
//            } else {
//                System.out.println("Hashmap was not modified");
//            }
//        }

} //end of main


