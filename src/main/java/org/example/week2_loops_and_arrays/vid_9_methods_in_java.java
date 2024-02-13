// A python function
//can you see the parameters and return statements?

//def add_numbers (num1, num2):
 //       sum = num 1 + num2
//return sum

//total = add_numbers(21,200)
 //       print (total) //what does this display?


//java method is similar
package org.example.week2_loops_and_arrays;

import java.sql.SQLOutput;

import static input.InputUtils.stringInput;

public class vid_9_methods_in_java {
    public static void main(String[] args) {
        //println, stringInput, .toUpperCase, .toLowerCase, etc. are methods
        System.out.println("Hello world!");

        String name = stringInput("What is your name?");

        System.out.println("Welcome, " + name);

        String shoutName = name.toUpperCase();

        System.out.println("HELLO " + shoutName);

        //often provide a method data when it's called
        //a method can store data and can give that data when asked.
        //can have methods without input (.toUpperCase)

    }
}

//Working with methods in programs:
// 1. Calling methods that already exist - you've done this already
//  **What methods have you used?

// 2. Finish a method definition - a task in the labs
// **look at the parameters - the input - how many, what types, what data do they store?
//** read the instructions so you know what the method needs to do, and what data it needs to return
//** decide what to think about, and what to ignore.

//3. Create your own methods (soon!)