package org.example.week_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

public class vid_3_loops_and_switch_key_and_value_state_abbreviations {
    public static void main(String[] args) {
//create a hashmap that will store State names with 2 letter abbreviations for the states (key-value pair)
//could use 'Map' instead of 'Hashmap' just below vv Both are okay
        HashMap<String, String > stateAbbreviations = new HashMap<>();
        //first 'String' is the key, second 'String' is the value

//add things using the (.put method:)
        stateAbbreviations.put("Minnesota", "MN");
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA");

        System.out.println(stateAbbreviations);
        //output: {Minnesota=MN, Wisconsin=WI, Michigan=MI}
        //output after adding IOWA:IA {Iowa=IA, Minnesota=MN, Wisconsin=WI, Michigan=MI}

//read data: (.get method)
        System.out.println(stateAbbreviations.get("Minnesota"));
        //output MN

//checking for values in a hashmap: **in this example, want to look up the abbreviations for states:
        //One way: write a loop and look at every value to see if the value is present

        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);

            //look up the value:
            System.out.println(stateAbbreviations.get(stateName));

            //output:
            //Iowa
            //IA
            //Minnesota
            //MN
            //Wisconsin
            //WI
            //Michigan
            //MI
        }

//loop over the HashMap values: ( .values()), not useful if you need to get the key from th value
        //values aren't unique
        for (String abbreviation: stateAbbreviations.values()) {
            System.out.println(abbreviation);

            //output:
            //MI
            //IA
            //MN
            //WI
            //MI
        }

//loop over the key-value pairs until a value is found:

        String searchAbbreviation = "MI";

        for (String stateName: stateAbbreviations.keySet()) { //same loop as a few above^^^
            System.out.println(stateName);
            //output:
            //Iowa
            //Minnesota
            //Wisconsin
            //Michigan

                //look up the value:
                String anotherAbbreviation = stateAbbreviations.get(stateName);
                if (anotherAbbreviation.equals(searchAbbreviation)) {
                    System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
                    //output: Found it! The state for MI is Michigan

            }

//Another way: make a new hashmap where the keys and values are switched. (every key is the value,
//  every value is the key. So: MN would be the key, and Minnesota would be the value. Currently,
// Minnesota is the key, MN is the value

    //Make a new hashmap that loops over the keys AND values:

            Map<String, String> abbreviationsStateNames = new HashMap<>();

            //want to use the above new Hashmap (abbreviationsStateNames) and put the data in it from
            // stateAbbreviations listed above:

    //how to loop over the key-value pairs (called 'entry' in hashmap terms:)
            for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()) {
                //
                String state = entry.getKey();
                String abbreviation = entry.getValue();

                //add the 'state' and 'abbreviation' just above ^^ to abbreviationStateNames Hashmap:
                //key is abbreviation, value is state.
                abbreviationsStateNames.put(abbreviation, state);
            }
            System.out.println(stateAbbreviations);
            //output: {Iowa=IA, Minnesota=MN, Wisconsin=WI, Michigan=MI}

            System.out.println(abbreviationsStateNames);
            //output: {MN=Minnesota, WI=Wisconsin, IA=Iowa, MI=Michigan}

//How to find the size of a hashmap? (it's the number of key-value pairs)

            System.out.println("There are " + stateAbbreviations.size() + " states listed.");
            //output: There are 4 states listed.
        }

    } //end of psvm
} //end of main
