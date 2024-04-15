//links to resources Clara shared:

//https://beginnersbook.com/2013/04/oops-concepts/
//https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html
//https://devqa.io/overriding-tostring-java-class/


/* vid_1_notes:
 ***A Java Object: (slide 2)

-Is made from a class definition
-It contains data (in variables aka fields)

AND/OR

It can do things (with methods)

For example: (slide 3)
A Java ArrayList object contains data – the list elements
A Java ArrayList can also do things – add a new element, delete an element, tell us it's size…

 List<String> animals = new ArrayList<String>();
 animals.add("cat");
 animals.add("fish");
 animals.remove(0);
 int numberOfAnimals = animals.size();

***Objects are made from a class definition (slide 4)

Java already has a class definition for the ArrayList class
And many other classes too, such as the ones you've used to create Hashmap and FileReader objects

One class definition can be used to make one object, or many objects
Think of a class definition as a blueprint, a set of instructions
The objects are built from these blueprints/instructions

***You can create your own class definitions (slide 5)

 Write one class definition
  -Describe what an object can do – write methods in the class
  -Describe what data the object stores – declare variables (also known as field) in the class

Use that class definition to create and use objects in your program
*
* ****Principles of Object-Oriented Programming (slide 6)

-Object modeling (what data or methods should go here? )
-Encapsulation - keeping data together
-Abstraction - putting details in one place and then not having to worry about the detail to use the code

-Focusing each class on one task -
    **_single responsibility principle_**
*   (write a class that can do one thing it can do well)

 */

//Swimming pools example:

//A swimming pool has a name
//And, it has a length
//A swimmer who swims 10 laps at a 50-meter pool,
//  has swum a different distance to a swimmer who swims 10 laps at a 25-meter pool


//write a program to create a swimming pool class
    //then make swimming pool objects

package org.example.week_7_object_oriented_programming.poolexample_vid_1_and_2;

public class vid_1_objects_pool {

    //this class has a name and a length
    //make a field/variable (same thing) to store those two variables:
    //use this class to make pool objects


    //each pool will have its own name variable
    private String nameField; //field/variable/"instance variable"

    //each pool will have a length:
    private Double lengthField; //another field/variable/"instance variable"

    //could add more fields/variables/instance variables. More than 2 is okay.

    //special method called a "constructor" that has the same name as the class:
    //here the class is: "vid_1_objects_pool"
    //a constructor is a method (needs parentheses)
    //constructor has no return type
    //constructor is used for creating a class
    //give the constructor some parameters within the parentheses: here: "(String name, double length)"

//THIS IS THE CONSTRUCTOR vvv: (creates/sets up the  "vid_1_objects_pool")
    vid_1_objects_pool(String nameParameter, double lengthParameter) {
        this.nameField = nameParameter;
        //could be nameField = nameParameter; (without the "this." because it can't be confused)

        this.lengthField = lengthParameter;
        //could be lengthField = lengthParameter; (without the "this." because it can't be confused)
        //these variables within this class (vid_1_objects_pool) will
        //let us create objects associated with these variables:
    }
    //add a method here so that this does something:
    //ask the object "vid_1_objects_pool" to figure out how far a swimmer swims if they swim some
    //  number of laps in a specific pool.

    //this is a public method that returns a double ("public double")
    //name of method: ("distanceForLaps")
    //the number of lap swum will be an integer "(int laps)"

//This is the "instance method" vvv that belongs to this class ("vid_1_objects_pool"):
    //side note: another name for object is "instance of a class".

    //relevant example: the pool object (in the related file: vid_1_swimmingPoolProgram,
    // this is and "instance of the object": vid_1_objects_pool ymca = new vid_1_objects_pool ("YMCA", 50);)
    // is an instance of the "vid_1_objects_pool" class.

    public double distanceForLaps (int laps){
        //multiply the number of laps by the length of the pool:
        // 10 laps swum in the pool times the length of the pool 50 meters, will get total = 500 meters
        //multiply the laps by the length
        //the return type for total will be a double:

        //this.lengthField is defined within in this class ^^ above in "public class vid_1_objects_pool"
        // and is different than a variable defined within the method (example here is laps):
            //laps is just above and just below without a "this." because it's within this method.
        double total = laps * this.lengthField; //this could be shortened to: "return lap * this.lengthField;"
        //this could also be: double total = laps * lengthField; (because "this." isn't always necessary if it can't be confused)
        return total;

        //head over to the "vid_1_swimmingPoolProgram" to use this new method
    }


    //add @Override before the public String toString() method:
    //because when you print any object (arraylist, hashmap, "vid_1_objects_pool" (this is an object), integer, etc.)
    //System.out.println(como) in vid_1_swimmingPoolProgram is
    //  calling the method "toString()" in vid_1_objects_pool for
    //  the vid_1_objects_pool object that is called "como".

    //if you provide a "toString()" method in a class, (the class here is vid_1_objects_pool), that returns something
    //descriptive, then that's what gets printed when you System.out.println(como)

    //@Override is used to make sure "toString()" just below is spelled correctly and
    // will help verify you are using the right method name:
    //using @Override to replace the default version of "toString()" with a custom version, so the
    //normal "toString()" method has to be overridden:
    @Override

//add a new "instance method" to this class (class named vid_1_objects_pool)
//Why create toString method in vid_1_objects_pool????:
//        //check in vid_1_swimmingPoolProgram and see what is in the como thing in vid_1_swimmingPoolProgram
            //added:
                //System.out.println(como);
                    //output: org.example.week_7_object_oriented_programming.poolexample.vid_1_objects_pool@5674cd4d
                    //why? telling us what type of object it is, but the memory address (@5674cd4d) isn't very useful
                    //in order to make this better, make a toString(); instance method in vid_1_objects_pool:

    //convention to refer to instance variables as "this."
    // can omit "this." if there can be no confusion about the names
    //so below: this.nameField and this.lengthField are known to be instance variables:
    public String toString() {
        String description = this.nameField + " pool is " + this.lengthField + " meters long.";
        //could instead be: String description = nameField + " pool is " + lengthField + " meters long.";
        return description;
        }
        //rerun the System.out.println(como) after adding this toString method^^^;
        //in vid_1_swimmingPoolProgram, now what happens?
        //
        //add this in vid_1_swimmingPoolProgram and run it:
        //    System.out.println(como);
            //output: Como Park pool is 80.0 meters long.
            //this is the string from the toString method ^^^

            //see what this might look like for ymca:
        //        System.out.println(ymca);
            //output: YMCA pool is 50.0 meters long.
            //this has used the toString instance method in vid_1_objects_pool to make this string ^^^


//
//    }

}
