/*
ArrayList vs. Vector?
Which one to choose for code? (slide 25)

-ArrayList is faster for most common tasks
-Adding/removing at the end of list, looping, searching for item in list
-Unless you will need to add/remove a lot of data from the start or middle of list - then LinkedList is faster
-LinkedList has some extra methods for adding/removing at start and at end
-Remember, other than creating the list, your code will be the same for both types of list

Create a List Syntax: (slide 26)
What type of List - ArrayList, LinkedList, Vector?
What type of data does it store? Strings, integer, doubles... ?
Give the List a name (cities)

List<String> cities = new ArrayList <>();


<> Generic types for Array Lists (and Linked lists and vectors)(slide 27):

-Almost all the lists you use will contain data of just one type
    -An ArrayList of names only contains Strings
    -An ArrayList of prices only contains Doubles
-So Java recommends you specify that a List can only contain one particular type of value
-The compiler will enforce that - only that type will be permitted = safer code
-And when you remove data from the List, you know what type it is

ArrayList for primitive types (slide 28)
-Use the Object names for the generic type
    -int -> Integer
    -boolean -> Boolean
    -double -> Double

List<Integer> numbers = new ArrayList <>();
List<Boolean> results = new ArrayList <>();
List<Double> prices = new ArrayList <>();

**String is an object type -- has method, so there are things that can be done (uppercase, lowercase, contains, etc.)

List of primitive types:
-Use the object names (Integer, Double etc.) for the generic type
-Can add primitive values (int, double etc.) to the List - Java compiler handles conversion between object and primitive value

List<Integer> numbers = new ArrayList <>():

numbers.add(100); //add int value

int first = numbers.get(0); //read value of index 0
System.out.println(first); //output: 100

 */

package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class vid_2_Array_vs_Vector_with_example {
    //examples of adding data to lists:
    public static void main(String[] args) {
        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        System.out.println(classCodes);
        //output: [2545, 1150, 1250]

        //what size is this?
        System.out.println(classCodes.size());
        //output: 3

        //how to loop over a list of integers using int:
        for (int classCode: classCodes) {
            //^^classCode is the new variable you create
            //^^classCodes is the list at the top of this method
            System.out.println(classCode);
            //output:
            //2545
            //1150
            //1250
        }

        //same as above, only using Integer, and a new variable
        for (Integer classCodeAgain: classCodes) {
            //^^classCodeAgain is the new variable you create
            //^^classCodes is the list at the top of this method
            System.out.println(classCodeAgain);
            System.out.println("ITEC " + classCodeAgain);
            //output: (because it's a loop:)
            //2545
            //ITEC 2545
            //1150
            //ITEC 1150
            //1250
            //ITEC 1250

        }
    }
}
