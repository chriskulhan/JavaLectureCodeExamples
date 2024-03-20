package org.example.week4_lists;

import java.util.ArrayList;
import java.util.List;

public class lecture_week_4_lecture_notes_02202024 {
    public static void main(String[] args) {
        //mutable list - we can change it and add things
        // change things in the list

        List<String> songs = new ArrayList<>();

        songs.add("Respect"); // can modify the list by adding things
        songs.add("Beethoven's 5th Symphony");

        for (String song: songs) {
            System.out.println();

        }
    }
}

/*
what's the difference between arrays and lists:

//Property of Arrays:

-older data structure - languages like C, C++ also use these
-memory efficient for storage and very fast to access and change data
-fixed size, choose the size when you create them
-optionally add data as you create the Array
-or you can make an empty array and add data
-always change the data in any of (or all) of the elements
-data is kept in order, elements, indexed (numbered) starting from zero
-you can't change the size of the array
-we have to specify the type of data that is stored in the array
**int[] numbers = new int[10]; //e.g. an array to store 10 int values



 */