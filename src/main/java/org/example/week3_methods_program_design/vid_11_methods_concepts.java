/* Methods concepts

    -We can call other methods for our programs
        *enables us to use code written by other people
    -We can write and call our own methods
        * our own program, or other programs, could use these methods

 */


package org.example.week3_methods_program_design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;
public class vid_11_methods_concepts {
    public static void main(String[] args) {
    //stringInput is the method name
    //It has one argument, a String
    //It returns another String
    String name = stringInput("Enter your name:");
    //input: 'Chris' is stored in "name", so the "stringInput(xx)" will be replaced with whatever is input:
        //think of it like: 'String name = Chris'

    String question = "Enter your favorite color: ";
    String favoriteColor = stringInput(question);

    int number = intInput ("Enter the number of books to order:");

    //println is a method, too
        //this is a statement, asking the program to do something
        //println doesn't return anything so we don't use it in an assignment statement
        //What's the "System.out" part? 'out' is the name of an object that defines the println
        //so 'out' knows how to print things. There's a 'System' class that stores the 'out' object

        System.out.println("The number is " + number); //this is a basic statement, do something, but don't change values

        //A method can belong to the same class as you are writing code in,
        //so you can call them directly
        //Other methods belong to a different class, for example the 'of' method belongs to the List class
        List<String> languages = List.of("Java", "C#", "Rust");

        //Other methods belong to objects of a class
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(4);

        Collections.sort(numbers);

        String example = "abc";
        int lengthOfString = example.length(); //calling the 'length' method for the string named 'example'

        //input/output:
        //Enter your name:
        //chris
        //Enter your favorite color:
        //indigo
        //Enter the number of books to order:
        //4
        //The number is 4
}
}

