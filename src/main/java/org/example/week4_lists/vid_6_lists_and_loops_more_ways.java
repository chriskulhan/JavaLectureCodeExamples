/*
Counting copies of items in a list: (slide 45)

-Create a list of internet speeds for every hour in a 12-hour period
-Print the speeds using a regular for loop, to access the index as well as the data
-How many times was the speed 0?

 */

package org.example.week4_lists;


import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class vid_6_lists_and_loops_more_ways {
    public static void main(String[] args) {

        List<Double> speeds = new ArrayList<>();

        int totalHours = 12;

        //regular for loop: (to gather data)
        for (int hour = 0; hour < totalHours; hour++) {
            double speed = positiveDoubleInput("Enter the internet speed for hour " + hour);
            speeds.add(speed);
        }
        //print out all the speeds:
        System.out.println("All the speeds are:");

        //regular for loop: (because want to print the hour as well as the data:
        for (int hour = 0; hour < speeds.size(); hour++) {
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d Speed %.2f\n", hour, speed);
        }
        //count the number of times the speed was 0 (or where the internet went down)

        //enhanced for loop: (counting the number of times the speed was equal to zero:
        int zeroCount = 0;
        for(double speed: speeds) {
            if (speed == 0) {
                zeroCount++;
            }
        }
        System.out.println("Number of times speed was 0 (no connection) : " + zeroCount);

        //Remove all zeros
        while (speeds.contains(0.0)) {
            speeds.remove (0.0);
        }
        //Questions:
        //why remove 0.0 instead of 0?
        // (my answer: because it's a double, not int?)

        //why is a while loop used instead of a for loop?
        //(my answer: while will only trigger when the thing is happening (speed =0), so less code)

        System.out.println(speeds);

        //Find the average of all the speeds:
        double total = 0;
        for (double speed: speeds) {
            total = total + speed;
        }
        double average = total / speeds.size ();

        System.out.println("The average speed is " + average);
    }
}

//input/output:
//Enter the internet speed for hour 0
//5
//Enter the internet speed for hour 1
//6
//Enter the internet speed for hour 2
//7
//Enter the internet speed for hour 3
//0
//Enter the internet speed for hour 4
//0
//Enter the internet speed for hour 5
//0
//Enter the internet speed for hour 6
//6
//Enter the internet speed for hour 7
//7
//Enter the internet speed for hour 8
//8
//Enter the internet speed for hour 9
//9
//Enter the internet speed for hour 10
//0
//Enter the internet speed for hour 11
//
//Error - please enter a positive number.
//Enter the internet speed for hour 11
//4
//All the speeds are:
//Hour: 0 Speed 5.00
//Hour: 1 Speed 6.00
//Hour: 2 Speed 7.00
//Hour: 3 Speed 0.00
//Hour: 4 Speed 0.00
//Hour: 5 Speed 0.00
//Hour: 6 Speed 6.00
//Hour: 7 Speed 7.00
//Hour: 8 Speed 8.00
//Hour: 9 Speed 9.00
//Hour: 10 Speed 0.00
//Hour: 11 Speed 4.00
//Number of times speed was 0 (no connection) : 4
//[5.0, 6.0, 7.0, 6.0, 7.0, 8.0, 9.0, 4.0]
//The average speed is 6.5