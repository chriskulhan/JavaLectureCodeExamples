package org.example.week_6_files_and_exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class vid_4_c_read_data_from_an_array {
    public static void main(String[] args) throws IOException {

//        String fileName = "ITEC_Classes.txt"; //make this <<< a constant by using "final" vv:
        //this won't impact the program, but will stop me from accidentally changing it:
        final String filename = "ITEC_Classes.txt";

        //Write lines to the file "ITEC 2545 Java" and "ITEC 2560 Web" etc.

        List<String> classNames = List.of("Java", "Web", "C#");
        //this ^^ is the same as, only shorter:
//        List<String> classes = new ArrayList<>();
//        classes.add("Java");
//        classes.add("Web");
//        classes.add("C#");

        List<Integer> classCodes = List.of(2545, 2560, 2505);
        //this ^^ is the same as, only shorter:
//        List<Integer> codes = new ArrayList<>();
//        codes.add(2545);
//        codes.add(2560);
//        codes.add(2505);

        //Try to write classNames to a file:
        //convert "ITEC_Classes.txt" to a variable from:
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ITEC_Classes.txt"));
        //to:
//        String fileName = "ITEC_Classes.txt"; //move this <<< to above the List ^^^way up there
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        for(int i = 0; i < classNames.size(); i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);
            bufferedWriter.write("ITEC " + code + " " + name + "\n") ;

            //same thing ^^ in a format string vv:
            bufferedWriter.write(String.format("ITEC %d %s \n", code, name));

            //to write the string output separately and then write in buffered writer:
            String outputLine = String.format("ITEC %d %s \n", code, name);
            bufferedWriter.write(outputLine);
        }

        bufferedWriter.close();

        //make a bufferedReader using the String filename:
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        //read in the lines one by one
        //save them in a new arraylist:
        //not using list.of because then it can't be changed, using ArrayList() instead:

        //new ArrayLIst:
        List<String> classDescriptions = new ArrayList<>();

        //read the first line, and then do a while loop:
        String line = bufferedReader.readLine();

        //is the line ^^ empty? if it is then we don't want to go into the while loop.
        //start the while loop with not null: (there is something in there
        while (line != null) {
            //I know there is something in "line" ^^, then add that line to the ArrayList "classDescriptions".
            classDescriptions.add(line);
            //then read the next line:
            line = bufferedReader.readLine();
            //readline will remove the \n character when its reading from a file
        }

        //after the loop runs:
        System.out.println("End of file reached");
        System.out.println(classDescriptions);
        //I have 3 copies of everything because I left all the different formats:

        //output:
        // End of file reached
        //[ITEC 2545 Java, ITEC 2545 Java , ITEC 2545 Java , ITEC 2560 Web, ITEC 2560 Web , ITEC 2560 Web ,
        // ITEC 2505 C#, ITEC 2505 C# , ITEC 2505 C# ]

    }
}

//notes: readline removes the \n character that is present in this file: ITEC_Classes.txt:
//ITEC 2545 Java
//ITEC 2545 Java
//ITEC 2545 Java
//ITEC 2560 Web
//ITEC 2560 Web
//ITEC 2560 Web
//ITEC 2505 C#
//ITEC 2505 C#
//ITEC 2505 C#

//when reading to this:
//[ITEC 2545 Java, ITEC 2545 Java , ITEC 2545 Java , ITEC 2560 Web, ITEC 2560 Web , ITEC 2560 Web ,
// ITEC 2505 C#, ITEC 2505 C# , ITEC 2505 C# ]
