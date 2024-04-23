///*
//****Waterfall method****** (doing these steps in order) (week3, slide31 from Clara's powerpoint)
//
//Creating a program: Major steps
//-Requirements (instructions)
//    -Gather, Analyze
//-Design (how to structure and engineer a solution)
//-Code
//-Integration (do different parts of a program, and see if they connect with what already exists)
//-Testing
//-Delivery
//
//**for real world app:
//-Maintenance
//-Retirement
//
//****Waterfall method problems: *** (slide 32)
//
//-What do you do if a problem arises in a stage ---> you realize you need to revisit an earlier stage?
//    -For example, you are in the implementation stage ---> you need to revisit the requirements?
//    -If you encounter problems in integration; parts don't work together?
//    -Or your customer decides they need an extra feature?
//    -Or technology changes ---> now you need to do things differently?
//    -This happens a lot – ****expect your requirements to change!****
//-In the classic waterfall, you can't do this – the deadline has passed and there's no time or resources
//      to go back to the earlier stage
//-Early software development used this model, and it was responsible for many major failed pieces of software
//-http://www.codinghorror.com/blog/2006/05/the-long-dismal-history-of-software-project-failure.html
//
//
//*******An Agile (prototyping) development model works well for small projects*** (slide 33)
//
//-Read and understand the requirements
//-Identify a high-level design
//-Build a basic, working prototype with minimal feature set
//--Regular communication:
//    -Review requirements and refine the prototype – add features, improve quality, test with respect to the requirements
//    -Have regular quick, informal meetings – often daily - so everyone knows what is going on
//-Repeat until the project is done
//
//******Advantages of Agile******* (slide 34)
//
//-Response to change in requirements is fast
//-Issues encountered in one stages can be addressed in other stages (e.g. design problem found in coding can be fixed)
//-New ideas can be added
//-There's always a working program (even if it isn't complete yet) – helpful to show to the customer
//    to get their feedback and input
//-Components are integrated earlier, and integrations issues can be dealt with
//    -Continuous integration/continuous deployment - adding new code as it's written; even adding it to
//    the live version of the product checking everything still works
//-Programmers tend to like Agile (not rigid and structured)
//
//*****Agile Development Methodology***
//
//-Trying to do everything perfectly, in order, is almost impossible
//-Building a minimal version and adding features until the app is done, is usually more successful
//-In the right environment, for the right project with the right team, Agile can work very well
//-An Agile/prototyping methodology also works well with class projects
//
// */
//
///*Build: Car Tire shopper program  (using Agile) --slide 36--
//
//**should find price per mile warranty
//
//-Requirement: create a price comparison program for a customer buying car tires
//-Car tires are sold with specific warranties, in miles driven, which roughly corresponds
//    to how long the Tire is expected to last
//-Cheaper tires (usually) have shorter warranties
//-There are many different tires with different prices and warranties
//-The program should help the user decide which Tire is best value for money, by calculating
//    and comparing price-per-miles for two or more tires
// */
//
////from Clara's code:https://github.com/claraj/Java2545Examples/tree/main/src/main/java/week3_methods/tires
//
//package org.example.week3_methods_program_design;
//
//import static input.InputUtils.*;
//
//public class vid_8_methods_program_design_tire_warranty {
//    //iteration one:
////    public static void main(String[] args) {
////
////        //for Agile method, start here:
////
////        //get input from the user on the type of Tire:
////        String tireName = stringInput("Enter the name of the Tire:");
////
////        //price of the Tire:
////        double price = doubleInput("Enter the price for a " + tireName + " Tire:");
////
////        //how many miles is the warranty? (example; 65000)
////        double miles = doubleInput("Enter the warranty miles for " + tireName);
////
////        //figure out the price per mile:
////        double pricePerMile = price / miles;
////        System.out.println("The " + tireName + " Tire costs $" + pricePerMile + " dollars per mile. ");
////
////        //output:
////        //Enter the name of the Tire:
////        //goodyear
////        //Enter the price for a goodyear Tire:
////        //56
////        //Enter the warranty miles for goodyear
////        //35000
////        //The goodyear Tire costs $0.0016 dollars per mile.
////
////    }
////}
//
////    //iteration two: Make the set of variables their own method:
////    public static void main(String[] args) {
////        //call the method from this place:
////        String report = getTireInfo();
////        System.out.println(report);
////    }
////
//////here is the method:
////    public static String getTireInfo() {
////        //get input from the user on the type of Tire:
////        String tireName = stringInput("Enter the name of the Tire:");
////
////        //price of the Tire:
////        double price = doubleInput("Enter the price for a " + tireName + " Tire:");
////
////        //how many miles is the warranty? (example; 65000)
////        double miles = doubleInput("Enter the warranty miles for " + tireName);
////
////        //figure out the price per mile:
////        double pricePerMile = price / miles;
////        System.out.println("The " + tireName + " Tire costs $" + pricePerMile + " dollars per mile. ");
////
////        //output:
////        //Enter the name of the Tire:
////        //goodyear
////        //Enter the price for a goodyear Tire:
////        //56
////        //Enter the warranty miles for goodyear
////        //35000
////        //The goodyear Tire costs $0.0016 dollars per mile.
////        return tireName; //had to add this for the program to run
////        //output:
////        //Enter the name of the Tire:
////        //goodyear
////        //Enter the price for a goodyear Tire:
////        //56
////        //Enter the warranty miles for goodyear
////        //34000
////        //The goodyear Tire costs $0.0016470588235294118 dollars per mile.
////        //goodyear
////    }
////}
////
////    //iteration three: add in how many tires the user is buying and make a loop:
////    public static void main(String[] args) {
////        //add input from user about the number of tires:
////        int numberOfTiresToCompare = positiveIntInput("How many different types of tires are you comparing?");
////
////        //create a loop:
////        for (int t = 0; t < numberOfTiresToCompare; t++) {
////
////        //call the method from this place:
////        String report = getTireInfo();
////        System.out.println(report);
////    }
////        }
////
////    //here is the method:
////    public static String getTireInfo() {
////        //get input from the user on the type of Tire:
////        String tireName = stringInput("Enter the name of the Tire:");
////
////        //price of the Tire:
////        double price = doubleInput("Enter the price for a " + tireName + " Tire:");
////
////        //how many miles is the warranty? (example; 65000)
////        double miles = doubleInput("Enter the warranty miles for " + tireName);
////
////        //figure out the price per mile:
////        double pricePerMile = price / miles;
////        System.out.println("The " + tireName + " Tire costs $" + pricePerMile + " dollars per mile. ");
////
////        return tireName;
////        //output:
////        //How many different types of tires are you comparing?
////        //2
////        //Enter the name of the Tire:
////        //good year
////        //Enter the price for a good year Tire:
////        //burnout
////        //Error - please enter a number.
////        //Enter the price for a good year Tire:
////        //24
////        //Enter the warranty miles for good year
////        //34000
////        //The good year Tire costs $7.058823529411765E-4 dollars per mile.
////        //good year
////        //Enter the name of the Tire:
////        //bridge
////        //Enter the price for a bridge Tire:
////        //30
////        //Enter the warranty miles for bridge
////        //20000
////        //The bridge Tire costs $0.0015 dollars per mile.
////        //bridge
////    }
////}
////
/////* Problem: The user sees the report, and the data entry, mixed together (slide 42)
////It's hard to compare
////Can we save all the data as the user enters it,
////And then print all the reports together?
////
////*****How can we save several pieces of data?
////
////*/
//
///*Iteration four: //iteration three: add in how many tires the user is buying and make a loop:
//
// */
//    public static void main(String[] args) {
//
//        int numberOfTiresToCompare = positiveIntInput("How many different types of tires are you comparing?");
//
//        // add the user input data to an array instead of printing it:
//        //it needs to be as long as the numberOfTiresToCompare:
//        String[] tireReports = new String [numberOfTiresToCompare];
//
//        for (int t = 0; t < numberOfTiresToCompare; t++) {
//
//        String report = getTireInfo();
//        //no longer printing this info below, but adding it to an array above:
//        //System.out.println(report);
//
//        //save the info that was previously in the string array in the string array "tireReports" (above)
//        //Here is where you save the info to the array "tireReports" (within a loop)
//            // [t] is read "element t" and is the loop counter:
//            tireReports [t] = report;
//    }
//        //print a report table here:
//        printReportTable(tireReports);
//
//        }
//    //use "alt" "enter" when "printReportTable" is red in color to create the method from just above:
//    private static void printReportTable(String[] tireReports) {
//        // loop over each Tire:
//        for (int t = 0 ; t < tireReports.length; t++) {
//            System.out.println(tireReports[t]);
//        }
//
//    }
//
//    //here is the method:
//    public static String getTireInfo() {
//        //get input from the user on the type of Tire:
//        String tireName = stringInput("Enter the name of the Tire:");
//
//        //price of the Tire:
//        double price = doubleInput("Enter the price for a " + tireName + " Tire:");
//
//        //how many miles is the warranty? (example; 65000)
//        double miles = doubleInput("Enter the warranty miles for " + tireName);
//
//        //figure out the price per mile:
//        double pricePerMile = price / miles;
//        System.out.println("The " + tireName + " Tire costs $" + pricePerMile + " dollars per mile. ");
//
////        return tireName;
//
//    }
//}
//

//I give up following this. I just input Clara's code under vid_8_tires1-final_claras_code

