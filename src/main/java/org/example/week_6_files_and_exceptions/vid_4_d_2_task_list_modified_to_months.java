package org.example.week_6_files_and_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class vid_4_d_2_task_list_modified_to_months {
    //code from: week4_lists: vid_5_loops_with_user_input_task_list_program

    public static void main(String[] args) throws IOException {

        String filename = "vid_4_d_2_months.txt";

        String[] months = { "Jan", "Feb", "Mar" };

//        List<String> months = new ArrayList<>();

        BufferedWriter bufferedWriter = new BufferedWriter((new FileWriter(filename)));


//        while (true) {
//            String data = stringInput("Please type a month, or press Enter to quit");
////            if (data.length() == 0) { //if use just presses Enter, the length of the text is 0
//            if (data.isEmpty()) { //could use this instead of this ^^^
//                break;
//            }
//            months.add(data);
//        }
//        System.out.println("Thank you, here are all the months you entered:");

        //this is an enhanced "for loop":
        for (String input : months) {
//            System.out.println(input);
            bufferedWriter.write(input);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        //written to file ("vid_4_d_2_months.txt") in JavaLectureCodeExamples:
        //Jan
        //Feb
        //Mar
    }
}