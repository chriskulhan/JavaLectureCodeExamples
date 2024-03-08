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
            classNames.remove(0); //will result in an error because the enhanced loop
        }

        //can write classic for loops:
        for (int i = 0; i < classNames.size () ; i++) {
            //this one includes the index, enhanced for loops don't
            //use the get to get each item:
            System.out.println(classNames.get(i));
            //output: (exactly the same as above):
            //Programming Logic
            //Web Client Server
            //Project Management
            //Info Tech Concepts
        }


    }
}
