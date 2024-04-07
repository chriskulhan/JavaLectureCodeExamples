package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_8_c_new_way_to_close {

    public static void main(String[] args) {

        //from: week 6 vid_6_c_handling_exceptions
        //then from: vid_8_b_questions_about_exceptions

        //create BufferedReader right after the try block:
        //try with resources. The resources is buffered reader that is reading a file
        //think of it as JUST the file:
        try (BufferedReader bufReader = new BufferedReader(new FileReader("test.txt"));) {

            String line = bufReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufReader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Sorry, error or we can't find this file." + e);

        }
    }
}
//Sorry, error or we can't find this file.java.io.FileNotFoundException: test.txt (No such file or directory)