package org.example.week_7_object_oriented_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static input.InputUtils.stringInput;

public class classNotes_03262024 {
    public static void main(String[] args) {

    //assignment statements:
        //'int' is the type
        //'number' is the name of the variable
        int number = 7;

        //'String' is a type
        //'name' is the name
        //"'Chris'" is assigned to name
        String name = "Chris";

        //making a new random number generator object:
        //'Random' (on the left) is the type
        //'randomNumberGenerator' is the name
        //'Random" (on the right) is assigned to the name
        Random randomNumberGenerator = new Random();

        //'List<String>' is a type
        //'nameAgain' is the name
        //
        List<String> nameAgain = new ArrayList<>();
        //also valid: ArrayList<String> nameAgain = new ArrayList<>();
        //list is an object
        //string is an object

        //'String' is the type
        //'data' is the name
        //'stringInput("Enter data") will be evaluated to the type list above
        String data = stringInput("enter data:");


    }
    //Defining our own classes:
    //why?
    //we don't want all the content into one file
    //we can separate the different functionality into different files
    //we need to store a bunch of things.

    //Question 2 in week 7 is a support program for IT
    // There is a class for each piece.


}
