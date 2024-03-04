/*What does it mean?

-Two different mechanisms of sending data to methods
    -Pass by value – how primitive types and Strings are sent (int, double, boolean, char)
        **a copy of the primitive type is made (example: getStarsOutOfTen)
    -Passing object references by value – how arrays and most everything else is sent (everything else)


 */

//from Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week3_methods/NotModifyingPrimitiveTypes.java

package org.example.week3_methods_program_design;

import static input.InputUtils.positiveIntInput;

public class vid_9_what_does_it_mean_get_stars {


    /* Compare this program NotModifyingPrimitiveTypesBUG.
    This one does work.
    -When starsOutOfTen is passed to the getStarsOutOfTen method, a copy is
     made of the variables. So there are two separate, independent variables.
    -If getStarsOutOfTen modifies stars, then main will never know. starsOutOfTen won't change.

    So though the variable stars is modified in getStarsOutOfTen,
    the main method does not see the changes.

    And getStarsOutOfTen has to RETURN stars to main, so main can use the new data.

     */

    public static void main(String[] args) {

        int starsOutOfTen = 8;  // I rated a movie 8/10
        // Let's see what the user rates it
        starsOutOfTen = getStarsOutOfTen(starsOutOfTen);
        System.out.printf("You rated the movie %d/10. \n", starsOutOfTen);
    }

    public static int getStarsOutOfTen(int stars) {
        System.out.printf("The movie has been rated %d/10. What do you think?\n", stars);
        stars = positiveIntInput("Please rate the movie. How many stars out of ten?");
        return stars;
    }

}

