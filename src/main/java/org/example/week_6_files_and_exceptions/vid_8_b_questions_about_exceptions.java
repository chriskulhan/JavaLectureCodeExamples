/*
IOException is being thrown, but program does not crash (slide 49)

Question: What would happen if the try block throws a different type of error,
    like a NullPointerException?
Answer: the catch block won't catch it - program will crash
You can add more than one catch block after a try block to deal with more than
    one type of Exception

Question: What if the file is opened successfully, but an error is encountered
    as the file is being read? Code will never get to the line where the bufReader is closed, so the resource will never be closed.
Answer: a finally block, next slide

 */

package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_8_b_questions_about_exceptions {
    public static void main(String[] args) {

        //from: week 6 vid_6_c_handling_exceptions

        BufferedReader bufReader = null;
        try {
            bufReader = new BufferedReader(new FileReader("test.txt"));
//        BufferedReader bufReader = new BufferedReader(reader); //move this outside the try block so
            //it can be used in the finally block below
            String line = bufReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufReader.readLine();
            }
            //try to do something with the output:

//        System.out.println(line.toUpperCase()); //don't do this. if you want to change data,
            //do that inside the loop so they will catch mistakes there.

        } catch (IOException e) {
            System.out.println("Sorry, error or we can't find this file." + e);

            //add this finally block:
        } finally {
            if(bufReader !=null) {
                try {
                    bufReader.close();
                }
                catch (IOException e) {
                    System.out.println("Error closing the file." + e);
                }
            }
        }
    }
    //output: Sorry, error or we can't find this file.java.io.FileNotFoundException: test.txt (No such file or directory)
}