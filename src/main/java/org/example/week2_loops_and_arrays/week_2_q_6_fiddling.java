//package org.example.week2_loops_and_arrays;
//
//import java.util.Arrays;
//
//import static input.InputUtils.doubleInput;
//
//public class week_2_q_6_fiddling {
//    static String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//
//    public static void main(String[] args) {
//
//        // You don't need to modify this method.
//        double[] bills = getBillAmounts(months);
////        double average = averageBillAmount(bills);
////        System.out.printf("Your average bill is %.2f%n", average);
////        printBillTable(months, bills);
//
//    }
//
//    public static double[] getBillAmounts(String[] monthNames) {
//
//        //TODO ask user for bill amount for each of the months named in the monthNames array.
//        for (int month = 0; month < months.length; month++) {
//            String monthName = months[month];
//
//            //  Create a new double array.
//            double monthExpense = doubleInput("What was your " + monthName + "bill?");
//
//            //  Store values the user enters in this array.
//            monthExpense = monthExpense[month];
//            System.out.println(Arrays.toString(monthExpense));
//        }
//    }
//}
