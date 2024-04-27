package org.example.week_7_object_oriented_programming;

public class week_7_all_notes {
}
/*
***** vid_1_objects_pool
///* notes:
// ***A Java Object: (slide 2)
//
//-Is made from a class definition
//-It contains data (in variables aka fields)
//
//AND/OR
//
//It can do things (with methods)
//
//For example: (slide 3)
//A Java ArrayList object contains data – the list elements
//A Java ArrayList can also do things – add a new element, delete an element, tell us it's size…
//
// List<String> animals = new ArrayList<String>();
// animals.add("cat");
// animals.add("fish");
// animals.remove(0);
// int numberOfAnimals = animals.size();
//
//***Objects are made from a class definition (slide 4)
//
//Java already has a class definition for the ArrayList class
//And many other classes too, such as the ones you've used to create Hashmap and FileReader objects
//
//One class definition can be used to make one object, or many objects
//Think of a class definition as a blueprint, a set of instructions
//The objects are built from these blueprints/instructions
//
//***You can create your own class definitions (slide 5)
//
// Write one class definition
//  -Describe what an object can do – write methods in the class
//  -Describe what data the object stores – declare variables (also known as field) in the class
//
//Use that class definition to create and use objects in your program
//*
//* ****Principles of Object-Oriented Programming (slide 6)
//
//-Object modeling (what data or methods should go here? )
//-Encapsulation - keeping data together
//-Abstraction - putting details in one place and then not having to worry about the detail to use the code
//
//-Focusing each class on one task -
//    **_single responsibility principle_**
//*   (write a class that can do one thing it can do well)
//
// */
//
////Swimming pools example:
//
////A swimming pool has a name
////And, it has a length
////A swimmer who swims 10 laps at a 50-meter pool,
////  has swum a different distance to a swimmer who swims 10 laps at a 25-meter pool
//
//
////write a program to create a swimming pool class
//    //then make swimming pool objects
//
//package org.example.week_7_object_oriented_programming.poolexample;
//
//public class vid_1_objects_pool {
//
//    //this class has a name and a length
//    //make a field/variable (same thing) to store those two variables:
//    //use this class to make pool objects
//
//
//    //each pool will have its own name variable
//    private String nameField; //field/variable/"instance variable"
//
//    //each pool will have a length:
//    private Double lengthField; //another field/variable/"instance variable"
//
//    //special method called a "constructor" that has the same name as the class:
//    //here the class is: "vid_1_objects_pool"
//    //a constructor is a method (needs parentheses)
//    //constructor has no return type
//    //constructor is used for creating a class
//    //give the constructor some parameters within the parentheses: here: "(String name, double length)"
//
////THIS IS THE CONSTRUCTOR vvv: (creates/sets up the  "vid_1_objects_pool")
//    vid_1_objects_pool(String nameParameter, double lengthParameter) {
//        this.nameField = nameParameter;
//        this.lengthField = lengthParameter;
//        //these variables within this class (vid_1_objects_pool) will
//        //let us create objects associated with these variables:
//    }
//    //add a method here so that this does something:
//    //ask the object "vid_1_objects_pool" to figure out how far a swimmer swims if they swim some
//    //  number of laps in a specific pool.
//
//    //this is a public method that returns a double ("public double")
//    //name of method: ("distanceForLaps")
//    //the number of lap swum will be an integer "(int laps)"
//
////This is the "instance method" vvv that belongs to this class ("vid_1_objects_pool"):
//    //side note: another name for object is "instance of a class".
//
//    //relevant example: the pool object (in the related file: vid_1_swimmingPoolProgram,
//    // this is and "instance of the object": vid_1_objects_pool ymca = new vid_1_objects_pool ("YMCA", 50);)
//    // is an instance of the "vid_1_objects_pool" class.
//
//    public double distanceForLaps (int laps){
//        //multiply the number of laps by the length of the pool:
//        // 10 laps swum in the pool times the length of the pool 50 meters, will get total = 500 meters
//        //multiply the laps by the length
//        //the return type for total will be a double:
//
//        //this.lengthField is defined within in this class ^^ above in "public class vid_1_objects_pool"
//        // and is different than a variable defined within the method (example here is laps):
//            //laps is just above and just below without a "this." because it's within this method.
//        double total = laps * this.lengthField; //this could be shortened to: "return lap * this.lengthField;"
//        return total;
//
//        //head over to the "vid_1_swimmingPoolProgram" to use this new method
//    }
//}

//***** vid_1_swimmingPoolProgram
/*
package org.example.week_7_object_oriented_programming.poolexample;

import org.example.week_7_object_oriented_programming.poolexample.vid_1_objects_pool;

public class vid_1_swimmingPoolProgram {
    public static void Main(String[] args) {
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

*/





