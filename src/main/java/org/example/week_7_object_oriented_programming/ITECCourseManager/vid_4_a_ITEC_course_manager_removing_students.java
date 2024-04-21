package org.example.week_7_object_oriented_programming.ITECCourseManager;

public class vid_4_a_ITEC_course_manager_removing_students {

    public static void main(String[] args) {

        //when write "new ITECCourse_vid_3_working_version();", you are calling a constructor that
        //was just added here: ITECCourse_vid_3_working_version that looks like this:
        //    ITECCourse_vid_3_working_version(String courseName, int courseCode, int courseMaxStudents) {
        //        nameField = courseName;
        //        codeField = courseCode;
        //        maxStudentsField = courseMaxStudents;

        //^^^That constructor does NOT live here!

        //Add 3 arguments that come from the constructor:
        //from this:
//        ITECCourse_vid_3_working_version maintenanceCourse = new ITECCourse_vid_3_working_version();
        //to this:
        ITECCourse_vid_3_working_version maintenanceCourse = new ITECCourse_vid_3_working_version
                ("Microcomputer Systems Maintenance", 1310, 20);

        //take the below vvv info and put it in the argument place (in the parentheses) above^^^
//        maintenanceCourse.nameField = "Microcomputer Systems Maintenance";
//        maintenanceCourse.codeField = 1310;
//
//        ArrayList<String> maintenanceCourseStudentList = new ArrayList<>(); // todo ask: this wasn't used????
//
//        maintenanceCourse.maxStudentsField = 20;

        //Add some students.
        // TODO check that we have not exceeded the max number for the class, still need to do
        //  (this will happen in ITECCourse_vid_3_working_version)

        maintenanceCourse.addStudent("Anna");
        maintenanceCourse.addStudent("Bill");
        maintenanceCourse.addStudent("Carl");

        //remove student
        maintenanceCourse.removeStudent("Carl");
        //part of output: Carl was un-enrolled from Microcomputer Systems Maintenance
        //AND now Carl doesn't appear in the output

        maintenanceCourse.removeStudent("Mark");
        //part of output:
        //Mark was not found in Microcomputer Systems Maintenance

        maintenanceCourse.writeCourseInfo();

        //take this:
//        ITECCourse_vid_3_working_version datacomCourse = new ITECCourse_vid_3_working_version();

        //add the below vv  parameters/arguments within the parentheses to here:
        ITECCourse_vid_3_working_version datacomCourse = new ITECCourse_vid_3_working_version
                ("Data Communications",1425,30);

//        datacomCourse.nameField = "Data Communications";
//        datacomCourse.codeField = 1425;
//
//        ArrayList<String> datacomCourseStudentList = new ArrayList<>(); todo: what happens to this?
//
//        datacomCourse.maxStudentsField = 30;


        datacomCourse.addStudent("Dave");
        datacomCourse.addStudent("Ed");
        datacomCourse.addStudent("Flora");

        datacomCourse.writeCourseInfo();

        ITECCourse_vid_3_working_version softwareDevelopmentProjectsCourse = new ITECCourse_vid_3_working_version
                ("Software Development Projects",2903,24);

        softwareDevelopmentProjectsCourse.addStudent("Larry");
        softwareDevelopmentProjectsCourse.addStudent("Moe");
        softwareDevelopmentProjectsCourse.addStudent("Curly");
        softwareDevelopmentProjectsCourse.addStudent("June");

        softwareDevelopmentProjectsCourse.writeCourseInfo();

        int totalEnrolled = softwareDevelopmentProjectsCourse.getNumberOfStudents();
//        System.out.println("The total number of students enrolled in Software Development is " + totalEnrolled);
//        System.out.println("The total number of students enrolled in " + softwareDevelopmentProjectsCourse.nameField
//            + " course is " + totalEnrolled);
            System.out.println("The total number of students enrolled in " + softwareDevelopmentProjectsCourse.getNameField()
                + " course is " + totalEnrolled);


        //print the code:
        //add in the access modifiers (getter method:)
//        System.out.println("ITEC " + softwareDevelopmentProjectsCourse.codeField + " "
//                + softwareDevelopmentProjectsCourse.nameField);
        //output: ITEC 2903 Software Development Projects

        System.out.println("ITEC " + softwareDevelopmentProjectsCourse.getCodeField() + " "
                + softwareDevelopmentProjectsCourse.getNameField());

//        System.out.println("ITEC " + softwareDevelopmentProjectsCourse.codeField + " "
//                + softwareDevelopmentProjectsCourse.nameField);
        System.out.println("ITEC " + softwareDevelopmentProjectsCourse.getCodeField() + " "
                + softwareDevelopmentProjectsCourse.getNameField());

        //modify the fields (change the max students):
//        softwareDevelopmentProjectsCourse.maxStudentsField = 30;

        softwareDevelopmentProjectsCourse.setMaxStudentsField(30);
        softwareDevelopmentProjectsCourse.writeCourseInfo();

        //now output includes the max students allowed is 30:
        //output: The max number of students that can enroll in this course is 30

        ITECCourse_vid_3_working_version smallCourse = new ITECCourse_vid_3_working_version
                ("Made up course",4567,3);
        smallCourse.addStudent("Joe");
        smallCourse.addStudent("Eryn");
        smallCourse.addStudent("Amanda");

        //remove a student to see if the max student limitation added here: ITECCourse_vid_3_working_version
        //that looks like this VV see below:   will remove a student and then add another student
        //          public void addStudent(String studentName) {
        //        if (studentsField.size() == maxStudentsField) {
        //            System.out.println("Course is full - can't add " + studentName);
        //            System.out.println("The maximum number of students is " + maxStudentsField);
        //        } else {
        //            //add the studentName
        //            studentsField.add(studentName);
        //        }
        //    }
        smallCourse.removeStudent("Eryn");
        smallCourse.addStudent("Blink");

        smallCourse.writeCourseInfo();
        //output:
        //Students enrolled:
        //Joe
        //Amanda
        //Blink
        //There are 3 students enrolled
        //The max number of students that can enroll in this course is 3
    }
}
//output:
//Course Name: Microcomputer Systems Maintenance
//Course Code: 1310
//Students enrolled:
//Anna
//Bill
//Carl
//There are 3 students enrolled
//The max number of students that can enroll in this course is 20
//Course Name: Data Communications
//Course Code: 1425
//Students enrolled:
//Dave
//Ed
//Flora
//There are 3 students enrolled
//The max number of students that can enroll in this course is 30
//Course Name: Software Development Projects
//Course Code: 2903
//Students enrolled:
//Larry
//Moe
//Curly
//June
//There are 4 students enrolled
//The max number of students that can enroll in this course is 24
//The total number of students enrolled in Software Development Projects course is 4
//ITEC 2903 Software Development Projects
