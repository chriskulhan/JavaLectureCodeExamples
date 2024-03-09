package org.example.week4_lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class vid_5_loops_with_user_input_task_list_program {
    public static void main(String[] args) {
        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Please type a task you need to do, or press Enter to quit");
//            if (data.length() == 0) { //if use just presses Enter, the length of the text is 0
                if (data.isEmpty()) { //could use this instead of this ^^^
                break;
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
