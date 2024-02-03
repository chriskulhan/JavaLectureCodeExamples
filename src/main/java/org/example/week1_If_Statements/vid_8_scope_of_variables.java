package org.example.week1_If_Statements;

import static input.InputUtils.stringInput;

public class vid_8_scope_of_variables {

        /*scope

        -The scope of a variable defines where it exists, or where it can be used in a program.
        *assumptions: thinking about scope of variables in methods within a class.

        *the rules are different with global variables and static variables that can be accessed
            from other java files (classes).

        *if a variable doesn't exist, or it not in scope, it's an error to use it.

        **scope of a variable** is from where it is created, to the end of the block it is created in.

        *the block it is created in is defined by curly braces. The closest open curly brace (the closest
        one above the variable definition) is the start of the block. The matching case curly brace is
        the end of the scope.

        *When a variable goes out of scope, it can no longer be used in the program.

        *scopes and blocks can be nested. when you create a method, that creates a block.
        *When you create an if statement you create an if statement, there's another block. An else statement
            has its own block.
        *loops have blocks too.

        **Restricting scope of variables is important
            -allows us to re-use variable names
            -if a variable could be used anywhere, then any part of the program could change it, which could lead to
            bugs if that variable was used or changed accidentally.
            -if variables existed everywhere at all times, it would use a lot of memory
            -It allows Java to free up memory used by variables when they go out of scope.

         */
        public static void main(String[] args) {
            //bookstore has a 10% student discount for students with an .edu email
            //system.out.println(email); //error can't use variable before created

            String email = stringInput("Enter your email");

            double bookPrice = 40;
            //define discount outside the scope first using 'double'
            double discount = 0;

            if(email.endsWith(".edu")) {
                System.out.println("Your student email is " + email);
                //assign the variable a value *within* the scope in this nested piece of code (within set of curly braces)
                discount = 10; // 10% discount
            }
                System.out.println(email);
                //calculate final price with any discounts
                bookPrice = bookPrice / 100 * ( 100 - discount);

                System.out.println(bookPrice);
            }
        }
