package org.example.week4;

import java.util.ArrayList;
import java.util.List;

public class vid_1_tree_array_list_example {
    public static void main(String[] args) {

        //Create arraylist
        List<String> trees = new ArrayList<>();

        //Add data at the end:
        trees.add("Pine");
        trees.add("Oak");
        trees.add("Elm");
        trees.add("Aspen");

        trees.add("Palm");

        //Add data at index 2, in the middle
        trees.add(2, "Palm");

        //Get by index, using "get" method
        System.out.println("Tree at index 1 is " + trees.get(1));
        //output: Tree at index 1 is Oak

//        //loop over all the trees and print them all:
        for (String tree : trees) {
            System.out.println(tree);
//            //output: Pine
            //Oak
            //Palm
            //Elm
            //Aspen
            //Palm
//        }
//
//        //remove data by value:
            trees.remove("Oak");
//
//        //remove data String at index 0, the first element:
            trees.remove(0);
////
            System.out.println(trees);
//        //output: [Palm, Elm, Aspen, Palm]
//
//      //does the array contain data? check using "contains":
            if (trees.contains("Aspen")) {
                System.out.println("Tree list contains Aspen");
//            //output: Tree list contains Aspen
//
//        }
                //how many things are in the array list? .size
                int numberOfTrees = trees.size();
                System.out.println("There are " + numberOfTrees + " trees in the list.");
//        //output: There are 6 trees in the list.
            }
        }
    }
}

//All the above can also be done with a LinkedList


