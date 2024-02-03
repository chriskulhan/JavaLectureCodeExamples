package org.example.week1_If_Statements;

import static input.InputUtils.stringInput;

public class vid_7_String_Methods {
    public static void main(String[] args) {

        //length
        String secretPassword = "a;lkdsjfpaodufpoaisufpaoisdf";

        //how long is something?
        int numberOfCharactersInPassword = secretPassword.length();
        System.out.println(numberOfCharactersInPassword);
        //output: 7

        //check if a password is long enough:
        if (secretPassword.length() > 12) {
            System.out.println("Longer passwords are more secure, good choice");
        } else {
            System.out.println("Consider using a longer password");
        }
        //input: kittens
        //output: Consider using a longer password

        //change secretPassword to longer (here in code): String secretPassword = "a;lkdsjfpaodufpoaisufpaoisdf";
        //output from .length: 28
        // output: Longer passwords are more secure, good choice

        //convert to lowercase
        //emails are usually lowercase
        String email = "secret.email@MINNEAPOLIS.edu";

        //convert to lowercase:
        email = email.toLowerCase();
        System.out.println(email);
        //output: secret.email@minneapolis.edu

        //convert to uppercase
        //The department code is in uppercase
        String classIdentifier = "itec 2545";
        classIdentifier = classIdentifier.toUpperCase();
        System.out.println(classIdentifier);
        //output:ITEC 2545

        //make a new variable that will make uppercase:
        String classID = "itec 2545";
        String upperClassIdentifier = classID.toUpperCase();
        System.out.println(classID);
        System.out.println(upperClassIdentifier);
        //output:
        // itec 2545
        //ITEC 2545

        //ends with
        //is this email a .edu email?
        System.out.println(email.endsWith(".edu"));
        //output: true
        //**yes, it does end with .edu

        System.out.println(email.endsWith(".com"));
        //output: false

        //another example email
        //if statement incorporating endsWith:
        String exampleEmail = "test@gmail.edu";
        if (exampleEmail.endsWith(".edu")) {
            System.out.println("This is an education email address");
        } else {
            System.out.println("This is not an education email address");
        }
        // exampleEmail = ******.com
        //output: This is not an education email address

        //exampleEmail = ****.edu
        //output: This is an education email address

        //starts with
        //is this class an ITEC class?
        String classCode = "ITEC 1245";
        System.out.println(classCode.startsWith("ITEC"));
        //output: true

        if (classCode.startsWith("ITEC")) {
            System.out.println("This is an ITEC class");
        } else {
            System.out.println("This is NOT an ITEC class");
        }
        //output: This is an ITEC class

        //ask user to enter a class code:
        String favoriteFruit = stringInput ("Please enter your favorite fruit:");
        System.out.println(favoriteFruit);
        if (favoriteFruit.startsWith("mango")) {
            System.out.println("Mangoes are my favorite fruit too!");
        } else {
            System.out.println("We have different favorite fruits.");
        }
        //input: mango
        //output: Mangoes are my favorite fruit too!

        //input: banana
        //output: We have different favorite fruits.

        //contains (looks for text within a string)
        //example: look for support ticket requests that contain the text "server"
        String supportTicketDescription1 = "The server is down!";
        String supportTicketDescription2 = "The mouse mat is missing!";
        String supportTicketDescription3 = "The servers need to be rebooted.";
        String supportTicketDescription4 = "Server problem: The servers need to be rebooted.";
        String supportTicketDescription5 = "I dropped my drink into the server";
        String supportTicketDescription6 = "SERVER down!";

        System.out.println(supportTicketDescription1.contains("server"));
        //output: true

        System.out.println(supportTicketDescription2.contains("server"));
        //output: false

        System.out.println(supportTicketDescription3.contains("server"));
        //output: true

        System.out.println(supportTicketDescription4.contains("server"));
        //output:true

        System.out.println(supportTicketDescription5.contains("server"));
        //output: true

        System.out.println(supportTicketDescription6.contains("server"));
        //output: false
        //this one is in uppercase, so SERVER wasn't caught.

        //how to get around case-sensitive searching:
        String serverProblem = "The SERVER is down!";
        String searchTerm = "server";

        if (serverProblem.toUpperCase().contains(searchTerm.toUpperCase())) {
            System.out.println("Found a server problem");
        } else {
            System.out.println("This is not a server problem");
        }
        //output: Found a server problem

        //double check: remove "toUpperCase":
        if (serverProblem.contains(searchTerm)) {
            System.out.println("Found a server problem");
        } else {
            System.out.println("This is not a server problem");
        }
        //output: This is not a server problem


        //to simplify the condition: you can make new variables:
        String uppercaseServerProblem = serverProblem.toUpperCase();
        String uppercaseSearchTerm = searchTerm.toUpperCase();
        if (uppercaseServerProblem.contains(uppercaseSearchTerm)) {
            System.out.println("Server problem");
        } else {
            System.out.println("Not a server problem");
            //output: Server problem
        }

        //why wouldn't you use .contains () to test if a class was an ITEC class?
        //or an email was an education email?

        String studentEmail = "abc.minneapolis.edu";
        System.out.println(studentEmail.contains(".edu"));
        String trickStudentEmail = "abc.edu@gmail.com";
        System.out.println(trickStudentEmail.contains(".edu"));
        //output: true
        //fix: use .endsWith()

        //split sentence into words:
        String sentence = "Intellij is a Java integrated development environment";

        //this will be an array use []
        String[] words = sentence.split(" ");
        System.out.println(words);

        String javaiDEs = "Intellij,Eclipse,NetBeans,Notepad++,VSCode";

        //split class identifier into department and code

        //trim - remove whitespace - spaces, tabes, newlines start and end of a string
        String userAddressInput = "  1503 Hennepin Ave  ";

        //format strings
        //printf - no newline - you need to add a /n
    }
}
