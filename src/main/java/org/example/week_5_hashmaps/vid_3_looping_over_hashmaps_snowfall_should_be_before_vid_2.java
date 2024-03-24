/*
Hashmap syntax (slide 3)

Create a Map
Specify the types of the keys and values in <> angle brackets
new HashMap<>()

Map<String, Integer> quantitiesOfProducts = new Hashmap<>();

Like Lists, there are other types of Maps, including HashTable (synchronized) and TreeMap (keeps keys in sorted order)
https://docs.oracle.com/en/java/javase/12/docs/api/java.base/java/util/Map.html

 */

package org.example.week_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

public class vid_3_looping_over_hashmaps_snowfall_should_be_before_vid_2 {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);

        System.out.println(snowfall);
        //output: {January=3.1, February=10.8}
        //coincidence that they are in order, the order is not guaranteed with Hashmaps

//add another February snowfall amount:
        //what will happen?
        snowfall.put("February", 12.4);
        System.out.println(snowfall);
        //output: {January=3.1, February=12.4}
        // overwritten ^^!!

//use the get method to fetch data:
        System.out.println("The snowfall in January is " + snowfall.get("January") + " inches.");
        //output: The snowfall in January is 3.1 inches.

//Try to get data from the hashmap that doesn't exist:
        System.out.println("The snowfall in July is " + snowfall.get("July") + " inches.");
        //output: The snowfall in July is null inches.

//Check to see if data is in a hashmap:
        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July!");
        } else {
            System.out.println("There was no snow listed in July.");
            //output: There was no snow listed in July.
        }

//there can be more than one value that is the same, but the keys MUST be unique.

    }
}
