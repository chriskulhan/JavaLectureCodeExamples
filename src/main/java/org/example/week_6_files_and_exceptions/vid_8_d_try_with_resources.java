/*
Try with resources: (slide 55):

Introduced in Java 7 -  so you'll see a lot of code uses the older method - plain try-catch blocks
Neater way of dealing with exceptions when you are opening a resource and close it when you are done
E.g. reading/writing a file
Reading/writing from network data
Reading/writing from a database

examples: refer to slides 57 and 58

 */

package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//started with this:
//public class vid_8_d_try_with_resources {
//    //from week 6: vid_1_files_and_exceptions_intro_writing
//
//    public static void main(String[] args) throws IOException {
//
//        FileWriter writer = new FileWriter("hello.txt");
//        BufferedWriter bufWriter =  new BufferedWriter(writer);
//
//        bufWriter.write("Hello\n"); //need to add a new line character after each
//        bufWriter.write("More data here\n");
//        bufWriter.write("Goodbye\n");
//        bufWriter.write("Second running will this overwrite?\n"); //added after running once.
//
//FileWriter writer2 = new FileWriter("hello.txt", true); //append flag -true means add to the end
//BufferedWriter bufWriter2 = new BufferedWriter(writer2);
//
//            bufWriter2.write("Hello space newLine() added below"); //need to add a new line character after each
//            bufWriter2.newLine();
//            bufWriter2.write("More data here");
//            bufWriter2.newLine();
//            bufWriter2.write("Goodbye");
//            bufWriter2.newLine();
//            bufWriter2.write("Second running will this overwrite?"); //added after running once.
//            bufWriter2.newLine();
//
//            bufWriter2.close(); //don't forget to close!
//
//    }
//}
public class vid_8_d_try_with_resources {
    //from week 6: vid_1_files_and_exceptions_intro_writing

    public static void main(String[] args) {

        try (BufferedWriter bufWriter =  new BufferedWriter(new FileWriter("hello.txt"))) {

            bufWriter.write("Hello\n"); //need to add a new line character after each
            bufWriter.write("More data here\n");
            bufWriter.write("Goodbye\n");
            bufWriter.write("Second running will this overwrite?\n"); //added after running once.

            bufWriter.close(); //don't forget

        } catch (IOException e) {
            System.out.println("Error writing to file " + e);
        }

        try (FileWriter writer2 = new FileWriter("hello.txt", true);
            BufferedWriter bufWriter2 = new BufferedWriter(writer2)) {

            bufWriter2.write("Hello space newLine() added below"); //need to add a new line character after each
            bufWriter2.newLine();
            bufWriter2.write("More data here");
            bufWriter2.newLine();
            bufWriter2.write("Goodbye");
            bufWriter2.newLine();
            bufWriter2.write("Second running will this overwrite?"); //added after running once.
            bufWriter2.newLine();

            bufWriter2.close(); //don't forget to close!
        }
        catch (IOException e) {
            System.out.println("Error appending data to file" + e);
        }

    }
}
