package org.example.week3_methods_program_design;
//code in Clara's examples can be found here: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week2_loops_arrays/Table.java
//not the exact code (I wrote the below from the videos:

public class vid_7_string_formatting_display_data_in_a_table {
//    public static void Main(String[] args) {
//        int[] classCodes = {2545, 2505, 2560};
//        String[] classNames = {"Java", "C#", "Web"};

        //display an array with spaces filled in between:

//        for (int c = 0; c < classCodes.length; c++) {
//            int code = classCodes[c];
//            String name = classNames[c];
//            System.out.println(code + name);
            //output:
            //2545Java
            //2505C#
            //2560Web

        //how to put them in a table (with a column for the classCodes and a column for the classNames
//        public static void Main(String[] args) {
//            int[] classCodes = {2545, 2505, 2560};
//            String[] classNames = {"Java", "C#", "Web"};
//            for (int c = 0; c < classCodes.length; c++) {
//                int code = classCodes[c];
//                String name = classNames[c];
//            System.out.printf("%d%s", code, name);
            //output:2545Java2505C#2560Web

//    public static void Main(String[] args) {
//        int[] classCodes = {2545, 2505, 2560};
//        String[] classNames = {"Java", "C#", "Web"};
//        for (int c = 0; c < classCodes.length; c++) {
//            int code = classCodes[c];
//            String name = classNames[c];
//            System.out.printf("%d%s", code, name);
//            System.out.println();
            //output:
            // 2545Java
            //2505C#
            //2560Web

            //Make columns, aligned to the right
            //  ****by adding a positive number between the percent and variable signifier
            //in order to get spaces between the columns, add a number between the % sign and the variable signifier
            // **here number is 10, variable signifiers are d and s:
            //the 10 signifies a total of 10 characters including the characters found in the variable printed
            // (6 spaces, 4 characters with numbers, for example):

//    public static void Main(String[] args) {
//        int[] classCodes = {2545, 2505, 2560};
//        String[] classNames = {"Java", "C#", "Web"};
//        for (int c = 0; c < classCodes.length; c++) {
//            int code = classCodes[c];
//            String name = classNames[c];
//            System.out.printf("%10d%10s", code, name);
//            System.out.println();
            //output :
            //      2545      Java
            //      2505        C#
            //      2560       Web

            //Make columns, aligned to the left:
            //  ****by adding a negative number between the percent and variable signifier

//    public static void Main(String[] args) {
//        int[] classCodes = {2545, 2505, 2560};
//        String[] classNames = {"Java", "C#", "Web"};
//        for (int c = 0; c < classCodes.length; c++) {
//            int code = classCodes[c];
//            String name = classNames[c];
//            System.out.printf("%-10d%-10s", code, name);
//            System.out.println();
            //output:
            //2545      Java
            //2505      C#
            //2560      Web

            //add a heading to a table: place this: before the for loop:
//        System.out.printf("%-10s%-10s\n", "Code", "Name");
//
//            public static void Main(String[] args) {
//                int[] classCodes = {2545, 2505, 2560};
//                String[] classNames = {"Java", "C#", "Web"};
//        for (int c = 0; c < classCodes.length; c++) {
//            int code = classCodes[c];
//            String name = classNames[c];
//
//            System.out.printf("%-10d%-10s", code, name);
//            System.out.println();
            //output:
            //Code      Name
            //2545      Java
            //2505      C#
            //2560      Web

            //to make the above table cleaner, use a variable for the header and the table contents spacing:

//    public static void Main(String[] args) {
//        int[] classCodes = {2545, 2505, 2560};
//        String[] classNames = {"Java", "C#", "Web"};
//
//            String templateString = "%-10s%-10s\n";
//            System.out.printf(templateString, "Code", "Name");
//
//            for (int c = 0; c < classCodes.length; c++) {
//                int code = classCodes[c];
//                String name = classNames[c];
//
//                System.out.printf(templateString, code, name);
            //output:
                //Code      Name
                //2545      Java
                //2505      C#
                //2560      Web

            //to add an array to the table:
            public static void main(String[] args) {
                int[] classCodes = {2545, 2505, 2560};
                String[] classNames = {"Java", "C#", "Web"};
                //added array:

                double[] averageClassSizes = { 22.34233, 17.42323, 14.234234};

                String templateString = "%-10s%-10s%-10s\n";
                System.out.printf(templateString, "Code", "Name", "Ave Class Size");

                //make a new template string variable to allow for addition of new array data:
//                String tableTemplateString = "%-10d%-10s%-10.2f\n";
//
//                for (int c = 0; c < classCodes.length; c++) {
//                    int code = classCodes[c];
//                    String name = classNames[c];
//
//                    //add in the new array into the table:
//                    double averageClassSize = averageClassSizes[c];
//
//                    System.out.printf(tableTemplateString, code, name, averageClassSize);
                    //output:
                    //Code      Name      Ave Class Size
                    //2545      Java      22.342330
                    //2505      C#        17.423230
                    //2560      Web       14.234234

                    //change the String tableStringFormat to address the decimals shown:
                String tableTemplateString = "%-10d%-10s%-10.2f\n";

                for (int c = 0; c < classCodes.length; c++) {
                    int code = classCodes[c];
                    String name = classNames[c];

                    //add in the new array into the table:
                    double averageClassSize = averageClassSizes[c];

                    System.out.printf(tableTemplateString, code, name, averageClassSize);
                    //output:
                    //Code      Name      Ave Class Size
                    //2545      Java      22.34
                    //2505      C#        17.42
                    //2560      Web       14.23
        }
    }
}

//Clara's code about tables from:  https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week2_loops_arrays/Table.java
//package week2_loops_arrays;
//
///*
// * Using string formatting to display data in a table */
//
//public class Table {
//    public static void Main(String[] args) {
//
//        String[] classCodes = {"ITEC 2545", "ITEC 2560", "ITEC 2505", "ITEC 2905"};
//        String[] names = {"Java", "Web", "C#", "Capstone"};
//        int[] credits = {6, 6, 6, 4};
//
//        String headerFormatTemplate = "%-20s %-20s %-20s\n";
//
//        System.out.printf(headerFormatTemplate, "Class Code", "Class Name", "Credits");
//
//        for (int x = 0; x < classCodes.length; x++) {
//            String classCode = classCodes[x];
//            String name = names[x];
//            int credit = credits[x];
//
//            // %-20s means replace with a String, left-aligned within 20 spaces
//            // %20d means replace with an integer, right-aligned within 20 spaces
//            // if you omit the - for example %20s then the data will be right-aligned
//
//            String formatTemplate = "%-20s %-20s %-20d\n";
//            System.out.printf(formatTemplate, classCode, name, credit);
//        }
//
//    }
//}