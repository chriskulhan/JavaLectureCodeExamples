package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class vid_4_a_reading_and_writing_arrays_and_arraylists {
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

        //write each class name on an individual line:
        for(String name: classNames) {
            bufferedWriter.write(name + "\n") ;
        }

        bufferedWriter.close();
        //appeared in file ITEC_Classes.txt in JavaLectureCodeExamples:
        //Java
        //Web
        //C#
    }
}
