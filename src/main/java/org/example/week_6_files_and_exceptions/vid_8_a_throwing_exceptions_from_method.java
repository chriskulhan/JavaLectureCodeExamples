package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class vid_8_a_throwing_exceptions_from_method {
    //code from Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week6_files_exceptions/ThrowsFromMethod.java
    public static void main(String[] args) {
        //this throws exceptions:
//        String filename = "does_not_exist.txt";
//        List<String> data = readFromFile(filename); //there is an unhandled exception here <<<
//        System.out.println(data);
//    }

        //rewrite above ^^ to below vv
        String filename = "does_not_exist.txt";    // try creating this file, or using a file that does exist

//        try {
//            List<String> data = readFromFile(filename);
//            System.out.println(data);
//        } catch (IOException e) {
//            System.out.println("Could not read from file " + filename);
//            //output: Could not read from file does_not_exist.txt
        //if you change the file to something that IS found, then the file's contents will print.
//        }
//    }
//
        //refine just above ^^ by catching more than one exception, remove the 'throws IOException' from below
        try {
            List<String> data = readFromFile(filename);
            System.out.println(data);

            //FileNotFoundException is a specific exception:
        } catch (FileNotFoundException fnfe) {
            System.out.println("The file " + filename + " was not found. Fix and try again.");

            //IOException is a general exception:
        } catch (IOException ioe) {
            System.out.println("Could not read from file " + filename);
        }
    }

    //output: The file does_not_exist.txt was not found. Fix and try again.

    //add "throws IOException" below because the issue isn't in the below method. forcing Main to deal with the problem.
    private static List<String> readFromFile(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        List<String> lines = new ArrayList<>();
        String line = bufferedReader.readLine();
        while (line != null) {
            lines.add(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        return lines;
    }
}

