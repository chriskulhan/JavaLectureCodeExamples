package org.example.week2_loops_and_arrays;

public class vid_4_how_long_is_an_array {
    public static void main(String[] args) {
        //create a string array, initialized with data:
        String[] classrooms = {"T3010", "T3020", "T3030", "T3040", "T3050", "T3080" };

        //how many elements in the array? What's the size - or length - of the array?
        int numberOfClassrooms = classrooms.length;

        System.out.println("There are " + numberOfClassrooms + " classrooms");
        //output: There are 6 classrooms
    }
}
