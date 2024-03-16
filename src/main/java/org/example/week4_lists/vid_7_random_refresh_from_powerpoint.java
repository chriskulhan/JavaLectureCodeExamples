package org.example.week4_lists;

import java.util.Random;

public class vid_7_random_refresh_from_powerpoint {
    public static void main(String[] args) {
        //create a Random object - this is the random number generator:
        Random random = new Random();

        int randomNumber = random.nextInt(10); //generate a number between 0 and 9;
        System.out.println("Random secret number between 0 and 9 = " + randomNumber);

        int anotherRandomNumber = random.nextInt(1000); //Generate a random number between 0 and 999
        System.out.println("Another random number between 0 and 999 = " + anotherRandomNumber);

        ///What if you want a random number between 1 and 10? (instead of 0 to 9?)
        //generate a random number between 0 and 9, then add 1 to it, so 0 is 1, 1 is 2, etc.

        int andAnotherRandomNumber = random.nextInt(10) + 1;
        System.out.println("And another random number between 1 and 10 = " + andAnotherRandomNumber);

        //random number between 5 and 12:
        //generate a random number from 0-7, then add 5 to it:
        int yetAnotherRandomNumber = random.nextInt(7) + 5;
        System.out.println("Yet another random number between 5 and 12 = " + yetAnotherRandomNumber);

        //output:
        //Random secret number between 0 and 9 = 8
        //Another random number between 0 and 999 = 646
        //And another random number between 1 and 10 = 6
        //Yet another random number between 5 and 12 = 6

        //rerun output:
        //Random secret number between 0 and 9 = 3
        //Another random number between 0 and 999 = 406
        //And another random number between 1 and 10 = 5
        //Yet another random number between 5 and 12 = 10
    }
}

