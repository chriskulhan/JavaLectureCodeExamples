package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class vid_3_d_shortened_buffered_writer_code {
    public static void main(String[] args) throws Exception {

        //change from this:
//        FileWriter writer = new FileWriter("shorterCodeVid3.txt");
//        BufferedWriter bufWriter = new BufferedWriter(writer);

        //to this:
        BufferedWriter bufWriter = new BufferedWriter(new FileWriter("shorterCodeVid3.txt"));

        bufWriter.write("This is a test with shortened code vid_3");
        bufWriter.close();

        //written to file shorterCodeVid3.txt:
        //This is a test with shortened code vid_3
    }
}
