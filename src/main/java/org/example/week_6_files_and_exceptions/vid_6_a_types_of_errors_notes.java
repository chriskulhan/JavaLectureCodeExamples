/*
-Two broad types of errors: (slide 39)
    *Those that are outside our control (e.g. file IO, network operations,
        things that depend on user input or data from another source)
    *Those that are from coding errors (typically when programmer has made a mistake,
        like reading from non-existent array element)
-For errors outside our control: be prepared to handle errors with try-catch (then attempt to recover,
    or shut down gracefully) instead of letting your program crash
-For coding errors… attempt to avoid through good programming practices and thorough testing;
    consideration of as many possible circumstances as possible


Exceptions and Files (slide 40)

-Reading/writing files is one area where lots of things outside your control can go wrong:
    -What if the file doesn't exist?
    -You try and write to a read-only directory?
    -Another program is using the file?
    -Somebody or some other program changes/moves/deletes the file
    -Permission denied
    -Disk full
    -Plus lots of other ways to go wrong

-So it's important to anticipate possible errors and think about how you'll handle them
    *For example, what will your program do if it tries to open a certain file, but fails? Should it crash?
        Should it quit? Will it ask the user for another location to look for the file in? Or do something else?

Checked vs. Unchecked Exceptions (slide 42)

*checked exception*  Java FORCES you to deal with these exceptions:
-Outside our control errors - often throw a checked exception : Java makes you deal with checked exceptions.
    These are typically thrown in situations where your code interacts with something that has no control over
    -IOException  - your program can't stop a file being deleted/moved (when you add 'throws IOException' to psvm)
    -SQLException - your program can't stop the database server going down
    -Various data parsing exceptions (dates, XML, JSON…)
    -Others

*unchecked exceptions* Java doesn't FORCE you to deal with these exceptions:
-Coding errors: often from coding errors - these are unchecked exceptions. Java does not force you deal with
    unchecked exceptions. You should attempt to write code that doesn't throw these exceptions
    -NullPointerException
    -ArrayIndexOutOfBoundsException
    -ConcurrentModificationException
    -Various others

**How to deal with checked exceptions (because Java makes you):
(slide43)

-If you have a method which is likely to throw an exception, you can specify that in the method header

public static void Main(String args[]) throws IOException {

-Any code that calls that method must handle the exception, or it must declare that it will throw it to its own calling method
-The compiler will enforce this
-Many file-related methods declare that they throw IOException
-So code that uses these methods must handle IOExceptions, or declare that they will throw the exception to their
    calling method
-The idea is to remind programmers to handle IO errors -> better, less crashy code
-If Main throws an exception, then the program crashes – there's nothing left to handle this exception

slide 44:
-Hence, this. We are saying that we are not going to deal with IOException and we'll just let the program crash if
one happens. Try deleting test.txt and running this code to see what happens

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingApp {
	public static void Main(String[] args) throws IOException {

		FileReader reader = new FileReader("test.txt");
		BufferedReader bufReader = new BufferedReader(reader);
		String line = bufReader.readLine();

		while (line != null) {
			System.out.println(line);
			line = bufReader.readLine();
		}
		bufReader.close();
	}
}

*/

package org.example.week_6_files_and_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class vid_6_a_types_of_errors_notes {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("test.txt");
        BufferedReader bufReader = new BufferedReader(reader);
        String line = bufReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufReader.readLine();
        }
        bufReader.close();

        //output with errors:
        // /Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home/bin/java -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=55189:/Applications/IntelliJ IDEA.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/chriskulhanek/IdeaProjects/JavaLectureCodeExamples/target/classes:/Users/chriskulhanek/.m2/repository/edu/minneapolis/input-utils/1.0.2/input-utils-1.0.2.jar org.example.week_6_files_and_exceptions.vid_6_a_types_of_errors_notes
        //Exception in thread "Main" java.io.FileNotFoundException: test.txt (No such file or directory)
        //	at java.base/java.io.FileInputStream.open0(Native Method)
        //	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
        //	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
        //	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
        //	at java.base/java.io.FileReader.<init>(FileReader.java:60)
        //	at org.example.week_6_files_and_exceptions.vid_6_a_types_of_errors_notes.Main(vid_6_a_types_of_errors_notes.java:95)
        //
        //Process finished with exit code 1
    }
}



