package org.example.week2_loops_and_arrays;

import java.util.Arrays;

public class vid_5_classNames_print_array {
    public static void main(String[] args) {

//    String [] classNames = {"Java", "C#", "Web", "Android", "iOS"};
//
//    for (int x=0; x<3; x++) {
//        System.out.println("A class name is " + classNames[x]);

        //this will only print out the first 3 things in the array because x < 3
//        //output:
//        // A class name is Java
//        //A class name is C#
//        //A class name is Web


        //What if we want to print everything in the array use length:
        String [] classNames = {"Java", "C#", "Web", "Android", "iOS"};

        for (int x=0; x < classNames.length; x++) {
            System.out.println("A class name is " + classNames[x]);
            //output:
            // A class name is Java
            //A class name is C#
            //A class name is Web
            //A class name is Android
            //A class name is iOS

    }
        System.out.println(classNames);
        //output: [Ljava.lang.String;@452b3a41
        //this is a memory address

        //if you want to print out your array, you have to use toString:
        System.out.println(Arrays.toString(classNames));
        //output: [Java, C#, Web, Android, iOS]
    }
}
