package org.example.week2_loops_and_arrays;

import org.w3c.dom.ls.LSOutput;

public class week_2_homework_fiddling {
    public static void main(String[] args) {

        // Some example String arrays, to help test the printProgramFiles method

        String[] exampleFilenames1 = {"lab1.py", "assignment.docx", "music.mp3", "Website.cs", "Calculator.java"};
        printProgramFiles(exampleFilenames1);   // This should print lab1.py, Website.cs and Calculator.java, one per line

        String[] exampleFilenames2 = {"accounting.xlsx", "lab2.py", "Arrays.java"};
        printProgramFiles(exampleFilenames2);   // This should print lab2.py and Arrays.java, one per line
    }

    //print all the things:
    public static void printProgramFiles(String[] filenames) {
//        for (int x = 0; x < filenames.length; x++) {
//            System.out.println(filenames[x]);
//
//            //output:
//            //lab1.py
//            //assignment.docx
//            //music.mp3
//            //Website.cs
//            //Calculator.java
//            //accounting.xlsx
//            //lab2.py
//            //Arrays.java
//    }

        int numberOfFilenames = filenames.length;

        //description variable names are good! You don't need to use x for your loop counter
        for (int fileArrayElementCounter = 0; fileArrayElementCounter < numberOfFilenames; fileArrayElementCounter++) {
            //access one individual file name and then decide whether to print it or ignore it.

            //syntax variableType variableName = arrayName (positionInArray)
            //assignment statement - watch out for patterns in the syntax of your code
            String oneFilename = filenames[fileArrayElementCounter];

//            System.out.println(oneFilename);
            if (oneFilename.endsWith(".py")) {
                System.out.println(oneFilename);
            } else if (oneFilename.endsWith(".cs")) {
                System.out.println(oneFilename);
            } else if (oneFilename.endsWith(".java")) {
                System.out.println(oneFilename);
            }

        }
    }
}

