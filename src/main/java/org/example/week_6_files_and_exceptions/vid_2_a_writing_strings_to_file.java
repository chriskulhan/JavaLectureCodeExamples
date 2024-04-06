//use FileWriter and BufferWriter together

//from PowerPoint (slide 7)
//
// The FileWriter object can open, create, close, and write to a file
//FileWriter can write out Strings or chars to a file
//https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/io/FileWriter.html
//If the file doesn't exist, then FileWriter will create it
//If the file does exist, it will be overwritten
//If you don't want to overwrite your data, then use the append flag (example in a few slides time)

//slide 8:
//
// File I/O (input/output) is slow - about 1000 times slower than reading/writing to memory
//If your program does a lot of I/O it can slow down considerably
//BufferedWriter class wraps FileWriter and handles I/O in the background of your program; so memory-based
// operations can continue while the file is being used

//BufferedWriter benefits:
// 1. wraps with a filewriter,
// 2. is writing to disc in the background
// 3. will make code faster

package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class vid_2_a_writing_strings_to_file {
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
    //output:
    //Hello space newLine() added below
    //More data here
    //Goodbye
    //Second running will this overwrite?

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
    //output: **the first batch of data is overwritten because I used the same file name, so only this is shown:
    // new data
    //testing
    //is this thing on?
    //ending file



}
}
