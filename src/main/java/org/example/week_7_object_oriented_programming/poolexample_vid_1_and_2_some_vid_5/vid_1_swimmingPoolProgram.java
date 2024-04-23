package org.example.week_7_object_oriented_programming.poolexample_vid_1_and_2_some_vid_5;

public class vid_1_swimmingPoolProgram {
    public static void main(String[] args) {
        //make a new object for the class we just created
        vid_1_objects_pool ymca = new vid_1_objects_pool ("YMCA", 50);
                //hover over vid_1_objects_pool just above, and you can see the two parameters that are needed
                // created new pool with name "YMCA" and length 50. ^^Just above
        //swimmer has gone to the YMCA and wants to know how far they swam if they swam 6 laps:

        //double is the return value, totalSwam is the name
        //ymca is the "vid_1_objects_pool" object defined by that class
        //distanceForLaps is the method defined in "vid_1_objects_pool" that will do the math for us

        //added after watching video 5 and changing the pool object to public

//        ymca.nameField = "ymca"; //this isn't allowed
        //will need to make getter and setter methods in vid_1_objects_pool that can
        // restrict the info that is available
        //so, if I wanted to change the name of ymca, now that there are getter and setter methods:
        ymca.setNameField("Minneapolis YMCA"); //this is how to access the name now.
        //run this and see what if the new name shows up: (it does!)
        //some of the output:
        // Minneapolis YMCA pool is 50.0 meters long.

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance is " + totalSwam);

        //***output in the "Run" place:
            //The total distance is 300.0

        //make another  "vid_1_objects_pool" object:

        vid_1_objects_pool como = new vid_1_objects_pool ("Como Park", 80);
        //total distance if someone swam 12 laps:
        System.out.println("How far did someone swim if they finished 12 laps at Como Park pool? Answer: " +
                como.distanceForLaps(12) + " meters.");
        //output: How far did someone swim if they finished 12 laps at Como Park pool? Answer: 960.0 meters.

        System.out.println(como.distanceForLaps(10));
        //output: 800.0

        //todone (vid_2_your_turn) create a new pool with name "Edina", length 50;
        vid_1_objects_pool edina = new vid_1_objects_pool ("Edina", 50);

        //todone (vid_2_your_turn) What's the total distance for swimming 12 laps in the Edina pool?
        System.out.println("What's the total distance for swimming 12 laps in the Edina pool? Answer: " +
                edina.distanceForLaps(12) + " meters. ");
        //output: What's the total distance for swimming 12 laps in the edina pool? Answer: 600.0 meters.

        //todone (vid_2_your_turn) print Edina pool info:
        System.out.println(edina);
        //output: edina pool is 50.0 meters long.


//        System.out.println(como);
        //output: org.example.week_7_object_oriented_programming.poolexample.vid_1_objects_pool@5674cd4d
        //why? telling us what type of object it is, but the memory address (@5674cd4d) isn't very useful
        //in order to make this better, make a toString(); instance method in vid_1_objects_pool to

        //rerun after adding this "toString" instance method in vid_1_objects_pool:
            //public String toString() {
        //        String description = this.nameField + " pool is " + lengthField + " meters long.";
        //        return description;

        System.out.println(como);
        //output: Como Park pool is 80.0 meters long.
        //this is the string from the toString method ^^^

        //see what this might look like for ymca:
        System.out.println(ymca);
        //output: YMCA pool is 50.0 meters long.
        //this has used the toString instance method in vid_1_objects_pool to make this string ^^^



    }
}
