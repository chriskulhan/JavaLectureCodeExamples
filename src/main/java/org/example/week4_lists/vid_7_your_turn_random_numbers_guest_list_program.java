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


package org.example.week4_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.stringInput;
import static org.example.week4_lists.vid_5_your_turn_use_task_list_and_add_things.containsIgnoresCase;

public class vid_7_your_turn_random_numbers_guest_list_program {
    public static boolean main(String[] args) {
//        reference: my week_4 vid_5_loops_with_user_input_task_list_program
        //names of the guest:
        List<String> guestList = new ArrayList<>();

        while (true) {
            String name = stringInput("Please type the name of your next guest, or press just enter to finish:");
            if (name.isEmpty()) {
                break;
            }
            if (containsIgnoresCase(guestList, name)) {
                System.out.println("You already added " + name);
            } else {
                System.out.println("Adding " + name + " to list.");
                guestList.add(name);
            }

        }
        Collections.sort(guestList);
        System.out.println("Thank you, here are all of the names you added:");
        System.out.println(guestList);
    }
        //this is an enhanced "for loop":
//        for (String input : guestList) {
//            System.out.println(input);
//        }

        //reference: my week 4: vid_5_your_turn_use_task_list_and_add_things
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
