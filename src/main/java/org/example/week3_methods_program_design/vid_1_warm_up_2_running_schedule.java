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
    public static void main(String[] args) {

//        my attempt: (wrong)
//        String[] distancePerWeek = {};
//        for (double runningDistance = 1.0, runningDistance <=26.2, runningDistance = runningDistance * (1.10));
//        {
//            System.out.println(distancePerWeek[runningDistance]);

            //Clara's work:
        //store data in variables, so we don't forget what the numbers are:
        double currentDistance = 1; //starting point before loop
        double targetDistance = 26.2; //max miles they want to run
        double percentIncrease = 1.10; //(increase by 10%)
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
//output: 1 1.0
//2 1.1
//3 1.2100000000000002
//4 1.3310000000000004
//5 1.4641000000000006
//6 1.6105100000000008
//7 1.771561000000001
//8 1.9487171000000014
//9 2.1435888100000016
//10 2.357947691000002
//11 2.5937424601000023
//12 2.853116706110003
//13 3.1384283767210035
//14 3.4522712143931042
//15 3.797498335832415
//16 4.177248169415656
//17 4.594972986357222
//18 5.054470284992944
//19 5.559917313492239
//20 6.115909044841463
//21 6.72749994932561
//22 7.400249944258172
//23 8.140274938683989
//24 8.954302432552389
//25 9.849732675807628
//26 10.834705943388391
//27 11.91817653772723
//28 13.109994191499954
//29 14.420993610649951
//30 15.863092971714948
//31 17.449402268886445
//32 19.19434249577509
//33 21.1137767453526
//34 23.22515441988786
//35 25.54766986187665
//36 28.102436848064315


