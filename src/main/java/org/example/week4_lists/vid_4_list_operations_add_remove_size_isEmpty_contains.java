package org.example.week4_lists;

import java.util.ArrayList;
import java.util.List;

public class vid_4_list_operations_add_remove_size_isEmpty_contains {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Ceramics 1");
        classNames.add("Painting");
        classNames.add("Logic");

        System.out.println(classNames);
        //output: [Programming Logic, Ceramics 1, Painting, Logic]

        // how to remove items by object name: (internally will use .equals method)
        classNames.remove("Painting");
        System.out.println(classNames);
        //output: [Programming Logic, Ceramics 1, Logic]

        //how to remove items in a list by index number:
        classNames.remove(0); //int primitive type
        System.out.println(classNames);
        //output: [Ceramics 1, Logic]
//pause video at 2:58 for lunch
    }

}
