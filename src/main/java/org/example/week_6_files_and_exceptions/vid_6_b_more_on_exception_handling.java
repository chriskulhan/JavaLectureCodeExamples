package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class vid_6_b_more_on_exception_handling {

    //what the code looks like before adding try and catch:
    //numbers.txt looked like this:

    //67
    //65
    //84
    //
    //cat

//    public static void Main(String[] args) throws IOException {
//        List<Integer> numbers = new ArrayList<>();
//        String filename = "number.txt";
//
//        BufferedReader reader = new BufferedReader((new FileReader(filename)));
//
//        String line = reader.readLine();
//
//        while(line != null) {
//            int number = Integer.parseInt(line);
//            //parseInt converts string to a number
//            numbers.add(number);
//            line = reader.readLine(); //this line is important
//        }
//        System.out.println(numbers);
//        //output: [67, 65, 84] when the file was all in the correct format
    //output with errors when numbers.txt looked like this:
    //
//67
//65
//84
//
//cat

    //output:
    ///Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55148:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/chriskulhanek/IdeaProjects/JavaLectureCodeExamples/target/classes:/Users/chriskulhanek/.m2/repository/edu/minneapolis/input-utils/1.0.2/input-utils-1.0.2.jar org.example.week_6_files_and_exceptions.vid_6_b_more_on_exception_handling
    //Exception in thread "Main" java.lang.NumberFormatException: For input string: ""
    //	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
    //	at java.base/java.lang.Integer.parseInt(Integer.java:671)
    //	at java.base/java.lang.Integer.parseInt(Integer.java:777)
    //	at org.example.week_6_files_and_exceptions.vid_6_b_more_on_exception_handling.Main(vid_6_b_more_on_exception_handling.java:20)
    //
    //Process finished with exit code 1

//    }
    //NOW to add try and catch:
        public static void main(String[] args) throws IOException {
            List<Integer> numbers = new ArrayList<>();
            String filename = "number.txt";

            BufferedReader reader = new BufferedReader((new FileReader(filename)));

            String line = reader.readLine();

            while(line != null) {
                //ignore anything that isn't an integer:
                try {
                    int number = Integer.parseInt(line);
                    //parseInt converts string to a number
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    //ignore:
                    System.out.println(line + " is not an integer and will be ignored.");
                    //you have to do something in this catch place, or else might hide errors
                }
                line = reader.readLine(); //this line is important
        }
            System.out.println(numbers);
            //output:
            // is not an integer and will be ignored.
            //cat is not an integer and will be ignored.
            //[67, 65, 84]
    }

}
