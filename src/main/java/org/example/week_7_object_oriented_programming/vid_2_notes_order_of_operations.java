/*vid_2_notes:

0. check to see what happens when you try to look in vid_1_swimmingPoolProgram at what lives in
    the como object by printing it:
    // System.out.println(como);
        //output: org.example.week_7_object_oriented_programming.poolexample.vid_1_objects_pool@5674cd4d
        //why? telling us what type of object it is, but the memory address (@5674cd4d) isn't very useful
        //in order to make this better, make a toString(); instance method in vid_1_objects_pool to

1. add a new "instance method" to vid_1_objects_pool called toString() to deal with the como object:

    public String toString() {
        String description = this.nameField + " pool is " + this.lengthField + " meters long.";
        return description;
        }

2. rerun after adding this "toString" instance method in vid_1_objects_pool:

            //public String toString() {
        //        String description = this.nameField + " pool is " + lengthField + " meters long.";
        //        return description;

        System.out.println(como); (this is printed in vid_1_swimmingPoolProgram)
        //output: Como Park pool is 80.0 meters long.
        //this is the string from the toString method ^^^

        //see what this might look like for ymca:
        System.out.println(ymca); (this is printed in vid_1_swimmingPoolProgram)
        //output: YMCA pool is 50.0 meters long.
        //this has used the toString instance method in vid_1_objects_pool to make this string ^^^

3. notes on "this.", can use this.lengthField or just lengthField if the variables can't be confused with each other
    (I personally will NOT be doing this, but Clara must be telling us this because there will be
        something coming up that will do this)

        examples:
        a. in vid_1_objects_pool:
            this.nameField = nameParameter;
            //could be nameField = nameParameter; (without the "this." because it can't be confused)

        b. in vid_1_objects_pool:
            this.lengthField = lengthParameter;
            //could be lengthField = lengthParameter; (without the "this." because it can't be confused)

        c. in vid_1_objects_pool:
            double total = laps * this.lengthField; //this could be shortened to: "return lap * this.lengthField;"
            //this could also be: double total = laps * lengthField; (because "this." isn't always necessary if it can't be confused)

        d. in vid_1_objects_pool:
            public String toString() {
            String description = this.nameField + " pool is " + this.lengthField + " meters long.";
            //could instead be: String description = nameField + " pool is " + lengthField + " meters long.";
            return description;
            }
4. in vid_1_objects_pool:
    add an @Override before the toString() method in vid_1_objects_pool vvv:

    //public String toString() {
    //        String description = this.nameField + " pool is " + this.lengthField + " meters long.";
    //        //could instead be: String description = nameField + " pool is " + lengthField + " meters long.";
    //        return description;
    //        }

 */



package org.example.week_7_object_oriented_programming;

public class vid_2_notes_order_of_operations {
}
