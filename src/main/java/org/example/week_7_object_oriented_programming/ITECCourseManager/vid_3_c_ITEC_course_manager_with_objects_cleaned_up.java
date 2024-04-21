////notes from slide
//
//package org.example.week_7_object_oriented_programming.ITECCourseManager;
//
//import java.util.ArrayList;
//
//public class vid_3_c_ITEC_course_manager_with_objects_cleaned_up {
//
//    public static void main(String[] args) {
//
//        //when write "new ITECCourse_vid_3_working_version();", you are calling a constructor that
//        //was just added here: ITECCourse_vid_3_working_version that looks like this:
//        //    ITECCourse_vid_3_working_version(String courseName, int courseCode, int courseMaxStudents) {
//        //        nameField = courseName;
//        //        codeField = courseCode;
//        //        maxStudentsField = courseMaxStudents;
//
//        //^^^That constructor does NOT live here!
//
//        //Add 3 arguments that come from the constructor:
//        //from this:
////        ITECCourse_vid_3_working_version maintenanceCourse = new ITECCourse_vid_3_working_version();
//        //to this:
//        ITECCourse_vid_3_working_version maintenanceCourse = new ITECCourse_vid_3_working_version
//                ("Microcomputer Systems Maintenance", 1310, 20);
//
//        //take the below vvv info and put it in the argument place (in the parentheses) above^^^
////        maintenanceCourse.nameField = "Microcomputer Systems Maintenance";
////        maintenanceCourse.codeField = 1310;
////
////        ArrayList<String> maintenanceCourseStudentList = new ArrayList<>(); // todo ask: this wasn't used????
////
////        maintenanceCourse.maxStudentsField = 20;
//
//        //Add some students.
//        // TODO check that we have not exceeded the max number for the class, still need to do
//        //  (this will happen in ITECCourse_vid_3_working_version)
//
//        maintenanceCourse.addStudent("Anna");
//        maintenanceCourse.addStudent("Bill");
//        maintenanceCourse.addStudent("Carl");
//
//        maintenanceCourse.writeCourseInfo();
//
//        //take this:
////        ITECCourse_vid_3_working_version datacomCourse = new ITECCourse_vid_3_working_version();
//
//        //add the below vv  parameters/arguments within the parentheses to here:
//        ITECCourse_vid_3_working_version datacomCourse = new ITECCourse_vid_3_working_version
//                ("Data Communications",1425,30);
//
////        datacomCourse.nameField = "Data Communications";
////        datacomCourse.codeField = 1425;
////
////        ArrayList<String> datacomCourseStudentList = new ArrayList<>(); todo: what happens to this?
////
////        datacomCourse.maxStudentsField = 30;
//
//
//        datacomCourse.addStudent("Dave");
//        datacomCourse.addStudent("Ed");
//        datacomCourse.addStudent("Flora");
//
//        datacomCourse.writeCourseInfo();
//
//    }
//}
//
////output: (same output after adding constructor (to other file) and parameters in the parentheses to this file):
////Course Name: Microcomputer Systems Maintenance
////Course Code: 1310
////Students enrolled:
////Anna
////Bill
////Carl
////There are 3 students enrolled
////The max number of students that can enroll in this course is  20
////Course Name: Data Communications
////Course Code: 1425
////Students enrolled:
////Dave
////Ed
////Flora
////There are 3 students enrolled
////The max number of students that can enroll in this course is  30
//
