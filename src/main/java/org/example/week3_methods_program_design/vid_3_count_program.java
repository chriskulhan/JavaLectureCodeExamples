package org.example.week3_methods_program_design;

import static input.InputUtils.intInput;

//from Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/Counting.java
public class vid_3_count_program {
    //This is the main method - the first code to run
    public static void main(String[] args) {

        //print a list of numbers in order
        int smallNumber = intInput("Please enter a small integer number");
        int largeNumber = intInput("Please enter a large integer number");

        System.out.println("I will now count from " + smallNumber + " to " + largeNumber);

        //call the count function:
        count(smallNumber, largeNumber);

    }    // This is the end of the main method.


    // A new method that we've created called vid_3_count_program
    // This method takes two arguments, both integers,
    // representing a number to start counting from and a number to stop counting at
    // It will count from min to max, printing out each number.

    //use "void" as the return type when the method isn't going to return anything:
    public static void count(int min, int max) {

        for (int i = min ; i <= max ; i++) {
            System.out.println(i);
        }
        //input: output:
        //Please enter a small integer number
        //3
        //Please enter a large integer number
        //5
        //I will now count from 3 to 5
        //3
        //4
        //5

    }  // The end of the count method

}   // The end of the Counting class