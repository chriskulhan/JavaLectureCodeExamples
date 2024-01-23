package org.example.week1_If_Statements;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class TestInput {
    public static void main(String[] args) {
        String name = stringInput("Enter your name: ");
        //input utils for stringInput, will add code to the top
        System.out.println("Hello " + name);
        //output: asks for name, you type something and then there is additional output
        //second output: Hello chris

        int number = intInput("Enter a number");
        System.out.println("You chose " + number);
        //output: enter a number, 3
        //second output: you chose 3
    }
}
