package org.example.week4_lists;

import java.util.Random;

public class vid_7_random_number_refresh {
    public static void main(String[] args) {

    //make a random number generator (rnd is often used)
        Random rnd = new Random();

    //# between 0-9
        int randomNumber = rnd.nextInt(10);

    //random number between 1 and 10:
        int randomNumberBetween1and10 = rnd.nextInt(10) + 1;

        System.out.println(randomNumber);
        //output: 5

        System.out.println(randomNumberBetween1and10);
        //output: 10

        //will add the output:
        System.out.println(randomNumber + randomNumberBetween1and10);
        //output: 15

        System.out.println(randomNumber + " " + randomNumberBetween1and10);
        //output: 8 7

    }
}
