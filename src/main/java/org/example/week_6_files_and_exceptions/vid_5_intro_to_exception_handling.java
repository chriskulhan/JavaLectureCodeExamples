/*
Error Handling:
-An Exception is Java's way of telling you that there is an error that stops the program continuing
-Programs throw exceptions when there is an error
-Exceptions are objects
-There are lots of different types of Exceptions

-When your code throws an exception, it crashes
-If it's a problem with your code, troubleshoot and fix the error
-Not initializing a variable = NullPointerException
-Reading a non-existent index = ArrayIndexOutOfBounds, IndexOutOfBounds
-Modifying an ArrayList inside an enhanced for loop = ConcurrentModificationException

-What if it's a problem outside your code? Like a file not found?
-You catch that exception, and do something to deal with the error condition

//prepare in case a file will throw an exception:
-Use try and catch blocks
-try block contains code that might throw an exception
-catch block contains code that can attempt to deal with the exception and allow the program to continue running
    -or quit the program safely
    -and/or log the error message for debugging
    -and/or notify the user that something has gone wrong

 */

package org.example.week_6_files_and_exceptions;

public class vid_5_intro_to_exception_handling {
    public static void main(String[] args) {
//        slide 29: (purposely contains an error:)

//        String[] names = { "Andy", "Ben", "Cody"} ;
//        for (int i = 0 ; i <= 3 ; i++) { //the error is on this line. The i<=3 is always true, change to names.length belowVVV
//            System.out.println(names[i]);
//        }
        //This code generates an
        //ArrayIndexOutOfBoundsException
        //Click on the link in the exception message to jump to the line that caused the exception

        //the fix to the error:
        String[] names = { "Andy", "Ben", "Cody"} ;
        for (int i = 0 ; i < names.length ; i++) {
            System.out.println(names[i]);
            //output:
            //Andy
            //Ben
            //Cody
        }
//        String name;
//forgot to write code to initialize this
//String. Its value is null

//Try to call a method on this String...
//        int characters = name.length();
//a NullPointerException is thrown because the variable "name" is null, fix it by making sure the variable isn't null

    }
}
