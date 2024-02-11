//from powerpoint slide 46
// Create an array with the names of the classes you are taking this semester
//You can make some names up if you are only taking one class
//Use a loop to print all your classes, one name on each line
//Use the .length syntax
//Add another class to your array. Does your program still work correctly?

package org.example.week2_loops_and_arrays;

import java.util.Arrays;

public class vid_5_your_turn_names_of_classes {
    public static void main(String[] args) {
        String[] classNames = {"Java Programming", "Painting", "Winter sowing", "Landscape Design", "Advanced Pottery"};

        for (int x = 0; x < classNames.length; x++) {
            System.out.println("A class name you are taking is " + classNames[x]);
        //output:
            // A class name you are taking is Java Programming
            //A class name you are taking is Painting
            //A class name you are taking is Winter sowing
            //A class name you are taking is Landscape Design

        //add a class: "Advanced pottery", run again:
        //output:
            // A class name you are taking is Java Programming
            //A class name you are taking is Painting
            //A class name you are taking is Winter sowing
            //A class name you are taking is Landscape Design
            //A class name you are taking is Advanced Pottery
        }
        System.out.println(Arrays.toString(classNames));
        //output: [Java Programming, Painting, Winter sowing, Landscape Design, Advanced Pottery]
    }
}

