package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class vid_3_removing_from_list {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");
        System.out.println(classNames);
        //output: [Programming Logic, Web Client Server, Project Management, Info Tech Concepts]

        //Remove a known item (by value) from a list:
        classNames.remove("Project Management"); //internally will use .equals to find this
        System.out.println(classNames);
        //output:[Programming Logic, Web Client Server, Info Tech Concepts]

        //remove by position (by index):
        classNames.remove(0); //int primitive type
        System.out.println(classNames);
        //output: [Web Client Server, Info Tech Concepts]

        //how does Java know if you are asking to remove an object or an int?

        //how do you remove a number from a list?
        //**Go to vid_3_removing_numbers_from_list_claras_code

        //if you try and remove something that's not there, nothing happens
        classNames.remove("bobobobo"); //object
        System.out.println(classNames);
        //nothing happens: output: [Web Client Server, Info Tech Concepts]

        //in order to see if something was removed, add the boolean wasRemoved before: (false)
        boolean wasRemoved = classNames.remove("booboo");
        System.out.println(classNames + " " + wasRemoved);
        //output: [Web Client Server, Info Tech Concepts] false
        //false because it wasn't removed^^^

        //to see if something was removed (true): make a new boolean variable (wasRemoved)
        boolean wasRemovedInfoTechConcepts = classNames.remove("Info Tech Concepts");
        System.out.println(classNames + " " + wasRemovedInfoTechConcepts);
        //output: [Web Client Server] true
        System.out.println(classNames);
        //output: [Web Client Server]

        //to modify an element in the list: use .set(index place, contents)
        classNames.set(0, "Systems Analysis");
        System.out.println(classNames);
        //output: [Systems Analysis]

        //if index is out of range, the code won't run:
//        classNames.set(1, "Systems Analysis");
//        System.out.println(classNames);
        //output:
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
        //	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
        //	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        //	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        //	at java.base/java.util.Objects.checkIndex(Objects.java:385)
        //	at java.base/java.util.ArrayList.set(ArrayList.java:470)
        //	at org.example.week4.vid_3_removing_from_list.main(vid_3_removing_from_list.java:56)
        //Process finished with exit code 1

        //how to find if an element is in a condition: .contains:
        if (classNames.contains("C# Programming")) {
            System.out.println("The list does contain C#");
        } else {
            System.out.println("The list does NOT contain C#");
            //output: The list does NOT contain C#
        }

        //use a variable with the contains method (.contains) to find if an element is in a condition: (doesn't)
        String search = "C# Programming";
        //use the variable ^^^ "search" in the contains method:
        if (classNames.contains(search)) {
            //use the variable in the output as well:
            System.out.println("The list does contain " + search);
        } else {
            System.out.println("The list does NOT contain " + search);
            //output: The list does NOT contain C# Programming
        }

        //use a variable with the contains method (.contains) to find if an element is in a condition: (does)
        String searchAgain = "Systems Analysis";
        //use the variable ^^^ "search" in the contains method:
        if (classNames.contains(searchAgain)) {
            //use the variable in the output as well:
            System.out.println("The list does contain " + searchAgain);
        } else {
            System.out.println("The list does NOT contain " + searchAgain);
            //output: The list does contain Systems Analysis
        }

        //to find the length of a list, use the size method (.size):
        System.out.println(classNames.size());
        //output: 1

        //Remove everything from the list using the clear method (.clear):
        classNames.clear();
        System.out.println(classNames);
        //output: []

        //print size again:
        System.out.println(classNames.size()); //returns length of list:
        //output: 0

        System.out.println(classNames.isEmpty()); //returns true/false
        //output: true
    }
}
