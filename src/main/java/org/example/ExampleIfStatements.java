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

/* question 2 code week 2 if statements
// == doesn't reliably work to compare strings
if (answer.equalsIgnoreCase("Pong")){
        return true;
        } else {
    return false;
        }

 */

/* question 3 week if statements
size and swimming requirement for astronauts
this program will ask about height and how far they can swim

there are many ways to solve this:

1. check to see if all the conditions are met
Use AND operator

if(height >= 58 && height <= 76 && swimDistance >= 75){
return true;
} else {
return false;
}
}

2. check if any are not true
 */