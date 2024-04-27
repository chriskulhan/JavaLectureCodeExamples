/*

Strings are actually objects so they are also stored on the heap, and when a string is sent to a method then the
    reference to that string is sent to the method. So it's also pass reference by value.

    When you write code like this:


String name = "Java";
name = "C#";

The original String is replaced with an entirely new String in memory with a new reference.
So in a method call like this:

public static void Main(String[] args) {
  String name = "Java";   // one string is created
  method(name);
}
public static void method(String n) { // string object reference is sent here
  n = "Not Java";   // a new String is created, it will have a new reference, the name n will now point to the new object
}


So in this example, name is one String variable, one piece of string data. When n is modified inside method,
    a new String variable with the data "Not Java" is created and assigned to the variable n, instead of the
    name variable being modified.

Some background: https://www.baeldung.com/java-string-immutable

*/


/*what happens when you modify the data in a parameter?
        -with integers and strings, the variable stays the same in the Main method,
        even if it changes in the method the Main calls from.
//what happens to the data in the method that method is called from?
    -the variable can change in a method it's being called from, but will stay the same in the Main method.


 */
package org.example.week3_methods_program_design;

import java.util.Arrays;

public class vid_9_pass_by_value_modifying_objects_inside_methods {
    public static void main(String[] args) {

        int miles = 6;
        //miles is sent to "changeToKM"
        //(miles) is a parameter vvv
        changeToKM(miles);
        System.out.println(miles); //output: 6

        String units = "miles";
        changeToMetricUnits(units);
        System.out.println(units); //output: miles

        double [] speeds = {4,5,10,12}; //this is in miles per hour
        convertToKilometers(speeds);
        System.out.println(Arrays.toString(speeds));
        //when you call a method with an array as the argument, if that array's modified in the method, it's modified in Main.
        //output: [6.4, 8.0, 16.0, 19.200000000000003]
    }

    //changing a primitive type parameter has no effect on the data in the caller
    public static void changeToKM(int distance) {
        distance = 10;
    }

    //changing a primitive type parameter has no effect on the data in the caller
    public static void changeToMetricUnits(String units) {
        units = "kilometers";

    }
// the variable acts differently when using an array:

    /*the method "convertToKilometers" has one parameter "double[] speeds"
        //the "double[] speeds" parameter that is an array that will capture double numbers (numbers with decimal points)
        //the method "convertToKilometers" will loop over the array and takes every distance in the array
            and assumes it's a number of miles multiplies it by 1.6 and then modifies the original array
            so it's modifying the "(double[] speeds)" parameter

     */
    public static void convertToKilometers(double[] speeds) {

        for (int s = 0; s < speeds.length ; s++) {
            double speed = speeds[s];
            double speedKm = speed * 1.6;
            speeds[s] = speedKm;
    }
    }

}

//if a method modifies an object type method, then the method is also modified in the Main place where the object was created.
/*powerpoint slide week 3-50)

What does it mean?

-Two different mechanisms of sending data to methods
    -Pass by value – how primitive types and Strings are sent (int, double, boolean, char)
        **a copy of the primitive type is made (example: getStarsOutOfTen)
    -Passing object references by value – how arrays and most everything else is sent (everything else)


 */
