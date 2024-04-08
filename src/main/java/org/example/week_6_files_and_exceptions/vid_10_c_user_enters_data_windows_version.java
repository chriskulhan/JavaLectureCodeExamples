package org.example.week_6_files_and_exceptions;

import java.util.List;

import static input.InputUtils.stringInput;

public class vid_10_c_user_enters_data_windows_version {
    //from Clara's code: https://github.com/claraj/Java2545Examples/blob/main/src/main/java/week6_files_exceptions/UserEntersData_WindowsVersion.java

    public static void main(String[] args) {
        //check to see if a user's data is within a set of choices:

        // Example: enter your version of Windows. Only "XP", "7", "8" and "10" are acceptable.

        List<String> windowsVersions = List.of("XP", "7", "8", "10");

        //string.join joins all things in a list into a string
        String windowsVersionsString = String.join(", ", windowsVersions);   // "XP, 7, 8, 10"

        String version = stringInput("Enter your version of Windows from these choices: " + windowsVersionsString).toUpperCase();

        //while NOT windowsVersions contains the version
        //another way to write the just below VV : while (windowsVersions.contains(version) == false)
        //while the below conditions is true (that the Windows version is NOT XP, 7, 8 or 10, the loop will continue
        while (!windowsVersions.contains(version)) {
            version = stringInput("Not a recognized version. " +
                    "Enter your version of Windows from these choices: " + windowsVersionsString).toUpperCase();
        }

        System.out.println("Thanks, your Windows version is " + version);
    }
}
}
