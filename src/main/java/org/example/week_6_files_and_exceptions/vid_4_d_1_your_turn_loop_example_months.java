//your turn: (slide 23)
//
// Use a loop to write each item in this example array to a file
//
//String[] months = { "Jan", "Feb", "Mar" };
//
//Write one item per line
//
//OR: Modify the task list program you wrote in the Lists class to write your task list to a files
//
//Question: can you read a file into an array? Why or why not?

package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class vid_4_d_1_your_turn_loop_example_months {

    public static void main(String[] args) throws Exception {

        String filename = "vid_4_d_months.txt";

        //added April so I know the data is re-written:
        String[] months = { "Jan", "Feb", "Mar", "April" };

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        //classic for loop:
        //note: months.length doesn't have parentheses: months.length() <<<NOPE see:
        for (int i = 0; i < months.length; i++) {
            String month = months[i];
            bufferedWriter.write(month + "\n");
        }
        bufferedWriter.close();

        //found in file:
        //Jan
        //Feb
        //Mar
        //April
    }
}
