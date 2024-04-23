//package org.example.week_7_object_oriented_programming.ITECCourseManager;
//
//import java.util.ArrayList;
//
////from: vid_3_a_ITEC_course_manager_no_objects.java
////originally from Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week7_first_classes/ITECCourseManager_NoObjects.java
//public class vid_3_b_ITEC_course_manager_with_objects {
//    //not object-oriented,
//    //lots of variables
//    //nothing keeping all the different types of data together
//    //what if we want to ADD more types of data? Like the time the class meets, or the location, etc.
//
//    public static void main(String[] args) {
//
//        //this name 'ITECCourse_vid_3_working_version' isn't convention, but I'm using while I'm learning:
//        //this line (just below vv) creates the new 'ITECCourse_vid_3_working_version' course object
//        //it will represent "Microcomputer Systems Maintenance".
//        ITECCourse_vid_3_working_version maintenanceCourse = new ITECCourse_vid_3_working_version();
//
//       //change this:
////        String maintenanceCourseName = "Microcomputer Systems Maintenance";
//
//        //to this:
//        maintenanceCourse.nameField = "Microcomputer Systems Maintenance";
//
//        //change this:
////        int maintenanceCourseCode = 1310;
//
//        //to this:
//        maintenanceCourse.codeField = 1310;
//
//        //leave this arraylist alone:
//        ArrayList<String> maintenanceCourseStudentList = new ArrayList<>();
//
//        //change this:
////        int maintenanceCourseMaxStudents = 20;
//
//        //to this:
//        maintenanceCourse.maxStudentsField = 20;
//
//        //Add some students.
//        // TODO check that we have not exceeded the max number for the class, still need to do
//        //  (this will happen in ITECCourse_vid_3_working_version)
//        //change these:
////        maintenanceCourseStudentList.add("Anna");
////        maintenanceCourseStudentList.add("Bill");
////        maintenanceCourseStudentList.add("Carl");
//
//        //to these:
//        maintenanceCourse.addStudent("Anna");
//        maintenanceCourse.addStudent("Bill");
//        maintenanceCourse.addStudent("Carl");
//
//        //find out info about the ITEC course and who is registered by adding:
//        maintenanceCourse.writeCourseInfo();
//
//        //create another example course:
//
//        ITECCourse_vid_3_working_version datacomCourse = new ITECCourse_vid_3_working_version();
//        //change this:
////        String datacomCourseName = "Data Communications";
//
//        //to this:
//        datacomCourse.nameField = "Data Communications";
//
//        //change this:
////        int dataComCourseCode = 1425;
//
//        //to this:
//        datacomCourse.codeField = 1425;
//
//        //leave this arraylist alone:
//        ArrayList<String> datacomCourseStudentList = new ArrayList<>();
//
//        //change this:
////        int dataComCourseMaxStudents = 30;
//
//        //to this:
//        datacomCourse.maxStudentsField = 30;
//
//        //change this:
////        //Add some students
////        datacomCourseStudentList.add("Dave");
////        datacomCourseStudentList.add("Ed");
////        datacomCourseStudentList.add("Flora");
//
//        //to this:
//        //Add some students
//        datacomCourse.addStudent("Dave");
//        datacomCourse.addStudent("Ed");
//        datacomCourse.addStudent("Flora");
//
//        //this:
//        datacomCourse.writeCourseInfo();
//
//        //replaces these "writeCourseInfo" things:
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
////when run: output:
////Course Name: Microcomputer Systems Maintenance
////Course Code: 1310
////Students enrolled:
////Anna
////Bill
////Carl
////There are 3 students enrolled
////The max number of students that can enroll in this course is  20
////Course Name: Microcomputer Systems Maintenance
////Course Code: 1310
////Students enrolled:
////Anna
////Bill
////Carl
////There are 3 students enrolled
////The max number of students that can enroll in this course is  20
//
////___________________________****************__________________
////when this is run, there are some things that are ported from here:
////vid_3_b_ITEC_course_manager_with_objects to here: ITECCourse_vid_3_working_version and
////back again.
//
////the shape the data is ported into is from the "writeCourseInfo" method in ITECCourse_vid_3_working_version
//
////the individual data pieces are housed in: vid_3_b_ITEC_course_manager_with_objects
//
////output:
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