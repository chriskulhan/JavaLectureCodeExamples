/*Your Turn:
Start with the running schedule program you wrote at the start of the class
What if your friend wants to increase their distance by 5% every week? or 10% every week?
How does that affect the number of weeks needed?
Can you extract the weekly schedule part of the code into a method?
Use your method to calculate and display the schedules and total weeks for 1% , 5% and 10%

 //also this is NOT finished, but will be a question on the labs:
 */

package org.example.week3_methods_program_design;

public class vid_6_methods_running_schedule_revisit {
    public static void main(String[] args) {

//        my attempt: (wrong)
//        String[] distancePerWeek = {};
//        for (double runningDistance = 1.0, runningDistance <=26.2, runningDistance = runningDistance * (1.10));
//        {
//            System.out.println(distancePerWeek[runningDistance]);

        //Clara's work:
        //store data in variables, so we don't forget what the numbers mean (or what they stand for):
        double currentDistance = 1; //starting point before loop
        double targetDistance = 26.2; //max miles they want to run
        double percentIncrease = 1.10; //(increase by 10%)

        runningSchedule(currentDistance, targetDistance, percentIncrease);
    }
        public static void runningSchedule(double currentDistance, double targetDistance, double percentIncrease){

        int week = 1; //start weeks at the first week

        //loop will count the number of weeks and will do math until the marathon distance is met:
        //when talking about the problem, while or until words mean a while loop:
        while (currentDistance < targetDistance) {
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease;
            week++; //count number of weeks (alternate: week = week + 1)
        }
        System.out.println(week + " " + currentDistance);
    }
}

