/*warm up
An event has four corporate sponsors: IKEA, AT&T, CVS, and 3M.

Create an array with these names in lowercase,

String sponsors = { "Ikea", "at&t", "cvs", "3m" };

But, these company names should all written in uppercase letters.

Write a loop that converts each name to uppercase. Modify the strings in the original array.

Print the array, using Arrays.toString, to check the names are converted correctly.
 */

package org.example.week3_methods_program_design;

import java.util.Arrays;

public class vid_1_methods_arrays_and_loops_warmup {
    public static void main(String[] args) {

        //modify array, makes strings uppercase
        String[] sponsors = {"ikea", "at&t", "cvs", "3m"};

//        for (int i = 0; i < sponsors.length; i++) {
            //System.out.println(sponsors[i]);
            //output:
            //ikea
            //at&t
            //cvs
            //3m

            //instead of ^^, make a new variable:
//            String sponsor = sponsors[i];
//
//            //convert sponsor to uppercase
//            sponsor = sponsor.toUpperCase();
//
//            //overwrite the previous array with the uppercase version in the same position:
//            sponsors[i] = sponsor;
//        }
//        System.out.println(Arrays.toString(sponsors));
            //output:[IKEA, AT&T, CVS, 3M] //worked!!

            //another shorter way to do it;
            for (int i = 0; i < sponsors.length; i++) {
                sponsors[i] = sponsors[i].toUpperCase();
            }
            System.out.println(Arrays.toString(sponsors));
            //output:[IKEA, AT&T, CVS, 3M]
        }
    }