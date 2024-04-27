//from Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week5_map_data_structure/HashMapSnow.java

/* your turn:

Add this data to the snowfall HashMap
March, 4.1 inches
April, 0 inches
Print out all the data - months and amounts, one entry per line
Is it in order? Is that OK?
Challenge: add up all the snowfall amounts and display the total
Challenge 2: Ask user for a month, and snowfall amount, and add this data to HashMap
Challenge 3: Check if month is already in HashMap before adding data warn user that they
will overwrite data and ask if they want to procced
 */

package org.example.week_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class vid_2_hashmap_example_snowfall {


    public static void main(String[] args) {

        //Use generic types in HashMaps too
        //You need to specify the type of the Keys, and the type of the Values
        //Specify in pointy brackets: < TypeOfKey, TypeOfValues>
        //In this example, all the keys must be Strings and all the values must be Doubles (or doubles)

        // Create HashMap for String keys, and Double values
        Map<String, Double> snowfall = new HashMap<>();

        //add things to hashmaps with: '.put'
        snowfall.put("January", 3.1);   // Add key = January with value = 31.
        snowfall.put("February", 10.8);   // Add key = February with value = 10.8
        snowfall.put("December", 3.1); //add key = December with value = 3.1

//Add this data to the snowfall HashMap:
//March, 4.1 inches
//April, 0 inches
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0);

        System.out.println(snowfall);
        // output: {December=3.1, March=4.1, January=3.1, February=10.8, April=0.0}

        snowfall.put("January", 4.6);  // Update January snow

        System.out.println(snowfall);
        // output: {December=3.1, March=4.1, January=4.6, February=10.8, April=0.0}   Old value was overwritten

        double janSnowfall = snowfall.get("January");   // Get value for the key "January"

        System.out.println("In January, " + janSnowfall + " inches of snow fell");
        //output: In January, 4.6 inches of snow fell

//Print out all the data - months and amounts, one entry per line
//Is it in order? Is that OK?

        //wrong:
//        for (int x = 1 ; x <= 10 ; x++ ) {
//            System.out.println(snowfall(x));
//        }
        for(String month: snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.println("The snow in " + month + " was " + snow);
        }
        //output:
        // The snow in December was 3.1
        //The snow in March was 4.1
        //The snow in January was 4.6
        //The snow in February was 10.8
        //The snow in April was 0.0

//Challenge: add up all the snowfall amounts and display the total
        // Calculate total snow by adding all the values
        double total = 0;

        // Loop over all the values in the HashMap
        for (Double snow: snowfall.values()) {
            total += snow;
        }

        System.out.println("Total snowfall is " + total + " inches.");
        //output: Total snowfall is 22.6 inches.

//Challenge 2: Ask user for a month, and snowfall amount, and add this data to HashMap
        //Clara's solution:

        String newMonth = stringInput("Enter month: ");
        double newSnow = positiveDoubleInput("Enter new snowfall data to be added for " + newMonth);
        System.out.println(snowfall);

        //here is where the "overwrite" variable begins and starts out as true so everything runs smoothly
        boolean overwrite = true;

        if (snowfall.containsKey(newMonth)) {
            //ask if should overwrite (will happen way below), first this:

            double snow = snowfall.get(newMonth);
            System.out.println( newMonth + " is already in the HashMap");
            System.out.println("The snowfall for " + newMonth + " was " + snow + " inches.");
            //output: The snowfall for January was 4.6 inches.

            //format string:
            System.out.printf("The snowfall for %s was %.1f inches\n", newMonth, snow);
            //output: The snowfall for January was 4.6 inches.

            //ask if you want to overwrite the old data, using the boolean variable created above "overwrite"
            overwrite = yesNoInput("Do you want to overwrite the old data?");
        }

        //take the yesNoInput response from just above "overwrite" and make decisions based on the response:
        if (overwrite) {
            //if you do want to overwrite, add the data:
            snowfall.put(newMonth, newSnow);
            System.out.println(snowfall);
        } else {
            System.out.println("HashMap was not modified.");
        }
        //{December=3.1, March=4.1, January=3.1, February=10.8, April=0.0}
        //{December=3.1, March=4.1, January=4.6, February=10.8, April=0.0}
        //In January, 4.6 inches of snow fell
        //The snow in December was 3.1
        //The snow in March was 4.1
        //The snow in January was 4.6
        //The snow in February was 10.8
        //The snow in April was 0.0
        //Total snowfall is 22.6 inches.
        //Enter month:
        //March
        //Enter new snowfall data to be added for March
        //100
        //{December=3.1, March=4.1, January=4.6, February=10.8, April=0.0}
        //March is already in the HashMap
        //The snowfall for March was 4.1 inches.
        //The snowfall for March was 4.1 inches
        //Do you want to overwrite the old data? Y/N?
        //y
        //{December=3.1, March=100.0, January=4.6, February=10.8, April=0.0}
//
    } //end of psvm

}//end of Main method

