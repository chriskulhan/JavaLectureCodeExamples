package org.example.week2_loops_and_arrays;

public class vid_2_your_turn_print_numbers {
    public static void main(String[] args) {
        //write a loop that prints the numbers 1, 2, 3, 4, 5
        for (int num = 1;  num < 6; num++) {
            System.out.println(num);
            //output:
            //1
            //2
            //3
            //4
            //5
        }
        //Write a loop that prints the NASA rocket countdown: the numbers 10, 9, 8, ...  to 0
        for (int countdown = 10; countdown > -1; countdown--) {
            System.out.println(countdown);
            //output:
            //10
            //9
            //8
            //7
            //6
            //5
            //4
            //3
            //2
            //1
            //0
        }
        //You just bought a used car that has 150,000 miles. You plan on getting an oil change
        // every 3,000 miles. Use a loop to calculate and print the mileages for the
        // next 8 oil changes (153000, 158000, 161000)

        //didn't work:
//        for (int x = 150000 ; x < 8 ; x = x + 3000){
//            System.out.println(x);

        //Clara's solution:
        int mileage = 150000;
        int interval = 3000;

        for (int oilChange = 0 ; oilChange < 8; oilChange++){
            mileage = mileage + interval;
            System.out.println("Get oil change at " + mileage + " miles");
            //output:
            //Get oil change at 153000 miles
            //Get oil change at 156000 miles
            //Get oil change at 159000 miles
            //Get oil change at 162000 miles
            //Get oil change at 165000 miles
            //Get oil change at 168000 miles
            //Get oil change at 171000 miles
            //Get oil change at 174000 miles
        }
        int mileage2 = 150000;
        int interval2 = 3000;

        for (int miles = mileage2; miles <(mileage2 + 8 * interval2); miles +=interval2) {
            System.out.println("Get oil change another way at " + miles + " miles");
            //not quite right, but this is the solution in Clara's video:
            //output:
            //Get oil change another way at 150000 miles
            //Get oil change another way at 153000 miles
            //Get oil change another way at 156000 miles
            //Get oil change another way at 159000 miles
            //Get oil change another way at 162000 miles
            //Get oil change another way at 165000 miles
            //Get oil change another way at 168000 miles
            //Get oil change another way at 171000 miles
        }
    }
}
