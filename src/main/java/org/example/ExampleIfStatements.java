package org.example;

import static input.InputUtils.intInput;

public class ExampleIfStatements {
    public static void main(String[] args) {
        String college = "MCTC";
        String className = "Java";
//        int classCode = 2545;
        int classCode = intInput("Enter a class code: ");

        if (classCode == 2545) {
            // == test for equality (comparing things)
            // = is assigning some data into a variable
            System.out.println("This is Java Programming!");
        } else if (classCode ==2505) {
            System.out.println("This is C# programming!");
        } else {
            System.out.println("This is NOT Java programming");
        }
    }
}
