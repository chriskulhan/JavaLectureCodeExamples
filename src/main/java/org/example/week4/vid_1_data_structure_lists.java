//your turn: Create a new Java class:

//Create a main method (psvm shortcut)
//Add this code to the main method
//Alt+Enter or Option+Enter to import List, ArrayList
//Run and test

//package org.example.week4;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class vid_1_data_structure_lists {
//    public static void main(String[] args) {
//
//        List<String> arrayList = new ArrayList<>();
//        arrayList.add("Hello");
//        arrayList.add("World");
//
//        for (String s : arrayList) {
//            System.out.println(s);
//        //output:
//            //Hello
//            //World
//        }
//        //print entire arrayList:
//        System.out.println(arrayList);
//        //output: [Hello, World]
//    }
//}

//your turn,

package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class vid_1_data_structure_lists {
    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");

        //Can you add your name to the List?
        arrayList.add("Chris Kulhanek");

        //Can you add "MCTC" to the List?
        arrayList.add("MCTC");

        //Can you print out all the Strings in the List?
        for (String s : arrayList) {
            System.out.println(s);
            //output:
            //Hello
            //World
            //Chris Kulhanek
            //MCTC

        }
        //new loop to print to all strings in upper case:
        for (String t : arrayList) {
            //Can you print out all the String in the List in uppercase?
            System.out.println(t.toUpperCase());
            //output:
            //MCTC
            //HELLO
            //WORLD
            //CHRIS KULHANEK
            //MCTC
        }
        //note outside the loop:
            //print entire arrayList:
            System.out.println(arrayList);
            //output: [Hello, World, Chris Kulhanek, MCTC]

            //Can you print the lengths of each String?
            System.out.println(arrayList.toArray().length);
            //output: 4
    }
}
//pause video 1 week 4 at 6:42