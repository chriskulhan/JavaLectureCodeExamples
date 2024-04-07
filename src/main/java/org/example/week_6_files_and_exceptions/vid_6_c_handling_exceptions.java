/*
Handling exceptions (slide 45):

The compiler forces you to deal with checked exceptions, either by

A. Telling the compiler that you won't deal with the exception in this method
For example, the exception is caused by bad data sent to the method; that's the caller's problem,
    so return the problem to them

B. Catching the exception and doing something about it
If it's possible to recover; or if the exception should be logged or recorded somehow
 */

//Handling exception option A: add "throws IOException" into main,

//Handling exception option B:  (slide 47):

// Dealing with the exception
//Place code which may cause an error in a 'try block'.
//And then if an error occurs, you can trap it in a 'catch block', and deal with it,
//  before it crashes the program. You need to specify what type of error the catch block will catch
//Can also add an optional finally block - code that runs whether an exception is thrown or not


package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_6_c_handling_exceptions {
    //from vid_6_a_types_of_errors_notes
    public static void main(String[] args){

        //add this try block to everything that might be impacted (include close)
        try {
            FileReader reader = new FileReader("test.txt");
            BufferedReader bufReader = new BufferedReader(reader);
            String line = bufReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufReader.readLine();
            }
            bufReader.close();
            //then add a catch block (what type of exception?)
            //file not found is a type of IOException
            //the catch block only runs if the IOException is thrown (and throws IOException is not in main)
        } catch (IOException e){
            System.out.println("Sorry, we can't find this file.");
            //output: Sorry, we can't find this file.
        }
    }
}
