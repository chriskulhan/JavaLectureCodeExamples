//Files and exceptions
//  **how to read and write text files?

//from PowerPoint slide 2:
//Java has lots of ways of reading and writing files:

/*
-There are several Java library classes for file input and output or I/O
-To enable you to read and write to many different types of files, and handle different circumstances
    *Do you want to read in the file byte by byte,  character by character, or line by line?
    *Are you reading, writing, appending data?
    *Are you reading/writing sequentially, or do you need random access – the ability to read from/write
        to any point in the file?
    *What type of data are you writing? Text or binary?

Today: Reading and writing text files sequentially; line-by-line (slide 3)

-Opening a text file, and starting to read at the beginning (sequentially)
-Creating a file and writing lines to the file (in order lines should appear in the file)
-Opening a file and appending data to the end of that file
-In all cases, writing text data line-by-line or reading line-by-line

Writing to a file (slide 4)

Steps for writing to a file:

1. EITHER create and open file for writing, OR open an existing file to add data
2. Write data (typically text)
3. Close the file (important!) **tell java to tell the operating system is properly saved.

Code follows… ignore Exception-related code for now

 */

package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class vid_1_files_and_exceptions_intro_writing {
    //File writing application. Create a class called Writing with this code.
    // Run your program and you should see a new file called hello.txt in the root directory
    // of your project. Double-click on it to view it in Intellij:

    public static void main(String[] args) throws IOException {
        //added "throws IOException" above

        //if file doesn't exist, will be created
        //if file DOES exist, it will be overwritten and any data in the last file will be completely lost.
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufWriter =  new BufferedWriter(writer);

        bufWriter.write("Hello\n"); //need to add a new line character after each
        bufWriter.write("More data here\n");
        bufWriter.write("Goodbye\n");
        bufWriter.write("Second running will this overwrite?\n"); //added after running once.
        //output:
        //Hello
        //More data here
        //Goodbye
        //Second running will this overwrite?

        //another way to write the above code:
        bufWriter.write("Hello space newLine() added below"); //need to add a new line character after each
        bufWriter.newLine();
        bufWriter.write("More data here");
        bufWriter.newLine();
        bufWriter.write("Goodbye");
        bufWriter.newLine();
        bufWriter.write("Second running will this overwrite?"); //added after running once.
        bufWriter.newLine();
        //output: Hello space newLine() added below
        //More data here
        //Goodbye
        //Second running will this overwrite?

        bufWriter.close(); //don't forget to close!

        //when run, won't show any output below, but there will be a file added in the root(base) directory
        // "JavaLectureCodeExamples" called hello.txt **same as listed here ^^^
        // (FileWriter writer = new FileWriter("hello.txt");)

        //in the hello.txt file:
        //Hello
        //More data here
        //Goodbye

        //what happens if you run this again? the file is overwritten
        //verify by changing

        //now in the hello.txt file:
        //Hello
        //More data here
        //Goodbye
        //Second running will this overwrite? //yes! It did!

    }
}
