package org.example.week4_lists;

public class vid_4_array_loop_add_enhanced_for_loop {
    public static void main(String[] args) {
        String[] days = {"Mon", "Tues", "Wed", "Thurs", "Fri"};
        //days is an array
        //this loop vvv will look at each day in turn:
        //this is an enhanced for loop and won't allow you to know *where* you are
        // (or said differently: you won't be able to know what the index is if you use an enhanced "for loop")
        for (String day: days) {
            //verify that it loops through all the things in the array:
            System.out.println(day);
            //output:
            //Mon
            //Tues
            //Wed
            //Thurs
            //Fri
        }

    }
}
