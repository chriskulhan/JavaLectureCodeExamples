package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class vid_4_b_reading_and_writing_arrays {
    public static void main(String[] args) throws IOException {

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
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ITEC_Classes.txt"));


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
        //overwrites file ITEC_Classes.txt in JavaLectureCodeExamples:
        //ITEC 2545 Java
        //ITEC 2560 Web
        //ITEC 2505 C#

        //when added the format string the overwriting in ITEC_Classes.txt in JavaLectureCodeExamples:
        //because a loop:
        //ITEC 2545 Java
        //ITEC 2545 Java
        //ITEC 2560 Web
        //ITEC 2560 Web
        //ITEC 2505 C#
        //ITEC 2505 C#

        //when added String outputLine:
        //ITEC 2545 Java
        //ITEC 2545 Java
        //ITEC 2545 Java
        //ITEC 2560 Web
        //ITEC 2560 Web
        //ITEC 2560 Web
        //ITEC 2505 C#
        //ITEC 2505 C#
        //ITEC 2505 C#


    }
}
