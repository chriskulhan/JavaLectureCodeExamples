package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_3_b_I_O_reading_a_file_should_be_before_vid_2 {
    public static void main(String[] args) throws IOException {
        //need to add "throws IOException to PSVM above ^^
        FileReader reader = new FileReader("hello.txt");
        //this file was written earlier ^^^
        BufferedReader bufferedReader = new BufferedReader(reader);
        //BufferedReader is going to work with the file reader to gather together a line of characters,
        //collect that line into a string, and then provide that string to our program

//        //begin by reading lines one at a time:
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());

        //write a loop to do the above (reading of all the lines) without knowing how many lines there are:
        //first process the first line:
        String line = bufferedReader.readLine();
        //to process each line, print it out:

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();

        }
        bufferedReader.close();
        //output:  (this is everything in hello.txt)
        //Hello
        //More data here
        //Goodbye
        //Second running will this overwrite?
        //Hello space newLine() added below
        //More data here
        //Goodbye
        //Second running will this overwrite?

        //add extra data to hello.txt and rerun: (yes, last line worked)
        //output:
        //Hello
        //More data here
        //Goodbye
        //Second running will this overwrite?
        //Hello space newLine() added below
        //More data here
        //Goodbye
        //Second running will this overwrite?
        //adding extra data to file so I can see if vid_3_b_I_O_reading_a_file_should_be_before_vid_2 is reading it

        //delete lines from hello.txt file to see if it changes the output: (yes! it changed)
        //output:
        // Hello
        //deleted a bunch of data for vid_3_b_I_O_reading_a_file_should_be_before_vid_2 example
    }
}
