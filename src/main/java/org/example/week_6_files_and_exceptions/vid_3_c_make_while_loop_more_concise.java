package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_3_c_make_while_loop_more_concise {
    public static void main(String[] args) throws IOException {

//        FileReader reader = new FileReader("hello.txt");
//        BufferedReader bufferedReader = new BufferedReader(reader);

        //change the above 2 lines ^^^ to this single line:
        BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"));

        //Another way to shorten take this:
//        String line = bufferedReader.readLine();
//
//        while (line != null) {
//            System.out.println(line);
//            line = bufferedReader.readLine();

        //change it to vv:

        String line;

        while ((line = bufferedReader.readLine()) != null) {
            //this ^^ is saying "update line to bufferedReader.readLine(),
                //then compare the result of the line variable to null"
            System.out.println(line);

        }

        bufferedReader.close();
        //output: (works the same as the longer version)
        // Hello
        //deleted a bunch of data for vid_3_b_I_O_reading_a_file_should_be_before_vid_2 example
    }
}
