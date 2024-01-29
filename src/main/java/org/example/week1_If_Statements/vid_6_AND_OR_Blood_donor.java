package org.example.week1_If_Statements;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class vid_6_AND_OR_Blood_donor {
    public static void main(String[] args) {
        System.out.println("What is your weight?");
        double weight = doubleInput();

        System.out.println("How old are you?");
        int age = intInput();

        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor!");
        } else {
            System.out.println("Sorry, you are not eligible");
            if (weight < 110) {
                System.out.println("You do not weigh enough");
            }
            if (age < 17) {
                System.out.println("You are not old enough. You need to be at least 17 years old.");
            }
            //input/output:
            // What is your weight?
            //110
            //How old are you?
            //17
            //You are eligible to be a blood donor!

            //input/output:
            // What is your weight?
            //100
            //How old are you?
            //17
            //Sorry, you are not eligible

        }
    }
}