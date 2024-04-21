package org.example.week_7_object_oriented_programming.ITECCourseManager;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse_vid_3_working_version {

    //**Stores the name, code, as list of students who are enrolled, and the max students allowed
    //create fields (also called data, instance variables) that one ITEC course needs to store:
    //why aren't these "private?", added soon.

    private String nameField;
    private int codeField;
    //example 1150
    private List<String> studentsField;
    //list of student names
    private int maxStudentsField;

    public String getNameField() {
        return nameField;
    }

    public void setNameField(String nameField) {
        this.nameField = nameField;
    }

    public int getCodeField() {
        return codeField;
    }

    public void setCodeField(int codeField) {
        this.codeField = codeField;
    }

    public int getMaxStudentsField() {
        return maxStudentsField;
    }

//    public void setMaxStudentsField(int maxStudentsField) {
//        this.maxStudentsField = maxStudentsField;
//    }
    //add a check to setMaxStudents:
    public void setMaxStudentsField(int maxStudentsField) {
        if (maxStudentsField < 0){
            return; //ignore this invalid value
        }
    this.maxStudentsField = maxStudentsField;
    }

//***add constructor here (step 7 in vid_3_notes_and_order_of_operations):

    //constructors have to have the same name as the class here: "ITECCourse_vid_3_working_version"
    //will have arguments that correspond to the variables/data/instance variables above.
    //so: nameField will have argument/parameter: courseName with type String
    //codeField will have argument/parameter: courseCode with type int
    //and maxStudentsField will have argument/parameter: courseMaxStudents with type int
    //
    public ITECCourse_vid_3_working_version(String courseName, int courseCode, int courseMaxStudents) {
        nameField = courseName;
        codeField = courseCode;
        maxStudentsField = courseMaxStudents;
        //now check vid_3_c_ITEC_course_manager_with_objects_cleaned_up
        //there is some red squiggles there now.

        studentsField = new ArrayList<>(); //add this <<< to replace vvv
        // if (studentsField == null) {
        //initialize the variable here (make the arraylist)
        //from the "void addStudent" method just below
    }

    //need to write a method to add a student:
    public void addStudent(String studentName) {
        if (studentsField.size() == maxStudentsField) {
            System.out.println("Course is full - can't add " + studentName);
            System.out.println("The maximum number of students is " + maxStudentsField);
        } else {
            //add the studentName
            studentsField.add(studentName);
        }
    }

    //added removeStudent from clara's code https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week7_first_classes/OOPITECCourseManager_AccessModifiers/ITECCourseManager.java

    //will have one argument: "String studentName"
    public void removeStudent(String studentName) {
        if (studentsField.contains(studentName)) {
            studentsField.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + this.nameField);
        } else {
            System.out.println(studentName + " was not found in " + this.nameField);
        }
    }

    //remove "static" and the objects "String name, int code, ArrayList<String>students, int maxStudents" from the first line:
    //from: public static void writeCourseInfo(String name, int code, ArrayList<String>students, int maxStudents) {
    // (because this is going to be part of the "ITECCourse_vid_3_working_version" object/class and will have the variables
    //already inside this class (nameField, codeField, studentsField,etc.)

    //to this: (I added "Field" after each field for now so I can understand what is going on, so from 'name' to 'nameField');
    public void writeCourseInfo() {
        System.out.println("Course Name: " + nameField);
        System.out.println("Course Code: " + codeField);
        System.out.println("Students enrolled:");
        for (String student : studentsField) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is " + maxStudentsField);
    }
//    public static int getNumberOfStudents(ArrayList<String> studentsField) {
//        return studentsField.size();
//
//}

    //remove "public static" from the above to:
    //change 'students' to 'studentsField' so the variables all match (for my learning)
    //remove argument 'ArrayList<String> studentsField' because it will be called for an
    //  'ITECCourse_vid_3_working_version' object

    //so go from:
//    int getNumberOfStudents(ArrayList<String> studentsField) {
//        return studentsField.size();
//    }

    //to this:
     public int getNumberOfStudents() {
            return this.studentsField.size();
        }
}