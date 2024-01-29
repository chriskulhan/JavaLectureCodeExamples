//check if a student has completed all the prereqs in order to take ITEC 1310:
//the prereqs are ITEC 1100, ITEC 1110, and ITEC 1250

package org.example.week1_If_Statements;

import static input.InputUtils.yesNoInput;

public class vid_6_AND_ITEC1310_prereq {
    public static void main(String[] args) {
        System.out.println("This program will check if you meet the prereqs for ITEC 1310.");
        System.out.println("Please answer the following questions:");

        boolean hasTaken1100 = yesNoInput("Have you taken ITEC 1100?");
        boolean hasTaken1110 = yesNoInput("Have you taken ITEC 1110?");
        boolean hasTaken1250 = yesNoInput("Have you taken ITEC 1250?");

        //Use an AND operator in the condition to check if all the prereqs are met:
        if (hasTaken1100 && hasTaken1110 && hasTaken1250){
            System.out.println("You meet the prereqs. You may take ITEC 1310.");
        } else {
            System.out.println("You do NOT meet the prereqs yet. You need to take them before ITEC 1310.");
        //input/output:
            // This program will check if you meet the prereqs for ITEC 1310.
            // Please answer the following questions:
            //Have you taken ITEC 1100? Y/N?
            //n
            //Have you taken ITEC 1110? Y/N?
            //n
            //Have you taken ITEC 1250? Y/N?
            //n
            //You do NOT meet the prereqs yet. You need to take them before ITEC 1310.

        //input/output:
            // This program will check if you meet the prereqs for ITEC 1310.
            //Please answer the following questions:
            //Have you taken ITEC 1100? Y/N?
            //y
            //Have you taken ITEC 1110? Y/N?
            //y
            //Have you taken ITEC 1250? Y/N?
            //y
            //You meet the prereqs. You may take ITEC 1310.

        //input/output:
            // This program will check if you meet the prereqs for ITEC 1310.
            //Please answer the following questions:
            //Have you taken ITEC 1100? Y/N?
            //y
            //Have you taken ITEC 1110? Y/N?
            //n
            //Have you taken ITEC 1250? Y/N?
            //y
            //You do NOT meet the prereqs yet. You need to take them before ITEC 1310.

        }
    }
}
