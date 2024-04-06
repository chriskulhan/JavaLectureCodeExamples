package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class vid_2_b_writing_strings_filewriter_name_change {
    public static void main(String[] args) throws IOException {
        //added "throws IOException" above

        //if file doesn't exist, will be created
        //if file DOES exist, it will be overwritten and any data in the last file will be completely lost.
        FileWriter writer = new FileWriter("helloAgainVid2.txt");
        BufferedWriter bufWriter =  new BufferedWriter(writer);


        bufWriter.write("Hello space newLine() added below"); //need to add a new line character after each
        bufWriter.newLine();
        bufWriter.write("More data here");
        bufWriter.newLine();
        bufWriter.write("Goodbye");
        bufWriter.newLine();
        bufWriter.write("Second running will this overwrite?"); //added after running once.
        bufWriter.newLine();

        bufWriter.close(); //don't forget to close!

        //this FileWriter (just below vvv) erased what was written above ^^ because used the same file name
        FileWriter writer2 = new FileWriter("helloAgainVid2Again.txt");
        //used the same file as above, overwritten everything.
        BufferedWriter bufWriter2 =  new BufferedWriter(writer2);


        bufWriter2.write("new data"); //need to add a new line character after each
        bufWriter2.newLine();
        bufWriter2.write("testing");
        bufWriter2.newLine();
        bufWriter2.write("is this thing on? ");
        bufWriter2.newLine();
        bufWriter2.write("ending file"); //added after running once.
        bufWriter2.newLine();

        bufWriter2.close(); //don't forget!

        //outputs: BOth work because they are named differently:

        //output in: helloAgainVid2.txt
        // Hello space newLine() added below
        //More data here
        //Goodbye
        //Second running will this overwrite?

        //output in: helloAgainVid2Again.txt
        // new data
        //testing
        //is this thing on?
        //ending file

    }
}

