package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class vid_2_c_append_data_add_more_to_file {
    public static void main(String[] args) throws IOException {
        //added "throws IOException" above

        //if file doesn't exist, will be created
        //if file DOES exist, it will be overwritten and any data in the last file will be completely lost.

        //add a second argument just below ('true') after the name of the file to append (called append flag):
        //append flag will add data to the end.
        FileWriter writer = new FileWriter("helloAgainVid2Append.txt", true);
        BufferedWriter bufWriter = new BufferedWriter(writer);


        bufWriter.write("Hello vid2c append space newLine() added below"); //need to add a new line character after each
        bufWriter.newLine();
        bufWriter.write("More data here");
        bufWriter.newLine();
        bufWriter.write("Goodbye");
        bufWriter.newLine();
        bufWriter.write("Second running will this overwrite?"); //added after running once.
        bufWriter.newLine();

        bufWriter.close(); //don't forget to close!

        //this FileWriter (just below vvv) erased what was written above ^^ because used the same file name
        FileWriter writer2 = new FileWriter("helloAgainVid2Append.txt", true);
        //used the same file as above, overwritten everything.
        BufferedWriter bufWriter2 = new BufferedWriter(writer2);


        bufWriter2.write("new vid2c append data"); //need to add a new line character after each
        bufWriter2.newLine();
        bufWriter2.write("testing");
        bufWriter2.newLine();
        bufWriter2.write("is this thing on? ");
        bufWriter2.newLine();
        bufWriter2.write("ending file"); //added after running once.
        bufWriter2.newLine();

        bufWriter2.close(); //don't forget!

        //ran first group with true after append,
        //
        //output in helloAgainVid2Append.txt:
        // new vid2c append data
        //testing
        //is this thing on?
        //ending file

        // then changed the second group to have a true after it,
        //cumulative output in helloAgainVid2Append.txt:

        // new vid2c append data
        //testing
        //is this thing on?
        //ending file
        //Hello vid2c append space newLine() added below
        //More data here
        //Goodbye
        //Second running will this overwrite?
        //new vid2c append data
        //testing
        //is this thing on?
        //ending file


        //then ran the whole thing again new vid2c append data
        //cumulative output in helloAgainVid2Append.txt:

        //testing
        //is this thing on?
        //ending file
        //Hello vid2c append space newLine() added below
        //More data here
        //Goodbye
        //Second running will this overwrite?
        //new vid2c append data
        //testing
        //is this thing on?
        //ending file
        //Hello vid2c append space newLine() added below
        //More data here
        //Goodbye
        //Second running will this overwrite?
        //new vid2c append data
        //testing
        //is this thing on?
        //ending file

        //**appending to the end after each running


    }
}

