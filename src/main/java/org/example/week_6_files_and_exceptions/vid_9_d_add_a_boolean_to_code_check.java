package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_9_d_add_a_boolean_to_code_check {
    public static void main(String[] args){
        //1. Read in the file from JavaLectureCodeExamples (vid_4_d_1_your_turn_loop_example_months.java)

        String filename = "vid_4_d_1_your_turn_loop_example_months.java";
        //3a. add variable here to check how long the lines are:
        int maxLineLength = 75;
        //checked at 100 length, there was nothing
        //checked at 75 length and there were 3 lines that were too long.

        try (BufferedReader reader = new BufferedReader(new FileReader("vid_4_d_1_your_turn_loop_example_months.java"))) {

            // count the number of lines too long:
            int numberOfLinesTooLong = 0;
            //add a boolean
            boolean linesTooLong = false;
            String line = reader.readLine();

            //create a variable that's a line counter:
            int lineCounter = 1;

            while(line != null) {
                //3b. check how long the maxLineLength is and only print if it's too long:
                if (line.length() > maxLineLength) {
                    System.out.println("The line " + lineCounter + " is too long. ");
                    System.out.println(line);
                    //part of boolean addition:
                    linesTooLong = true;
                    numberOfLinesTooLong ++;
                }
                //update the line within the loop by adding this line:
                line = reader.readLine();
                //part of the line counter: to increase the line number variable with each loop
                lineCounter ++;
            }
            //check if linesTooLong is true:
            if(linesTooLong) {
                System.out.println("there were " + numberOfLinesTooLong + " lines that were too long");
                //when int maxLineLength = 75;
                //there were 2 lines that were too long

            } else {
                System.out.println("there were no lines that were too long.");
                //when int maxLineLength = 100;
                //output: there were no lines that were too long.
            }

        } catch (IOException e) {
            System.out.println("Error reading file " + filename + " because " + e);
        }
    }
}
