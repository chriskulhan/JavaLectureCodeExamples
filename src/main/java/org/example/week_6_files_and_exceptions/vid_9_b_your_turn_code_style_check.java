/*
Your Turn – Code Style Check

-Read another Java file into your program
-For example, a file you worked on in a lab
-Check the length of every line – are any lines longer than 100 characters?
-If there are any lines longer than 100 characters, print a message with the line
    text, and line number
-https://google.github.io/styleguide/javaguide.html
-Use try-with-resources exception handling

 */

package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_9_b_your_turn_code_style_check {
    //made a copy of vid_4_d_1_your_turn_loop_example_months.java and saved it to the
    //root directory (JavaLectureCodeExamples)

//1. how to set up the try/catch block:


//      public static void main(String[] args) throws IOException {
//          //1. Read in the file from JavaLectureCodeExamples (vid_4_d_1_your_turn_loop_example_months.java)
//
//          String filename = "vid_4_d_1_your_turn_loop_example_months.java";
//
//          try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//              //read the file:
//
//
//          } catch (IOException e) {
//              System.out.println("Error reading file " + filename + " because " + e);
//          }
//      }
//}

    //2. continue, adding to the try block:
    //2a. read the file
    public static void main(String[] args){
        //1. Read in the file from JavaLectureCodeExamples (vid_4_d_1_your_turn_loop_example_months.java)

        String filename = "vid_4_d_1_your_turn_loop_example_months.java";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            //read the file:

        //2b.
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                //update the line within the loop by adding this line:
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error reading file " + filename + " because " + e);
        }
    }
}

//output: (reads in the entire file correctly: and it's just text)
// /Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=58359:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/chriskulhanek/IdeaProjects/JavaLectureCodeExamples/target/classes:/Users/chriskulhanek/.m2/repository/edu/minneapolis/input-utils/1.0.2/input-utils-1.0.2.jar org.example.week_6_files_and_exceptions.vid_9_b_your_turn_code_style_check
////your turn: (slide 23)
////
//// Use a loop to write each item in this example array to a file
////
////String[] months = { "Jan", "Feb", "Mar" };
////
////Write one item per line
////
////OR: Modify the task list program you wrote in the Lists class to write your task list to a files
////
////Question: can you read a file into an array? Why or why not?
//
//package org.example.week_6_files_and_exceptions;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class vid_4_d_1_your_turn_loop_example_months {
//
//    public static void main(String[] args) throws Exception {
//
//        String filename = "vid_4_d_months.txt";
//
//        //added April so I know the data is re-written:
//        String[] months = { "Jan", "Feb", "Mar", "April" };
//
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
//
//        //classic for loop:
//        //note: months.length doesn't have parentheses: months.length() <<<NOPE see:
//        for (int i = 0; i < months.length; i++) {
//            String month = months[i];
//            bufferedWriter.write(month + "\n");
//        }
//        bufferedWriter.close();
//
//        //found in file:
//        //Jan
//        //Feb
//        //Mar
//        //April
//    }
//}
//
//Process finished with exit code 0
