package org.example.week2_loops_and_arrays;

public class vid_4_example_arrays {
    public static void main(String[] args) {
        //example int array
        //create new array:
        int[] numbers = new int[5];

        //to put data in the array:
        numbers[0] = 4;
        numbers[1] = 100;

        //error: because the array goes from 0 to 4:
        //numbers[5] = 3;
        //output :
        // Exception in thread "Main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //	at org.example.week2_loops_and_arrays.vid_4_example_arrays.Main(vid_4_example_arrays.java:14)
        //
        //Process finished with exit code 1

//        String [] classNames = new String[3];
//        classNames[0] = "Java";
//        classNames[1] = "C#";
//        classNames[2] = "Web";
//
        //another way to put info into arrays:
        String [] classNames = {"Java", "C#", "Web"};

        System.out.println("One of the second year classes is " + classNames[0]);
        //output: One of the second year classes is Java

        //how would you print out "web" as one of the classNames?:
        System.out.println("One of the second year classes is " + classNames[2]);
        //output: One of the second year classes is Web

        //figure out how many classes there are:
        int numberOfClasses = classNames.length;
        System.out.println("There are " + numberOfClasses + " classes listed in this array");
        //output: There are 3 classes listed in this array


    }
}
