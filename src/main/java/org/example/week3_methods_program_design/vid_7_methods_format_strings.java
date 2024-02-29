package org.example.week3_methods_program_design;

public class vid_7_methods_format_strings {
    public static void main(String[] args) {

        String college = "MCTC";
        String className = "Java Programming";
        int classCode = 2545;
        int credits = 6;
        double averageGrade = 84.545345;
        boolean isOnline = true;

        System.out.println("This class is " + classCode + " " + className + ". It is " +
                "taught at " + college + ". It is " + credits + " credits, the average " +
                "grade is " + averageGrade + "%. Is it online? " + isOnline + ".");
    //output:
        // This class is 2545 Java Programming. It is taught at MCTC. It is 6 credits,
        // the average grade is 84.545345%. Is it online? true.

        //use string formatting
        //souf = shortcut for System.out.printf();
        //%d = int
        //%s = String
        //%f = double

        System.out.printf("This class is %d %s. It is taught at %s. It is %d credits, " +
                " the average grade is %f%%. Is it online? %s \n", classCode, className, college, credits,
                averageGrade, isOnline);
        //output: This class is 2545 Java Programming. It is taught at MCTC. It is 6 credits,
        // the average grade is 84.545345. Is it online? true

        //need to use "\n" to put this on a new line (Above)
        System.out.printf("The average grade is %f%%\n", averageGrade);
        //output:The average grade is 84.545345%

        //to round to a certain number of decimal places (here 3), add ".3" after the % symbol before the f:
        System.out.printf("The average grade is %.3f%%\n", averageGrade);
        //output:The average grade is 84.545%
    }
}
