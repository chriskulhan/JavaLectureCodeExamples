package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class vid_2_d_writing_variables_to_a_file {
    public static void main(String[] args) throws Exception{
        int classCode = 2545;
        double averageEnrollment = 22.16; //average number of students in a semester
        String className = "Java";

        //write the above to a file:
        FileWriter writer = new FileWriter("java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

//        bufferedWriter.write(classCode + "\n");
//        bufferedWriter.write("The class code is" + classCode + "\n");
//        bufferedWriter.newLine();

//        bufferedWriter.write(averageEnrollment + "\n");
        //format strings can be used:
//        bufferedWriter.write("The average enrollment is " + averageEnrollment + "students.\n");

//        bufferedWriter.newLine();
//        bufferedWriter.write(className + "\n");
//        bufferedWriter.write("The classname is " + className + ". \n");

        //variables don't have to be written in the order you create them:
        bufferedWriter.write("The classname is " + className + ". \n");
        bufferedWriter.write("The average enrollment is " + averageEnrollment + " students.\n");
        bufferedWriter.write("The class code is " + classCode + "\n");

//        writer.close(); //can also use this to close the file
        bufferedWriter.close(); //can call this and will close writer as well.

        //output: written to java.txt
        //2545
        //22.16
        //Java

        //output written to java.txt with additions:
        //2545
        //22.16
        //Java
        //The classname is Java.
        //The average enrollment is 22.16students.
        //The class code is2545

        //output overwritten to java.txt with changes:
        //
        // The classname is Java.
        //The average enrollment is 22.16 students.
        //The class code is 2545
    }
}
