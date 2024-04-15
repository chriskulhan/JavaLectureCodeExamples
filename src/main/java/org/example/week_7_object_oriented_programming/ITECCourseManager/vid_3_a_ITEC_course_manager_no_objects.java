///* Another example: ITEC Course manager (slide 11):
//
//-ITEC course management program
//-For each course:
//-Store the name of the course
//-The code for the course (e.g. 1310, 1150)
//-The maximum number of students allowed
//-The names of all the students enrolled
//-Be able to enroll or un-enroll a student for a class
//-Program should be able to display all the info for a certain course
//
// */
//
//
//
//package org.example.week_7_object_oriented_programming.ITECCourseManager;
//
//import java.util.ArrayList;
//
////from Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week7_first_classes/ITECCourseManager_NoObjects.java
//
//public class vid_3_a_ITEC_course_manager_no_objects {
//
//    //not object-oriented,
//    //lots of variables
//    //nothing keeping all the different types of data together
//    //what if we want to ADD more types of data? Like the time the class meets, or the location, etc.
//
//    public static void main(String[] args) {
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
//        //commented out so this doesn't get confused
////        writeCourseInfo(maintenanceCourseName, maintenanceCourseCode, maintenanceCourseStudentList, maintenanceCourseMaxStudents);
////        writeCourseInfo(datacomCourseName, datacomCourseCode, datacomCourseStudentList, datacomCourseMaxStudents);
////    }
//
//    //print out the info: (commented out when used in ITECCourse_vid_3_working_version)
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
//    //removed this when added to: ITECCourse_vid_3_working_version
////    public static int getNumberOfStudents(ArrayList<String> students) {
////        return students.size();
//    }
//}
//
