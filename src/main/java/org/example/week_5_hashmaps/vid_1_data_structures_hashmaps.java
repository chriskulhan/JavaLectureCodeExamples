/*
HashMap - a map type: (slide 2)

-Like Python's dictionary, C#'s Hashtable, or JavaScript's object
-Stores key-value pairs. A key is mapped to its value
-Keys are unique in a HashMap
-Can add a key-value pair
-Can look up a value for a key  (and it's fast)
-Can replace the value for a key
-Can delete a key-value pair
-Can loop over all the keys (or over the values, or both)

 */

package org.example.week_5_hashmaps;

import java.util.HashMap;

public class vid_1_data_structures_hashmaps {
    public static void main(String[] args) {
        //create a hashmap that will store State names with 2 letter abbreviations for the states (key-value pair)
        //could use 'Map' instead of 'Hashmap' just below vv Both are okay
        HashMap<String, String > stateAbreviations = new HashMap<>();
        //first 'String' is the key, second 'String' is the value

//add things using the (.put method:)
        stateAbreviations.put("Minnesota", "MN");
        stateAbreviations.put("Wisconsin", "WI");
        stateAbreviations.put("Michigan", "MI");
        stateAbreviations.put("Iowa", "IA");

        System.out.println(stateAbreviations);
        //output: {Minnesota=MN, Wisconsin=WI, Michigan=MI}
        //output after adding IOWA:IA {Iowa=IA, Minnesota=MN, Wisconsin=WI, Michigan=MI}

//read data: (.get method)
        System.out.println(stateAbreviations.get("Minnesota"));
        //output MN

//if you try to grab a state (Iowa) that's not in the hashmap:
        //can be used to determine if a key is in your hashmap:
        System.out.println(stateAbreviations.get("Iowa"));
        //output: null (before I added that data)
        //output: IA (after stateAbreviations.put("Iowa", "IA"); was added above)

//retrieve information from a hashmap and put it into a variable:
        String wisconsinAbbreviation = stateAbreviations.get("Wisconsin");
        System.out.println(wisconsinAbbreviation);
        //output: WI

//be careful to use the exact key as it's typed (so here lower case wisconsin will return null:
        String wisconsinAbbreviationAgain = stateAbreviations.get("wisconsin");
        System.out.println(wisconsinAbbreviationAgain);
        //output:null

//hashmaps don't rely on the order the things are added.
        //if you need the order you can use TreeMap (https://docs.oracle.com/javase/8/docs/api/java/util/TreeMap.html)
            //--for TreeMaps: strings will be sorted in "natural order" or alphabetical order and numbers will be sorted
        //      from smallest to largest
    }
}
