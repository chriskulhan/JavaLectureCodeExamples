package org.example.week1_If_Statements;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        String userName = stringInput("Please enter your name: ");
        //input: chris
        System.out.println("Welcome, " + userName);
        //output: chris

        //to get integer or double inputs:
        int howManyClasses = intInput("How many classes are you taking?");
        //input: 5
        System.out.println("You are taking " + howManyClasses + " classes.");
        //output: You are taking 5 classes.

        //if you input the word "three" for "How many classes are you taking?" then:
        //input: three
        //output: Error - please enter an integer number. (will continue, not crash)
                //How many classes are you taking?
    }
}