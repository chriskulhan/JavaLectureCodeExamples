package org.example.week4_lists;

import java.util.ArrayList;
import java.util.List;

public class vid_4_looping_over_lists {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");
        System.out.println(classNames);
        //output: [Programming Logic, Web Client Server, Project Management, Info Tech Concepts]

        //How do you remove data from a list? Use an "enhanced for loop"
        //this will represent every item in the list in turn:

        //(don't use the word "class" as a variable name (here used "name").)
        for (String name: classNames) {
            System.out.println(name);
            //output:
            //Programming Logic
            //Web Client Server
            //Project Management
            //Info Tech Concepts
//            classNames.remove(0); //will result in an error because the enhanced loop
            //this can't be done with this type of loop
        }
        System.out.println("************1"); //added to see where the next thing starts:

        //can write classic for loops:
        //if you need to know where you are in the loop AS WELL AS what the data is use this:
        for (int i = 0; i < classNames.size () ; i++) {
            //this one includes the index, enhanced for loops don't
            //use the get to get each item:
            System.out.println(classNames.get(i));
            //output: (exactly the same as above):
            //Programming Logic
            //Web Client Server
            //Project Management
            //Info Tech Concepts

            //not a good way to remove an element from a loop:
            //remove element 0 ("Programming Logic") from the array
//            classNames.remove(0);
            //output: (weirdly only prints two things from the list?)
            //Programming Logic
            //Project Management
        }
        System.out.println("************2");
        //First: remove all elements from the loop
        //vvv read as "while NOT (!) classNames is empty", or "while classnames is not empty":
        while (!classNames.isEmpty()) {
            String name = classNames.remove(0);
            System.out.println(name);
            //if you remove something, this will return which value was removed.
            //output:
            //Programming Logic
            //Web Client Server
            //Project Management
            //Info Tech Concepts
        }
        System.out.println(classNames);
        //output: []
        //empty list because everything has been removed:


    }
}
