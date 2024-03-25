package org.example.week_5_hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class vid_5_your_turn_road_trip_part_2_with_list {
    public static void main(String[] args) {
        Map< String, Integer > citiesAndDistancesFromMpls = new HashMap<>();

        citiesAndDistancesFromMpls.put("Duluth", 154);
        citiesAndDistancesFromMpls.put("Brainerd", 127);
        citiesAndDistancesFromMpls.put("Stillwater", 26);
        citiesAndDistancesFromMpls.put("Ely", 245);
        citiesAndDistancesFromMpls.put("Red Wing", 54);

        System.out.println(citiesAndDistancesFromMpls);
        //output: {Duluth=154, Ely=245, Brainerd=127, Stillwater=26, Red Wing=54}

        int maximumDistanceYouWantToDrive = positiveIntInput("Enter the maximum distance you want to " +
                "drive on your road trip:");

//        System.out.println(maximumDistanceYouWantToDrive); //check

        //from video 5 Clara's solution:
        //to have a response if the distance the user wants to drive is less than the distance
        //the cities are from Minneapolis:
        List<String> citiesInRange = new ArrayList<>();

        for (String city : citiesAndDistancesFromMpls.keySet()){
            int distance = citiesAndDistancesFromMpls.get(city);
            if (distance <= maximumDistanceYouWantToDrive) {
                System.out.println(city + " is " + distance + " miles away.");
                // add citiesInRange from just above ^^ to add all the cities in range to a list:
                //(collect all the cities as the loop runs here: )
                citiesInRange.add(city);
            }
        }
        //at the end of the above loop, do another loop:
        //were there any cities within range?
        if (citiesInRange.isEmpty()) {
            System.out.println("There were no Minnesota cities listed in your given distance range");
        } else {
//            System.out.println(citiesInRange);
//        }
            //input/output:
            //Enter the maximum distance you want to drive on your road trip:
            //500
            //Duluth is 154 miles away.
            //Ely is 245 miles away.
            //Brainerd is 127 miles away.
            //Stillwater is 26 miles away.
            //Red Wing is 54 miles away.
            //[Duluth, Ely, Brainerd, Stillwater, Red Wing]

            // input/output:
            //10
            //There were no Minnesota cities listed in your given distance range

            //input/output:
            //Enter the maximum distance you want to drive on your road trip:
            //45
            //Stillwater is 26 miles away.
            //[Stillwater]

            //prefer one city per row: (continuation of the else above ^^^)
            System.out.println("There are " + citiesInRange.size() + " cities you can drive to in your listed range. " +
                    "In no particular order: " );
            for (String city : citiesInRange) {
                System.out.println(city);

                //input/output:
                //Enter the maximum distance you want to drive on your road trip:
                //500
                //Duluth is 154 miles away.
                //Ely is 245 miles away.
                //Brainerd is 127 miles away.
                //Stillwater is 26 miles away.
                //Red Wing is 54 miles away.
                //There are 5 cities you can drive to in your listed range. In no particular order:
                //Duluth
                //Ely
                //Brainerd
                //Stillwater
                //Red Wing

                //input/output:
                //Enter the maximum distance you want to drive on your road trip:
                //10
                //There were no Minnesota cities listed in your given distance range
            }
        }

    } //end of psvm

}//end of main method

