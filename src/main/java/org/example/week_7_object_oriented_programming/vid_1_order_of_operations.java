/*Order of operations in vid_1_objects_pool and vid_1_swimmingPoolProgram

Created 2 java classes:

1. "vid_1_objects_pool" class:
    **in this class:
    a. made two fields/variables/instance variables:
        *   private String nameField;
        *   private double LengthField;

    b. made a method called a "constructor" (used to create or set up objects within the class)
        * vid_1_objects_pool(String nameParameter, double lengthParameter) {
        this.nameField = nameParameter;
        this.lengthField = lengthParameter;

    c. made a method called "distance for laps": (also called an instance method)
        **called instance method because another word for object is an "instance of a class"

        public double distanceForLaps (int laps){
        double total = laps * this.lengthField;
        return total;

2. "vid_1_swimmingPoolProgram" class:
    **in this class:
    a. created a new pool object called "vid_1_objects_pool" (also called an instance of this class)
        **with name ymca:
        in psvm (public static void main(String[] args) {

        vid_1_objects_pool ymca = new vid_1_objects_pool ("YMCA", 50);


    b. Calculate how far someone swims for a given number of laps:

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance is " + totalSwam);

    c. Make a new pool object called "vid_1_objects_pool" with name: como

        vid_1_objects_pool como = new vid_1_objects_pool ("Como Park", 80);

    d. use totalSwam to figure out distance swam at ymca:

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance is " + totalSwam);
            //output:
            //The total distance is 300.0

    e. figure out total distance swam at como without creating a new variable:

        System.out.println("How far did someone swim if they finished 12 laps at Como Park pool? Answer: " +
                como.distanceForLaps(12) + " meters.");
        //output:
        //How far did someone swim if they finished 12 laps at Como Park pool? Answer: 960.0 meters.

        System.out.println(como.distanceForLaps(10));
        //output:
        //800.0

 */


package org.example.week_7_object_oriented_programming;

public class vid_1_order_of_operations {
}
