package org.example.week2_loops_and_arrays;

public class vid_2_January_day_loop {
    public static void main(String[] args) {
        System.out.println("Here are all the dates in January");
        for (int day = 1; day <= 31; day++) {
            System.out.println("January " + day);
            //output:
            //Here are all the dates in January
            //January 1
            //January 2
            //January 3
            //January 4
            //January 5
            //January 6
            //January 7
            //January 8
            //January 9
            //January 10
            //January 11
            //January 12
            //January 13
            //January 14
            //January 15
            //January 16
            //January 17
            //January 18
            //January 19
            //January 20
            //January 21
            //January 22
            //January 23
            //January 24
            //January 25
            //January 26
            //January 27
            //January 28
            //January 29
            //January 30
            //January 31
        }

// question: can you add 'st' to 1, 'nd' to 2, 'rd' to 3, 'th' to 4,5,6,7,8,9
        {
            System.out.println("Here are all the dates in January");
            for (int day = 1; day <= 31; day++) {
                if (day == 1 || day == 21 || day == 31) {
                    System.out.println("January " + day + "st");
                } else if (day == 2 || day == 22) {
                    System.out.println("January " + day + "nd");
                } else if (day == 3 || day == 23) {
                    System.out.println("January " + day + "rd");
                } else {
                    System.out.println("January " + day + "th");
                    //output:
                    // Here are all the dates in January
                    //January 1st
                    //January 2nd
                    //January 3rd
                    //January 4th
                    //January 5th
                    //January 6th
                    //January 7th
                    //January 8th
                    //January 9th
                    //January 10th
                    //January 11th
                    //January 12th
                    //January 13th
                    //January 14th
                    //January 15th
                    //January 16th
                    //January 17th
                    //January 18th
                    //January 19th
                    //January 20th
                    //January 21st
                    //January 22nd
                    //January 23rd
                    //January 24th
                    //January 25th
                    //January 26th
                    //January 27th
                    //January 28th
                    //January 29th
                    //January 30th
                    //January 31st
                }
            }
        }
    }
}