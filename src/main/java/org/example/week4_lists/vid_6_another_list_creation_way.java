package org.example.week4_lists;

import java.util.List;

public class vid_6_another_list_creation_way {
    public static void main(String[] args) {

        //how to create a list without adding individually to it:
        //however---you can't change this list
        List<String> animals = List.of("Cat", "Bird", "Zebra");

        System.out.println(animals);
        //output: [Cat, Bird, Zebra]

        animals.add ("Frog"); //this won't work because the initial list can't be modified
        //
        animals.remove("Cat"); //this also won't work because the initial list can't be modified

        //output: [Cat, Bird, Zebra]
        //error parts because can't add or remove after making a fast list via "List.of"
        // Exception in thread "main" java.lang.UnsupportedOperationException
        //	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:142)
        //	at java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(ImmutableCollections.java:147)
        //	at org.example.week4_lists.vid_6_another_list_creation_way.main(vid_6_another_list_creation_way.java:15)
        //
        //Process finished with exit code 1
    }
}

