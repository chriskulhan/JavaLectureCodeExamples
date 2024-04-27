//package org.example.week_7_object_oriented_programming.ITECCourseManager;
//
//import java.util.ArrayList;
//
//public class ITEC_courses_vid_3_object_oriented_coding {
//    //where "ITEC_courses_vid_3_object_oriented_coding" is the name of the class and will be used to define things
//    //convention is to use Camel case that starts with a capital letter
//        //example: ThisIsAnExample of a class name
//        //NOT this_is_an_example
//        //also NOT: thisIsAnExample
//
//    public static void Main(String[] args) {
//
//        //create an example course:
//        String maintenanceCourseName = "Microcomputer Systems Maintenance";
//        int maintenanceCourseCode = 1310;
//        ArrayList<String> maintenanceCourseStudentList = new ArrayList<>();
//        int maintenanceCourseMaxStudents = 20;
//
//        //Add some students.   TODO check that we have not exceeded the max number for the class
//        maintenanceCourseStudentList.add("Anna");
//        maintenanceCourseStudentList.add("Bill");
//        maintenanceCourseStudentList.add("Carl");
//
//        //create another example course:
//        String datacomCourseName = "Data Communications";
//        int datacomCourseCode = 1425;
//        ArrayList<String> datacomCourseStudentList = new ArrayList<>();
//        int datacomCourseMaxStudents = 30;
//
//        //Add some students
//        datacomCourseStudentList.add("Dave");
//        datacomCourseStudentList.add("Ed");
//        datacomCourseStudentList.add("Flora");
//
//        //Print information about these courses
////        writeCourseInfo(maintenanceCourseName, maintenanceCourseCode, maintenanceCourseStudentList, maintenanceCourseMaxStudents);
////        writeCourseInfo(datacomCourseName, datacomCourseCode, datacomCourseStudentList, datacomCourseMaxStudents);
////    }
//
//    //print out the info:
////    public static void writeCourseInfo(String name, int code, ArrayList<String>students, int maxStudents) {
////        System.out.println("Course Name: " + name);
////        System.out.println("Course Code: " + code);
////        System.out.println("Students enrolled:");
////        for (String student : students) {
////            System.out.println(student);
////        }
////        System.out.println("There are " + getNumberOfStudents(students) + " students enrolled");
////        System.out.println("The max number of students that can enroll in this course is  " + maxStudents);
////    }
//
//
//    //this will be used to figure out if the number of students has exceeded the maximum.
////    public static int getNumberOfStudents(ArrayList<String> students) {
////        return students.size();
////    }
//
//}
