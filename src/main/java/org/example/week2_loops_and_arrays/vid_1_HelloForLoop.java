package org.example.week2_loops_and_arrays;

public class vid_1_HelloForLoop {
    public static void main(String[] args) {
        //(int x = 0) x is the loop counter variable
        //(x < 10) where do we stop counting? when x gets to 9 (x < 10), alternate phrasing: repeat while x is less than 10
        //(x = x + 1) OR x++ how to modify x after each loop? (x = x + 1), alternate shortcut: x++
        for (int x = 0 ; x < 10 ; x++) {
            //print value of x:
            //when it gets to 10, the loop will stop because 10 is NOT less than 10
            System.out.println(x);
            //output:
            //0
            //1
            //2
            //3
            //4
            //5
            //6
            //7
            //8
            //9
        }
    }
}
