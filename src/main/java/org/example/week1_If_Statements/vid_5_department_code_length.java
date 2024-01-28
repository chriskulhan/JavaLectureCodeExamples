package org.example.week1_If_Statements;

import static input.InputUtils.stringInput;

public class vid_5_department_code_length {
    public static void main(String[] args) {

        String departmentCode = stringInput("Enter department code");

        //check to see if the code is valid (ITEC, BTEC, ENGL, MATH)

        if (departmentCode.length() == 4) {
            System.out.println("The code is valid.");
            departmentCode = departmentCode.toUpperCase();
            //this overwrites the original code with upper case
            System.out.println("The code is " + departmentCode);
            //input: math
            //output: The code is valid.
            //The code is MATH
        } else {
            System.out.println("The code is not valid.");
            //input: ITEC
            //output: The code is valid

            //input: 1234
            //output: The code is valid

            //input: T
            //output: The code is not valid
        }
    }
}
