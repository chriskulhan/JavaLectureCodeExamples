/*Instructions for Guest list program:  slides (51-54)

1. Create an empty list.
2. Use a while loop to ask the user for the names of guests. They will enter the names,
    one by one. Add each name to the list. When the user is done, they should press enter to
    stop adding names.

    -Your program should reject duplicate names. Don't add a name to the list if that name is
        already in the list.
3. Sort the names in alphabetical order
4. Print all the names entered
5. Ask the user if they would like to delete any names. Use a while loop so the user can delete as many
    names as needed. You can either use remove to delete by name, or delete by index. You can decide what
    the user should do to end this loop.
6. Print all the names again
7.Print the total number of guests
8.Comment your code!
9. Challenge: select a guest at random to win a prize. Print their name
10. Challenge: add validation to your program so it doesn't crash if the user enters invalid data.
    Places to add validation:
Check for valid names if removing by name; or check for valid indexes if removing names by index
End part 4's while loop if the user has removed all of the names from the guest list.
 */
// double checked from: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week4_list_data_structure/GuestList.java


package org.example.week4_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import static input.InputUtils.*;
import static org.example.week4_lists.vid_5_your_turn_use_task_list_and_add_things.containsIgnoresCase;
import static org.example.week4_lists.vid_7_claras_code_for_guest_list.printGuestNames;
import static org.example.week4_lists.vid_7_claras_code_for_guest_list.selectPrizeWinner;

public class vid_7_your_turn_random_numbers_guest_list_program {
    public static void main(String[] args) {
//        reference: my week_4 vid_5_loops_with_user_input_task_list_program
        //names of the guest:
        //1. create an empty list:
        List<String> guestList = new ArrayList<>();

//        2a. Use a while loop to ask the user for the names of guests:
        while (true) {
            String name = stringInput("Please type the name of your next guest, or press enter to finish:");
            //2b. When the user is done, they should press enter to stop adding names.
            if (name.isEmpty()) {
                break;
            }
            //goes to bottom (below main method) 2c. to check for duplicates:
            if (containsIgnoresCase(guestList, name)) {
                System.out.println("You already added " + name);
            } else {
                System.out.println("Adding " + name + " to list.");
                guestList.add(name);
            }

        }
        //3. Sort the names in alphabetical order:
        Collections.sort(guestList);
//        System.out.println("Thank you, here are all of the names you added:");
        //output: Thank you, here are all of the names you added:
        //[bob, cathy]

        //print out the guest names:
        printGuestNames(guestList);

        //remove guests if needed:
        //yesNoInput will return true if they do want to remove guests and false if they don't
        while (yesNoInput("Do you want to remove any guests?")) {
            System.out.println("Here are all the guests:");
            printGuestNames(guestList);

            if (guestList.isEmpty()) {
                System.out.println("There are no more guests to remove.");
                break;
            }
            int index = positiveIntInput("Enter the number beside the guest you want to remove:");
            index = (index - 1); //or index--;
            //make sure the index is less than the size of the array list:
            if (index < guestList.size()) {
                String removedGuest = guestList.remove(index);
                //print confirmation:
                System.out.println("Removed guest " + removedGuest);
            } else {
                System.out.println("Error - please enter a valid number of a guest.");
            }
        }
        //4. Print all the names entered:
        //4b. refine the way of printing by making a new method
//        System.out.println(guestList);
        printGuestNames(guestList);
        System.out.println("The number of guests in the guest list is " + guestList.size());

        //9. challenge select a guest at random to win prize:
        selectPrizeWinner(guestList);
    }

    public static void selectPrizeWinner(List<String> guests) {
        if (guests.isEmpty()) {
            System.out.println("Warning - There are no more guests to win.");
            return;
        }
        //clara's code: from https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week4_list_data_structure/GuestList.java
        //line 72-79
        Random rng = new Random();
        int randomGuestIndex = rng.nextInt(guests.size());  // 0, 1, 2, 3

        //save the name of the guest that won a prize in a variable:
        String prizeWinner = guests.get(randomGuestIndex);

        System.out.println("Guest number " + (randomGuestIndex + 1) + " " + prizeWinner + " wins a prize!");
    }

        //Clara writes another method to print guest names:
        //void method, won't return anything, only output data
        public static void printGuestNames(List <String> guests) {

            System.out.println("Your guest list is: \n");

            if (guests.isEmpty()) {
                System.out.println("There are no guests in the list.");
            } else {
                //loop through the names so each guest is given a number: (using regular for loop)
                for (int i = 0; i < guests.size(); i++) {
                    System.out.println((i + 1) + ": " + guests.get(i));
                }
            }
        }


        //reference: my week 4: vid_5_your_turn_use_task_list_and_add_things
        //2c. Your program should reject duplicate names: (place after main method)
        public static boolean containsIgnoresCase (List < String > list, String data){
            for (String item : list) {
                if (item.equalsIgnoreCase(data)) {
                    //if, after ignoring case, the item is found in the list:
                    return true;
                }
            }
            return false;
        }
    }

//input/output: Please type the name of your next guest, or press enter to finish:
//b
//Adding b to list.
//Please type the name of your next guest, or press enter to finish:
//c
//Adding c to list.
//Please type the name of your next guest, or press enter to finish:
//d
//Adding d to list.
//Please type the name of your next guest, or press enter to finish:
//
//Your guest list is:
//
//1: b
//2: c
//3: d
//Do you want to remove any guests? Y/N?
//y
//Here are all the guests:
//Your guest list is:
//
//1: b
//2: c
//3: d
//Enter the number beside the guest you want to remove:
//1
//Removed guest b
//Do you want to remove any guests? Y/N?
//y
//Here are all the guests:
//Your guest list is:
//
//1: c
//2: d
//Enter the number beside the guest you want to remove:
//1
//Removed guest c
//Do you want to remove any guests? Y/N?
//y
//Here are all the guests:
//Your guest list is:
//
//1: d
//Enter the number beside the guest you want to remove:
//1
//Removed guest d
//Do you want to remove any guests? Y/N?
//y
//Here are all the guests:
//Your guest list is:
//
//There are no guests in the list.
//There are no more guests to remove.
//Your guest list is:
//
//There are no guests in the list.
//The number of guests in the guest list is 0
//Warning - There are no more guests to win.
//
//Process finished with exit code 0