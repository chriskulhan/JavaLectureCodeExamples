/*
LinkedList, ArrayList  and Vector are Collection objects (slide 48)

-They also have the type Collection
    -They actually implement an interface called Collection
    -For now –LinkedList, ArrayList and Vector are also Collection objects

-Java provides a class called ---Collections--- which has several utility methods that operate
    on Collection objects – sort, max, min, shuffle, reverse, copy, fill…
https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Collections.html


 */

package org.example.week4_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class vid_6_collection_objects {

        //Clara's Collections methods from:
        // https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week4_list_data_structure/CollectionsMethods.java
//        package week4_list_data_structure;

/*
 *  Collections utility methods for ArrayList and LinkedList
 */
        public class CollectionsMethods {

            public static void main(String[] args) {

                List<String> animals = new ArrayList<>();

                animals.add("Cat");
                animals.add("Zebra");
                animals.add("Fish");
                animals.add("Bird");
                animals.add("Fish");    // I meant to add "Fish" twice

                System.out.println("Original animals list: " + animals);

        // Sort into order - only if the type of data in the list is sortable
                Collections.sort(animals);
                System.out.println("Sorted animals list: " + animals);

        //replace all:
                Collections.replaceAll(animals, "Fish", "Shark");  // Replace all "Fish" elements with "Shark"
                System.out.println("Replace \"Fish\" with \"Shark\", now the list is: " + animals);

        //reverse:
                Collections.reverse(animals);   // reverse the order of the list
                System.out.println("In reverse order: " + animals);

        //shuffle: put in random order
                Collections.shuffle(animals);   // put elements in random order
                System.out.println("Shuffled list: " + animals);

        //minimum (for strings first thing alphabetically:)
                // Display the minimum value = the lowest value = for strings, the first in the alphabet
                System.out.println("First in the alphabet: " + Collections.min(animals));

        //maximum (for strings, last thing alphabetically:)
                // Display the maximum value = the lowest value = for Strings, the last in the alphabet
                System.out.println("Last in the alphabet: " + Collections.max(animals));

        //fill whole array with one thing:
                Collections.fill(animals, "Koala");   // Fill the entire ArrayList with "Koala"
                System.out.println("Replaced every element with Koala and now the list is: " + animals);

            }
        }
    }
