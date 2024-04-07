/*

**Reading and Writing Considerations – new lines with "\n", the newline character (slide 24):

The BufferedWriter write methods do not add a newline for you
Make sure you add a \n character at the end of your lines
Or use BufferedWriter's newLine() method after each line, for example

bufWriter.newLine();   //Writes a newline character

When you read in lines with BufferedReader, it will read a line and strip off the newline character

On a PC? You may not see your newlines properly in some text editors. If not, try using "\r\n" instead of "\n" to add newlines
\r\n are the carriage return and linefeed characters; this is how PCs mark newlines
Compare to Unix-based systems - Mac and Linux - which use only \n.
Or use the newLine method to write the correct system-specific character

**Other ways of Reading and Writing (slide 25)

BufferedReader and BufferedWriter work with sequential streams of character data
They can't jump to the middle of a stream or file
Other Java classes can handle random access in a file: http://docs.oracle.com/javase/tutorial/essential/io/rafs.html
And, you'll have to use different classes if you want to work with bytes directly
http://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html

Reading and writing bytes (slide 26)

Create a Path object from a String file path
No loop, but more work to process the individual lines (see below for code:)

 */

package org.example.week_6_files_and_exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Arrays;

public class vid_4_d_3_notes_from_powerpoints {
    public static void main(String[] args) throws IOException {
        Path helloFilePath = Path.of("hello.txt");
        byte[] bytes = Files.readAllBytes((helloFilePath));
        String allLines = new String(bytes);
        System.out.println("All lines test to see changes\n" + allLines); //this is printed
        allLines = allLines.replace("\r", ""); //needed in windows, not mac or linux
        String[] lines = allLines.split("\n");
        System.out.println(Arrays.toString(lines));

        //what's in hello.txt:
        //Hello
        //deleted a bunch of data for vid_3_b_I_O_reading_a_file_should_be_before_vid_2 example

        //output that's printed:
        //All lines test to see changes
        //Hello
        //deleted a bunch of data for vid_3_b_I_O_reading_a_file_should_be_before_vid_2 example
        //[Hello, deleted a bunch of data for vid_3_b_I_O_reading_a_file_should_be_before_vid_2 example]
    }
}
