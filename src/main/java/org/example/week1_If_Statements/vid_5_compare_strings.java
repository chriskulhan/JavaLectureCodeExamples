package org.example.week1_If_Statements;

import static input.InputUtils.stringInput;

public class vid_5_compare_strings {
    public static void main(String[] args) {

        String college = stringInput("What college do you attend?");

        if (college.equalsIgnoreCase("MCTC"))   {
            //compare the characters in the string.
            //not saying is this the exact same string as the other string.
            System.out.println("Yay, MCTC!");
        } else {
            System.out.println("Too bad, you should check out MCTC.");
            //input: MCTC
            //output: Yay, MCTC!

            //input: <nothing>
            //output: Too bad, you should check out MCTC.

            //input: harvard
            //output: Too bad, you should check out MCTC.

            //input: mctc
            //output:Yay, MCTC!

            //input: McTc
            //output: Yay, MCTC!

        }
    }
}
