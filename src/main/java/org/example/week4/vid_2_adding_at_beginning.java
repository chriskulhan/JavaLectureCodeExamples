package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class vid_2_adding_at_beginning {
    public static void main(String[] args) {
        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        //when adding a list mate, you need to identify the index place and the contents:
        classCodes.add (0, 1425);

        System.out.println(classCodes);
        //output: [1425, 2545, 1150, 1250]

        //what size is this?
        System.out.println(classCodes.size());
        //output: 4

        //how to loop over a list of integers using int:
        for (int classCode: classCodes) {
            //^^classCode is the new variable you create
            //^^classCodes is the list at the top of this method
            System.out.println(classCode);
            //output:
            //1425
            //2545
            //1150
            //1250
        }

        //same as above, only using Integer, and a new variable
        for (Integer classCodeAgain: classCodes) {
            //^^classCodeAgain is the new variable you create
            //^^classCodes is the list at the top of this method
            System.out.println(classCodeAgain);
            System.out.println("ITEC " + classCodeAgain);
            //output: (because it's a loop:)
            //1425
            //ITEC 1425
            //2545
            //ITEC 2545
            //1150
            //ITEC 1150
            //1250
            //ITEC 1250

        }
    }
}

