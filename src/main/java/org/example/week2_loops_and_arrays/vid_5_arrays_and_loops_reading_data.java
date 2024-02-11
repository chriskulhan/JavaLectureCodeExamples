package org.example.week2_loops_and_arrays;

public class vid_5_arrays_and_loops_reading_data {
    public static void main(String[] args) {
        //create a string array, initialized with data:
        String[] classrooms = {"T3010", "T3020", "T3030", "T3040", "T3050", "T3080"};

    //use a loop to print all of the data from the array
    //notice how the loop counter is used
    for(int x = 0 ; x < 6 ; x ++) {
        System.out.println(classrooms[x]);
        //output:
        //T3010
        //T3020
        //T3030
        //T3040
        //T3050
        //T3080
    }

    }
}