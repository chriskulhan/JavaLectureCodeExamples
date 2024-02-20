package org.example.lecture_notes_02202024;

import java.util.ArrayList;
import java.util.List;

public class lecture_week_4 {
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
