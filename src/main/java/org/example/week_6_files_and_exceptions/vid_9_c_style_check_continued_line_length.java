package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_9_c_style_check_continued_line_length {
    public static void main(String[] args){
        //1. Read in the file from JavaLectureCodeExamples (vid_4_d_1_your_turn_loop_example_months.java)

        String filename = "vid_4_d_1_your_turn_loop_example_months.java";
        //3a. add variable here to check how long the lines are:
        int maxLineLength = 75;
        //checked at 100 length, there was nothing
        //checked at 75 length and there were 3 lines that were too long.

        try (BufferedReader reader = new BufferedReader(new FileReader("vid_4_d_1_your_turn_loop_example_months.java"))) {

            String line = reader.readLine();

            //create a variable that's a line counter:
            int lineCounter = 1;

            while(line != null) {
                //3b. check how long the maxLineLength is and only print if it's too long:
                if (line.length() > maxLineLength) {
                    System.out.println("The line " + lineCounter + " is too long. ");
                    System.out.println(line);
                }
                //update the line within the loop by adding this line:
                line = reader.readLine();
                //part of the line counter: to increase the line number variable with each loop
                lineCounter ++;
            }

        } catch (IOException e) {
            System.out.println("Error reading file " + filename + " because " + e);
        }
    }
}
///Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=58442:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/chriskulhanek/IdeaProjects/JavaLectureCodeExamples/target/classes:/Users/chriskulhanek/.m2/repository/edu/minneapolis/input-utils/1.0.2/input-utils-1.0.2.jar org.example.week_6_files_and_exceptions.vid_9_c_style_check_continued_line_length
//The line 9 is too long.
////OR: Modify the task list program you wrote in the Lists class to write your task list to a files
//The line 28 is too long.
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
//The line 31 is too long.
//        //note: months.length doesn't have parentheses: months.length() <<<NOPE see:
//
//Process finished with exit code 0