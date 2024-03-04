/*Your turn
Write method called makeArrayUppercase
It should take a String array as an argument
It will convert all the elements in the array to uppercase characters
It should NOT return anything – the return type should be void
Test your method by writing a main method to create an example String array,
    and passing it to your method, and then displaying all the elements in the
    array to verify they are now uppercase

 */

package org.example.week3_methods_program_design;

import java.util.Arrays;

public class vid_9_your_turn_makeArrayUpperCase {
    public static void main(String[] args) {
    String[] fruits = {"banana", "apple", "mango"};
    makeArrayUpperCase(fruits);
        System.out.println(Arrays.toString(fruits));
        //output: [BANANA, APPLE, MANGO] *uses the below method to get this.
    }
public static void makeArrayUpperCase(String[] array) {
        for (int x = 0; x < array.length; x++) {
            array[x] = array[x].toUpperCase();
        }
}
}
