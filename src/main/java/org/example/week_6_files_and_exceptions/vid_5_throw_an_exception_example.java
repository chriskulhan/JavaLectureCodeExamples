package org.example.week_6_files_and_exceptions;

public class vid_5_throw_an_exception_example {
    public static void main(String[] args) {
        //1.
//        String hopeThisIsANumber = "5";
//
//        int number = Integer.parseInt(hopeThisIsANumber);
//        //parseInt will try to convert the string to an integer (string 5 to number 5)
//
//        System.out.println("The number is " + number);
//        //output: The number is 5

        //2.
        //What if hopeThisIsANumber is not a number?
        //what if this data is user input or from a file?
        //don't have control over what this data might be.
//        String hopeThisIsANumber = "cat";
//
//        int number = Integer.parseInt(hopeThisIsANumber);
//        //parseInt will try to convert the string to an integer (string 5 to number 5)
//
//        System.out.println("The number is " + number);
//        //output:
//        // Exception in thread "Main" java.lang.NumberFormatException: For input string: "cat"
//        //	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//        //	at java.base/java.lang.Integer.parseInt(Integer.java:661)
//        //	at java.base/java.lang.Integer.parseInt(Integer.java:777)
//        //	at org.example.week_6_files_and_exceptions.vid_5_throw_an_exception_example.Main(vid_5_throw_an_exception_example.java:16)
//        //
//        //Process finished with exit code 1

        //3.
////////////****Surround the code that might crash with a try and a catch block:

        //the line the problem happened was below this vvv, so the 'hopeThisIsANumber' can be moved out of the try/catch block;
        //this matters because then the variable 'hopeThisIsANumber' can be used in the output below:
//        String hopeThisIsANumber = "cat";
            String hopeThisIsANumber = "50";
        try {
            int number = Integer.parseInt(hopeThisIsANumber);
            //java will skip the next line if there is an error, and will go directly to the catch block
            //parseInt will try to convert the string to an integer (string 5 to number 5)

            System.out.println("The number is " + number);
            //an exception (NumberFormatException) is an object (or a variable), need to give it a name here 'e':
        } catch (NumberFormatException e) {
            System.out.println("'" + hopeThisIsANumber + "'" + " is not a valid integer string");
            //output: 'cat' is not a valid integer string
        }

        //the program doesn't crash, and this shows that:
        System.out.println("This is the end of the program.");
        //output: This is the end of the program.

    }
}
