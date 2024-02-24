/*warm up program 2- running schedule:
You have a friend who wants to run a marathon race, 26.2 miles. Currently, your friend can run 1 mile.
Your friend's plan is to try to run 10% further every week, until they can run the entire marathon distance*

So in the first week of training, they will run 1 mile; second week 1.1 miles, third week 1.21 miles…

Use a loop to calculate the distance they need to run every week until they can run the full 26.2 miles.
How many weeks until your friend can run an entire marathon?

What type of loop do you need? A for loop, or a while loop?
(Optional: Can you use string formatting to display the weekly distances to 2 decimal places?)

 */

package org.example.week3_methods_program_design;

public class vid_1_warm_up_2_running_schedule {

    //my attempt: (wrong)
//    String [] distancePerWeek = {};
//    for (double runningDistance = 1.0, runningDistance <= 26.2, runningDistance = runningDistance*(1.10)); {
//        System.out.println(distancePerWeek[runningDistance]);

    //Clara's work:

    //variables:
    double currentDistance = 1; //starting point before loop
    double targetDistance = 26.2; //max miles they want to run
    double percentIncrease = 1.10; //(increase by 10%)
    int week = 1;

    while (currentDistance < targetDistance) {
        System.out.println(week + "" + currentDistance);
        currentDistance = currentDistance * percentIncrease;
    }
}

**changes to make pushing happen
