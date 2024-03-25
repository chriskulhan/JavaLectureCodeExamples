/* (PowerPoint slides 13-14, week 5)
-Create a HashMap of distances from Minneapolis to other cities in Minnesota
    The HashMap will have
    String keys (for names of cities)
    Integer values (driving miles to that city from Minneapolis)

-Add this example data
    Distance to Duluth = 154 miles
    Distance to Brainerd = 127 miles
    Distance to Stillwater = 26 miles
    Distance to Ely = 245 miles
    Distance to Red Wing = 54 miles

-Ask the user for the maximum distance they want to drive
    Use a loop to search your HashMap and print all the cities that are within the user's driving range
    Example: user will drive a maximum of 60 miles, print Stillwater and Red Wing
    Example: user will drive a maximum of 200 miles, print Duluth, Brainerd, Stillwater, Red Wing

 */
package org.example.week_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class vid_5_your_turn_road_trip_planner {
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
        for (String city : citiesAndDistancesFromMpls.keySet()){
            int distance = citiesAndDistancesFromMpls.get(city);
            if (distance <= maximumDistanceYouWantToDrive) {
                System.out.println(city + " is " + distance + " miles away.");
                //output:
                //Enter the maximum distance you want to drive on your road trip:
                //67
                //Stillwater is 26 miles away.
                //Red Wing is 54 miles away.

                //another output:
                //Enter the maximum distance you want to drive on your road trip:
                //300
                //Duluth is 154 miles away.
                //Ely is 245 miles away.
                //Brainerd is 127 miles away.
                //Stillwater is 26 miles away.
                //Red Wing is 54 miles away.

            }
        }

    } //end of psvm

}//end of main method
