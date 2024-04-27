//Your turn:
// Start a new program
//Write a program which uses the buffered classes to write out your name,
//  your favorite color, and this class's code (2545) to a new file
//Write one item per line.
//And, the same program should read all this data in and display it.


package org.example.week_6_files_and_exceptions;

import java.io.*;

import static java.nio.file.Files.write;

public class vid_3_e_your_turn_buffered_writer_program {
    public static void main(String[] args) throws IOException {

        String filename = "yourTurnClassInfo.txt";
        String name = "chris";
        String favoriteColor = "indigo";
        Integer classCode = 2545;

        FileWriter writer = new FileWriter(filename);
        BufferedWriter bufWriter =  new BufferedWriter(writer);

        bufWriter.write(name);
        bufWriter.newLine();
        bufWriter.write(favoriteColor);
        bufWriter.newLine();
        bufWriter.write(classCode + "\n"); //needs \n to convert to a string

        bufWriter.close();

//        FileReader reader = new FileReader("yourTurnClassInfo.txt");
        //can use variable, added String filename = "yourTurnClassInfo.txt" with variables above, so:
        FileReader reader = new FileReader(filename);

        BufferedReader bufferedReader = new BufferedReader(reader);

        String line = bufferedReader.readLine();
        //to process each line, print it out:

        while (line != null) {
            System.out.println(line); //have to read the first line before the loop starts
            line = bufferedReader.readLine();

        }
        bufferedReader.close();

        //what's in the file: yourTurnClassInfo.txt found in Main (JavaLectureCodeExamples):
        //chris
        //indigo
        //2545

        //output read from file yourTurnClassInfo.txt found in Main (JavaLectureCodeExamples):
        //chris
        //indigo
        //2545

    }
}
