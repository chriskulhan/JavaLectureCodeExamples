/*
Try with resources:  (slide 59)

-Use try-with-resources for file input/output
-You can also use it with database code (later)
    *Closes database connections whether there is an error, or not

-Some other types of exceptions can use this style

-If you need to catch other exceptions: use regular try-catch blocks

 */


package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class vid_9_a_code_checker_program {
    //base code from Clara: (https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week6_files_exceptions/ReadNumbersFromFile.java)
    //changed to reflect try/catch blocks
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        String filename = "numbers.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            //use try "with resources" when there is a thing that is opened and closed
            //advantage: the resource is closed for you automatically

            String line = reader.readLine();

            while (line != null) {
                // ignore anything that isn't an integer.
                try {
                    int number = Integer.parseInt(line);
                    numbers.add(number);
                } catch (NumberFormatException e) {
                    // ignore lines that are not numbers
                    System.out.println(line + " is not an integer, ignoring. ");
                }
                line = reader.readLine();
            }

            System.out.println(numbers);
        } catch (IOException e) {
            System.out.println("Error reading file " + e);
        }
    }
}




