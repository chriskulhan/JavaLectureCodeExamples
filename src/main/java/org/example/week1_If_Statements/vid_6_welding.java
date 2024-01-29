package org.example.week1_If_Statements;

import static input.InputUtils.yesNoInput;

public class vid_6_welding {
    public static void main(String[] args) {
        //when taking a welding class at MCTC, you must wear proper clothing
        //requirements: cotton or wool socks and clothing and closed-toed shoes.

        //this program checks if a student is properly dressed for welding:

        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed toe shoes?");

        if ((cottonClothes || woolClothes) && closedToeShoes) {
            // added another parentheses around the clothing ^^ to make sure clothes AND the shoes are correct
            System.out.println("You meet the requirements to attend Welding class.");
        } else {
            System.out.println("You do not meet the requirements to attend Welding class.");
            //input/output:
            // Are you wearing cotton clothes? Y/N?
            //n
            //Are you wearing wool clothes? Y/N?
            //n
            //Are you wearing closed toe shoes? Y/N?
            //y
            //You do not meet the requirements to attend Welding class.

            //input/output:
            // Are you wearing cotton clothes? Y/N?
            //n
            //Are you wearing wool clothes? Y/N?
            //n
            //Are you wearing closed toe shoes? Y/N?
            //n
            //You do not meet the requirements to attend Welding class.

            //input/output:
            // Are you wearing cotton clothes? Y/N?
            //y
            //Are you wearing wool clothes? Y/N?
            //n
            //Are you wearing closed toe shoes? Y/N?
            //y
            //You meet the requirements to attend Welding class.

            //input/output **This is wrong:
            // Are you wearing cotton clothes? Y/N?
            //y
            //Are you wearing wool clothes? Y/N?
            //n
            //Are you wearing closed toe shoes? Y/N?
            //n
            //You meet the requirements to attend Welding class.

            //after changing the parentheses: (works properly now!)
            //input/output:
            // Are you wearing cotton clothes? Y/N?
            //y
            //Are you wearing wool clothes? Y/N?
            //n
            //Are you wearing closed toe shoes? Y/N?
            //n
            //You do not meet the requirements to attend Welding class.
        }
    }
}
