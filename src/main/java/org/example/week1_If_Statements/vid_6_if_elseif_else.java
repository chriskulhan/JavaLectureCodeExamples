package org.example.week1_If_Statements;

import static input.InputUtils.stringInput;

public class vid_6_if_elseif_else {
    public static void main(String[] args) {
        String dinnerSuggestion = stringInput("What should we have for dinner?");

        //computers only like pizza and tacos
        //Print:
        //1. response for pizza
        //2. different response for tacos
        //3. another response for anything else

        if(dinnerSuggestion.equalsIgnoreCase("pizza")) {
            System.out.println("Pizza sounds good!");
        } else if (dinnerSuggestion.equalsIgnoreCase("tacos")) {
            System.out.println("Great! I like tacos!");
        } else {
            System.out.println("How about pizza or tacos?");
            //input: pizza
            //output:Pizza sounds good!

            //input: TaCos
            //output: Great! I like tacos!

            //input: bananas
            //output: How about pizza or tacos?

        }
    }
}
