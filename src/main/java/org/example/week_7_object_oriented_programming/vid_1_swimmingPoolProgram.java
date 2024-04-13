package org.example.week_7_object_oriented_programming;

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

        double totalSwam = ymca.distanceForLaps(6);
        System.out.println("The total distance is " + totalSwam);

        //***output in the "Run" place:
            //The total distance is 300.0

        //***output in the "Build Output" place:

        //Executing pre-compile tasks…
        //Running 'before' tasks
        //Checking sources
        //Copying resources... [JavaLectureCodeExamples]
        //Checking dependencies… [JavaLectureCodeExamples]
        //Dependency analysis found 0 affected files
        //Updating dependency information… [JavaLectureCodeExamples]
        //Parsing java… [JavaLectureCodeExamples]
        //Writing classes… [JavaLectureCodeExamples]
        //Dependency analysis found 0 affected files
        //Adding nullability assertions… [JavaLectureCodeExamples]
        //Adding pattern assertions… [JavaLectureCodeExamples]
        //Running 'after' tasks
        //javac 21.0.1 was used to compile java sources
        //Finished, saving caches…
        //Executing post-compile tasks…
        //Synchronizing output directories…
        //4/13/24, 10:40 AM - Build completed successfully in 3 sec, 655 ms

        //make another  "vid_1_objects_pool" object:

        vid_1_objects_pool como = new vid_1_objects_pool ("Como Park", 80);
        //total distance if someone swam 12 laps:
        System.out.println("How far did someone swim if they finished 12 laps at Como Park pool? Answer: " +
                como.distanceForLaps(12) + " meters.");
        //output: How far did someone swim if they finished 12 laps at Como Park pool? Answer: 960.0 meters.

        System.out.println(como.distanceForLaps(10));
        //output: 800.0


    }
}
