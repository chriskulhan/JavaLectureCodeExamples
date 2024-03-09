/* start with: vid_5_loops_with_user_input_task_list_program
(slide 44)

-Add a check to prevent duplicate items added
    -use contains()
    -print a message to the user
    -don't add the item to the list

-Print the total number of tasks

 */

package org.example.week4_lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class vid_5_your_turn_use_task_list_and_add_things {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();

        //how does the below "String data" interact with the above "todoList"? There is nothing tethering it together? No words match
        //Is it just because it's within the same method that the computer knows? <confused> (I think this is my main block
        //throughout this class. I don't know when the computer knows and when it doesn't.) I can pattern match and
        //make both "sides" of the code flow if I know the "pivot point" or how they talk to each other.

        while (true) {
            String data = stringInput("Please type a task you need to do, or press Enter to quit");
//            if (data.length() == 0) { //if use just presses Enter, the length of the text is 0
            if (data.isEmpty()) { //could use this instead of this ^^^
                break;
            }
            while (true) {
                for (String dataEntered : data) {
                    if (data.contains(dataEntered)) {
                        System.out.println("This list already contains this list item, try again");
                        break;
                    }
                }
                todoList.add(data);
            }
            System.out.println("Thank you, here are all of the tasks you entered:");

            //this is an enhanced "for loop":
            for (String input : todoList) {
                System.out.println(input);
                //output:
                //Thank you, here are all of the tasks you entered:
                //do laundry
                //wash dishes
                //rake leaves
                //clean bathroom
            }
        }
    }
}
//to push