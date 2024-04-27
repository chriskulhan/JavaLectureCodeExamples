
/* notes from video:

-null is a special value in Java
    -any object type (strings, lists, hashmaps, arraylists, random, etc.) can have the value null
    -null means that a variable *name* exists, but doesn't refer to or point to any data.

-Primitive (int, boolean, double, etc.) types can't be null, they always have a value
    int number = null //error!!

-We can create a variable and set it to null
    **might do that because the there isn't any data
    ** for this variable, the data is missing or unknown:
    String name = null;

- An null object is *not* the same as an empty object
*/

package org.example.week3_methods_program_design;

import java.util.ArrayList;
import java.util.List;

public class vid_10_null_value_pointer_exceptions {
    public static void main(String[] args) {

        String name = null;

List<String> myList = null; //no list - no container, nothing to put data in (there is no container)
List<String> emptyList = new ArrayList<>(); //new empty list, we can add data

        //a way to "initialize" the object is to re-create it:
        myList = new ArrayList<>();

        System.out.println(myList.size());
        System.out.println(myList.isEmpty());
        myList.add ("hello");
        //these will get a nullpointerexception

//- Null strings (there is no data) and empty strings (still a string, just doesn't have any characters yet) can both exist:

String anotherName = ""; //empty string -different than a null string
System.out.println(name); //not an error
//output: null

name = "Alex"; // set to a string
System.out.println(name);
//output: Alex


//-Check if a values is null before using it:
//print: there is no name:
if (name == null) { //test if a variable is null
System.out.println("there is no name"); //not an error
}

//alternate:
if (name != null){ //check if the variable is null before using it.
    System.out.println("The name " + name + " has " + name.length() + " letters.");
    //with name.length(), object.method, if the Main object "name" is null, then there is no way to find
    //the length of something that doesn't exist.
}

//output:
//0
//true
//null
//Alex
//The name Alex has 4 letters.


/*


package org.example.week3_methods_program_design;

import java.util.List;

public class vid_10_null_value_pointer_exceptions {
    public static void Main(String[] args) {
        List<Integer> numbers = makeListofNumbers(0);
        System.out.println( numbers.size());
        //size is cause the null pointer exception
        printList(numbers);
    }

    public static List<Integer> makeListofNumbers (int count) {
        /*Create and return a list of sequential numbers from 1 to count
        -if count is 0 or negative, return null
         */
//        if (count <= 0) {
//            return null;
//        } else {
//
//        }

/*What if you don't know if a method is null or not?
//working in a method
 */

//can test if a value is null:
if (name == null) {
    System.out.println("We don't know the name");
        } else {

    System.out.println("The name is " + name);
        }
    }
}
