package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class vid_2_e_writing_numbers {
    public static void main(String[] args) throws IOException{

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        FileWriter writer = new FileWriter("number.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(data1);
        bufferedWriter.write(data2);
        bufferedWriter.write(data3);

        //written to number.txt:
        //CAT
        //because unicode

        //so you don't get unicode you have to append a new line after the data:
        bufferedWriter.newLine();
        bufferedWriter.write(data1 +"\n");
        bufferedWriter.write(data2 +"\n");
        bufferedWriter.write(data3 +"\n");
        //written to number.txt:
        //67
        //65
        //84

//        bufferedWriter.write(number); // there is no write method that calls a double, this won't work

        bufferedWriter.write(number + "\n");
        //written to number.txt:
        //12.34

        bufferedWriter.write("testing out different ways to input integers with Integer.toString:");
        bufferedWriter.newLine();
        //also could use Integer.toString(data1);
        bufferedWriter.write(Integer.toString(data1) + "\n");
        bufferedWriter.write(Integer.toString(data1));
        bufferedWriter.newLine();
        bufferedWriter.write(data1 + "");
        bufferedWriter.newLine();

        //written to number.txt:
        //testing out different ways to input integers with Integer.toString:
        //67
        //67
        //67

        bufferedWriter.write("test"); //write a string
        //written to number.txt:
        //test

        //there are two different forms of the write method
        //when you type an integer, bufferedWriter.write interprets it as a unicode value,
        //  so 67 in unicode is 'C', 65 is 'A', 84 is 'T'.

        //unicode reference: https://en.wikipedia.org/wiki/List_of_Unicode_characters

        bufferedWriter.close();

        //written to number.txt:
        //CAT
        //67
        //65
        //84
        //12.34
        //test

    }
}
