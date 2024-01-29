package org.example.week1_If_Statements;

public class vid_7_String_Methods {
    public static void main(String[] args) {
        //length
        String secretPassword = "kittens";
        int numberOfCharactersInPassword = secretPassword.length();
        System.out.println(numberOfCharactersInPassword);

        if(secretPassword.length() > 12) {
            System.out.println("Longer passwords are more secure, good choice");
        } else {
            System.out.println("Consider using a longer password");
        }

        //lowercase
        //emails are usually lowercase
        String email = "secret.email@minneapolis.edu";

        //uppercase
        //The department code is in uppercase
        String classIdentifier = "itec 2545";

        //ends with
        //is this email a .edu email?

        //starts with
        //is this class an ITEC class?


    }
}
