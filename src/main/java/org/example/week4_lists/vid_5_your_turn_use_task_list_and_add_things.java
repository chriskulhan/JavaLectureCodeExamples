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
//            if (todoList.contains(data)) {
                //when adding ignores case, this if statement ^^^ changes to this:
            if (containsIgnoresCase(todoList, data)) {
                System.out.println("This list already contains this list item, try again");
            } else {
                todoList.add(data);
            }
        }
            System.out.println("Thank you, here are all of the tasks you entered:");

            //this is an enhanced "for loop":
            for (String input : todoList) {
                System.out.println(input);
            }
        System.out.println("You have entered " + todoList.size() + " items to your To Do list.");
            //output: (note: I accidentally added a space after one of the "dance" terms, so if this were for real, would
            //need to cut spaces out of inputs:
        //Thank you, here are all of the tasks you entered:
        //sing
        //dance
        //dance
        //sleep
        //You have entered 4 items to your To Do list.
        }
        //write a new method to ignore case on inputs:
        public static boolean containsIgnoresCase (List<String> list, String data) {
        //test to see if the array list called "list" contains some data called "data"
            // (general method to find if something contains something else ignoring case:
            for(String item: list) {
                if (item.equalsIgnoreCase(data)) {
                    //if, after ignoring case, the item is found in the list:
                    return true;
                }
            }
            //if we don't find the item after ignoring case, return false:
            return false;
            //output: (after ignoring case)
            //Please type a task you need to do, or press Enter to quit
            //dance
            //Please type a task you need to do, or press Enter to quit
            //DANCE
            //This list already contains this list item, try again
            //Please type a task you need to do, or press Enter to quit
            //sing
            //Please type a task you need to do, or press Enter to quit
            //SINg
            //This list already contains this list item, try again
            //Please type a task you need to do, or press Enter to quit
            //play
            //Please type a task you need to do, or press Enter to quit

            //Thank you, here are all of the tasks you entered:
            //dance
            //sing
            //play
            //You have entered 3 items to your To Do list.
        }

    }
