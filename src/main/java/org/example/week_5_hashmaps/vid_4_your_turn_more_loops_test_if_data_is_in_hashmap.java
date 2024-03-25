/*
your turn:

-Create a new Hashmap of class codes, and class names that you are taking this semester
-examples: 2545 and Java
1425 and Data Communications
2560 and Web Client Server

-What types of data will the keys and values be?

Write a loop that prints all the class codes and names in the form: "ITEC 2545 Java"

Print the number of classes you are taking (size of the hashmap)

Add this variable:
int searchCode = 2417; //Android Programming

-Can you write an if statement to check if this code is in the Hashmap and print the class name if so?

Add this variable:
int searchCode2 = 2545;

 */

package org.example.week_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

public class vid_4_your_turn_more_loops_test_if_data_is_in_hashmap {
    public static void main(String[] args) {

        Map<Integer, String > classCodesNames = new HashMap<>();

        classCodesNames.put(2545, "Java Programming");
        classCodesNames.put(1425, "Data Communications");
        classCodesNames.put(2560, "Web Client Server");
//        classCodesNames.put(2417, "Android");

        System.out.println(classCodesNames);
        //output :{2560=Web Client Server, 2545=Java Programming, 1425=Data Communications}


//Write a loop that prints all the class codes and names in the form: "ITEC 2545 Java"
     //from my notes: vid_2_hashmap_example_snowfall
        //Map<String, Double> snowfall = new HashMap<>();
        //snowfall.put("March", 4.1); // plus more data, etc.
        // for(String month: snowfall.keySet()) {
        //            double snow = snowfall.get(month);
        //            System.out.println("The snow in " + month + " was " + snow);
        //        }

        for(Integer classCode: classCodesNames.keySet()) {
            String className = classCodesNames.get(classCode);
            System.out.println("ITEC " + classCode + " " + className);
            //output: (not in order, but not a big deal)
            //ITEC 2560 Web Client Server
            //ITEC 2545 Java Programming
            //ITEC 1425 Data Communications

        }

//Print the number of classes you are taking (size of the hashmap)
        System.out.println("There are " + classCodesNames.size() + " classes listed in this hashmap.");
        //output: There are 3 classes listed in this hashmap.
        int numberOfClasses = classCodesNames.size();

        System.out.println("******"); //to see where in the code I am
        System.out.println(numberOfClasses);
        //output: 3

//Add this variable:
        int searchCode = 2417;

//Can you write an if statement to check if this code is in the Hashmap and print the class name if so?
        //from my notes:  (vid_2_hashmap_example_snowfall)
        //        if (snowfall.containsKey(newMonth)) {
        //            //ask if should overwrite (will happen way below), first this:
        //
        //            double snow = snowfall.get(newMonth);
        //            System.out.println( newMonth + " is already in the HashMap");
        //            System.out.println("The snowfall for " + newMonth + " was " + snow + " inches.");
        //            //output: The snowfall for January was 4.6 inches.
        //
        //            //format string:
        //            System.out.printf("The snowfall for %s was %.1f inches\n", newMonth, snow);
        if (classCodesNames.containsKey(searchCode)) {
            String nameOfSearchedForClass = classCodesNames.get(searchCode);
            System.out.println("The class name for the code you searched for is: " + nameOfSearchedForClass);
        } else {
            System.out.println("The class code you searched for isn't listed.");
            //output: The class code you searched for isn't listed.
        }

        System.out.println( " * * * * ");

        //alternative solution for above: (from this video (4))
        if (classCodesNames.containsKey(searchCode)) {
            System.out.println("This class is found in the HashMap. The class name is " +
                    classCodesNames.get(searchCode));
        } else {
            System.out.println(searchCode + " not found. ");
        }
        //output: 2417 not found.

        //added: classCodesNames.put(2417, "Android"); at the top to test, works.
        //output: This class is found in the HashMap. The class name is Android

        //Add this variable:
        int searchCode2 = 2545;

        if (classCodesNames.containsKey(searchCode2)) {
            String nameOfSearchedForClass = classCodesNames.get(searchCode2);
            System.out.println("The class name for the code you searched for is " + nameOfSearchedForClass);
        } else {
            System.out.println("The class code you searched for isn't listed.");
            //output: The class name for the code you searched for is Java Programming
        }

        System.out.println("*#*#*#*");
        //alternative to above code: //if not present, will return null:
        String exampleClassName = classCodesNames.get(searchCode2);
        if (exampleClassName == null) {
            System.out.println(searchCode2 + " not found ");
        } else {
            System.out.println("This class is found in the Hashmap. The class name is " + exampleClassName);
        }
        //output: This class is found in the Hashmap. The class name is Java Programming

        //test by commenting out Java WAY above at the top, then output is:
        //output: 2545 not found

    }
}
