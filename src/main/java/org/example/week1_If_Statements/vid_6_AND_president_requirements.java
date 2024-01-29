package org.example.week1_If_Statements;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.yesNoInput;

public class vid_6_AND_president_requirements {
    public static void main(String[] args) {
        System.out.println("Are you eligible to become the President of the U.S.?");
        System.out.println("Please answer these questions:");

        boolean naturalBornCitizen = yesNoInput("Were you born in the U.S.?");
        int age = positiveIntInput("What is your age, in years?");
        int yearsLivedInUS = positiveIntInput("How many years have you lived in the U.S.?");

        if (naturalBornCitizen && age >= 35 && yearsLivedInUS >= 14) {
            System.out.println("You meet the eligibility requirements to become president. Good luck!");
        } else {
            System.out.println("Sorry you do not meet the requirements. Who really wants that job anyway? ");
       // input/output:
            // Are you eligible to become the President of the U.S.?
            //Please answer these questions:
            //Were you born in the U.S.? Y/N?
            //y
            //What is your age, in years?
            //36
            //How many years have you lived in the U.S.?
            //36
            //You meet the eligibility requirements to become president. Good luck!

        //input/output:
            // Are you eligible to become the President of the U.S.?
            //Please answer these questions:
            //Were you born in the U.S.? Y/N?
            //n
            //What is your age, in years?
            //35
            //How many years have you lived in the U.S.?
            //35
            //Sorry you do not meet the requirements. Who really wants that job anyway?



        }
    }
}
