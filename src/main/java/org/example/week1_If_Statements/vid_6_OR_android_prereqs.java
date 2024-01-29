package org.example.week1_If_Statements;

import static input.InputUtils.yesNoInput;

public class vid_6_OR_android_prereqs {
    public static void main(String[] args) {
        System.out.println("This program will check if you've taken the prereqs for ITEC 2417.");
        System.out.println("Please answer the following two questions:");

        boolean hasTakenCSharp = yesNoInput("Have you taken ITEC 2505 C# Programming?");
        boolean hasTakenJava = yesNoInput("Have you taken ITEC 2545 Java Programming?");

        //Use an OR operator in the condition to check if the prereqs are met.
    if (hasTakenCSharp || hasTakenJava) {
        System.out.println("You meet the prereqs. Good luck in Android Programming!");
    } else {
        System.out.println("You don't meet the prereqs. Check you when you do. ");
        //input/output:
        // This program will check if you've taken the prereqs for ITEC 2417.
        //Please answer the following two questions:
        //Have you taken ITEC 2505 C# Programming? Y/N?
        //y
        //Have you taken ITEC 2545 Java Programming? Y/N?
        //y
        //You meet the prereqs. Good luck in Android Programming!

        //input/output:
        // This program will check if you've taken the prereqs for ITEC 2417.
        //Please answer the following two questions:
        //Have you taken ITEC 2505 C# Programming? Y/N?
        //n
        //Have you taken ITEC 2545 Java Programming? Y/N?
        //y
        //You meet the prereqs. Good luck in Android Programming!

        //input/output:
        // This program will check if you've taken the prereqs for ITEC 2417.
        //Please answer the following two questions:
        //Have you taken ITEC 2505 C# Programming? Y/N?
        //n
        //Have you taken ITEC 2545 Java Programming? Y/N?
        //n
        //You don't meet the prereqs. Check you when you do.
    }

    }
}
