package org.example.week1_If_Statements;

import static input.InputUtils.doubleInput;

public class vid_4_above_freezing {
    public static void main(String[] args) {
        System.out.println("Enter today's temperature in F:");
        double temp = doubleInput();

        if (temp > 32) {
            //This will run if the condition is true
            System.out.println("It's above freezing.");
            //input: 34
            //output: It's above freezing.

            //input: 32
            //output: <nothing> because it's equal to 32

            //input: 31
            //output: <nothing> because it's less than 32
        }

    }
}
