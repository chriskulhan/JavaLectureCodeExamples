//-Various ways to read a file (//from PowerPoint slide 16)
//  By lines, characters, bytes?
//  Sequential or random access?
//-Simplest to read line-by-line from the beginning to the end

//-Use a BufferedReader to "wrap" a FileReader
//-FileReader handles opening and closing the file, and can reading a file character-by-character
//-BufferedReader provides a 'readLine' method to collect all the characters from one line, put them together
// into a String, and then return the String to your program

//Questions for reading a file (PowerPoint slide 17)
// - how many lines does the file have? How do you know you have reached the end of the file?
//Answer: you don't know how many lines you have. There's no simple way to count - you must read the whole file to find out

//BufferedReader's readLine() method reads one line and returns it as a String.
// And, it prepares to read the next line of the file.
//But, when BufferedReader gets to the end of the file, there are no more lines to read
// - so readLine will return null
//So to read an entire file, use a while loop that repeats while readLine() != null

//Remember null = special value that means 'no data'. Same as None in Python

package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_3_a_I_O_reading_a_file_should_be_before_vid_2 {
    //create a new file to read the hello.txt file we created earlier:
    public static void main(String[] args) throws IOException {
        //need to add "throws IOException to PSVM above ^^
        FileReader reader = new FileReader("hello.txt");
        //this file was written earlier ^^^
        BufferedReader bufferedReader = new BufferedReader(reader);
        //BufferedReader is going to work with the file reader to gather together a line of characters,
        //collect that line into a string, and then provide that string to our program

        //begin by reading lines one at a time:
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());
        System.out.println(bufferedReader.readLine());

        bufferedReader.close();
        //output: (this is what is in hello.txt)
        //Hello
        //More data here
        //Goodbye
        //Second running will this overwrite?
        //Hello space newLine() added below
        //More data here
        //Goodbye
        //Second running will this overwrite?
        //null //this is null because there are only 8 lines of data in hello.txt
        //and I asked this to read 9 lines ^^ (System.out.println(bufferedReader.readLine());)
    }
}
