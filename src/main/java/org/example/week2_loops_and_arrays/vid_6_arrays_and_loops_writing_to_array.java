package org.example.week2_loops_and_arrays;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class vid_6_arrays_and_loops_writing_to_array {
    public static void main(String[] args) {
        //powerpoint slide 49
        //example: fill a string array with data:
        //Create an array with to store 5 strings:
        String[] textbooks = new String [5];

        //Loop - repeat 5 times. Notice the loop counter variable 'number'
        //counts from 0, 1, 2, 3, - this is teh same as the array element numbers
        //so, we can sue the variable number to refer to each array element in turn

        for(int number = 0 ; number < textbooks.length ; number++) {
            //get data about one book from the user
            String bookName = stringInput ("Please enter name of textbook");

            //Using teh loop counter to write to each array element in turn
            //write the data to the array. assigning the name bookname to textbooks element number [number]
            textbooks[number] = bookName;
            System.out.println(textbooks[number]);
            System.out.println("Book number " + (number+1) + " is " + textbooks[number]);
        }
        System.out.println("Thank you: here is the data you entered");
        System.out.println(Arrays.toString(textbooks));
        //output:
        // Please enter name of textbook
        //chemistry
        //Please enter name of textbook
        //biology
        //Please enter name of textbook
        //elemental history
        //Please enter name of textbook
        //banana history
        //Please enter name of textbook
        //short version calculus
        //Thank you: here is the data you entered
        //[chemistry, biology, elemental history, banana history, short version calculus]
        //added :
        // system.out.println(textbooks[number]);
        // System.out.println("Book number " + (number+1) + " is " + textbooks[number]);
        //
        // output:
        // Please enter name of textbook
        //chemistry
        //chemistry
        //Book number 1 is chemistry
        //Please enter name of textbook
        //physics
        //physics
        //Book number 2 is physics
        //Please enter name of textbook
        //entomology
        //entomology
        //Book number 3 is entomology
        //Please enter name of textbook
        //astronomy
        //astronomy
        //Book number 4 is astronomy
        //Please enter name of textbook
        //biology
        //biology
        //Book number 5 is biology
        //Thank you: here is the data you entered
        //[chemistry, physics, entomology, astronomy, biology]

    }
}
