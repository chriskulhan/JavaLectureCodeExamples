package org.example.week2_loops_and_arrays;

public class vid_6_add_all_numbers_in_array {
    //from clara data: week2_loops_arrays, SumArray
    public static void main(String[] args) {
        // Create an example double array to store 3 numbers
        double numbers[] = new double[3];

        // Add some example test data
        numbers[0] = 45.234256;
        numbers[1] = -123945.22;
        numbers[2] = 0.0000003;

        // When adding up data, need a start point - adding up all the values starts at 0.

        double sum = 0.0;

        // Loop over the array, and add each value to the sum variable
        for (int x = 0 ; x < numbers.length ; x++) {
            sum = sum + numbers[x];
        }

        System.out.println("Total of numbers = " + sum);
    }

}
