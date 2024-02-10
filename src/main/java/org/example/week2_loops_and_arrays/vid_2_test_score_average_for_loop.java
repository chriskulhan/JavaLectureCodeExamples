package org.example.week2_loops_and_arrays;

import static input.InputUtils.doubleInput;

public class vid_2_test_score_average_for_loop {
    public static void main(String[] args) {
        //calculate the average of 5 test scores

        int numberOfTests = 5;
        double testScore;
        double testScoreSum = 0.0;
        double testScoreAverage;

        for (int test = 1; test <= numberOfTests ; test++) {
            testScore = doubleInput("Enter test score #" + test);
            testScoreSum = testScoreSum + testScore;
        }
        testScoreAverage = testScoreSum / numberOfTests;
        System.out.println("Average score = " + testScoreAverage);
        //question/output, (repeat x4):
        // Enter test score #1
        //30
        //Enter test score #2
        //24
        //Enter test score #3
        //90
        //Enter test score #4
        //45
        //Enter test score #5
        //98
        //Average score = 57.4
    }
}
